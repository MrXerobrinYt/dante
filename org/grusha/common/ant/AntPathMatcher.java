/*
 * Decompiled with CFR 0.152.
 */
package org.grusha.common.ant;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AntPathMatcher {
    public static final String DEFAULT_PATH_SEPARATOR = "/";
    private static final char[] WILDCARD_CHARS = new char[]{'*', '?', '{'};
    private String pathSeparator;
    private boolean caseSensitive;
    private boolean trimTokens;

    public AntPathMatcher(String pathSeparator) {
        this.pathSeparator = pathSeparator;
        this.caseSensitive = true;
        this.trimTokens = false;
    }

    public AntPathMatcher() {
        this(DEFAULT_PATH_SEPARATOR);
    }

    public void setPathSeparator(String pathSeparator) {
        this.pathSeparator = pathSeparator != null ? pathSeparator : DEFAULT_PATH_SEPARATOR;
    }

    public void setCaseSensitive(boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    public void setTrimTokens(boolean trimTokens) {
        this.trimTokens = trimTokens;
    }

    public boolean isPattern(String path) {
        if (path == null) {
            return false;
        }
        boolean uriVar = false;
        for (int i = 0; i < path.length(); ++i) {
            char c = path.charAt(i);
            if (c == '*' || c == '?') {
                return true;
            }
            if (c == '{') {
                uriVar = true;
                continue;
            }
            if (c != '}' || !uriVar) continue;
            return true;
        }
        return false;
    }

    public boolean match(String pattern, String path) {
        return this.doMatch(pattern, path, true, null);
    }

    public boolean matchStart(String pattern, String path) {
        return this.doMatch(pattern, path, false, null);
    }

    public String extractPathWithinPattern(String pattern, String path) {
        String[] patternParts = this.tokenizeToStringArray(pattern, this.pathSeparator, this.trimTokens, true);
        String[] pathParts = this.tokenizeToStringArray(path, this.pathSeparator, this.trimTokens, true);
        StringBuilder builder = new StringBuilder();
        boolean pathStarted = false;
        for (int segment = 0; segment < patternParts.length; ++segment) {
            String patternPart = patternParts[segment];
            if (patternPart.indexOf(42) <= -1 && patternPart.indexOf(63) <= -1) continue;
            while (segment < pathParts.length) {
                if (pathStarted || segment == 0 && !pattern.startsWith(this.pathSeparator)) {
                    builder.append(this.pathSeparator);
                }
                builder.append(pathParts[segment]);
                pathStarted = true;
                ++segment;
            }
        }
        return builder.toString();
    }

    public Map<String, String> extractUriTemplateVariables(String pattern, String path) {
        LinkedHashMap<String, String> variables = new LinkedHashMap<String, String>();
        boolean result = this.doMatch(pattern, path, true, variables);
        if (!result) {
            throw new IllegalStateException("Pattern \"" + pattern + "\" is not a match for \"" + path + "\"");
        }
        return variables;
    }

    private boolean doMatch(String pattern, String path, boolean fullMatch, Map<String, String> uriTemplateVariables) {
        String pattDir;
        int pathIdxStart;
        if (path == null || path.startsWith(this.pathSeparator) != pattern.startsWith(this.pathSeparator)) {
            return false;
        }
        String[] pattDirs = this.tokenizeToStringArray(pattern, this.pathSeparator, this.trimTokens, true);
        if (fullMatch && this.caseSensitive && !this.isPotentialMatch(path, pattDirs)) {
            return false;
        }
        String[] pathDirs = this.tokenizeToStringArray(path, this.pathSeparator, this.trimTokens, true);
        int pattIdxStart = 0;
        int pattIdxEnd = pattDirs.length - 1;
        int pathIdxEnd = pathDirs.length - 1;
        for (pathIdxStart = 0; pattIdxStart <= pattIdxEnd && pathIdxStart <= pathIdxEnd && !"**".equals(pattDir = pattDirs[pattIdxStart]); ++pattIdxStart, ++pathIdxStart) {
            if (new AntPathStringMatcher(pattDir, this.caseSensitive).matchStrings(pathDirs[pathIdxStart], uriTemplateVariables)) continue;
            return false;
        }
        if (pathIdxStart > pathIdxEnd) {
            if (pattIdxStart > pattIdxEnd) {
                return pattern.endsWith(this.pathSeparator) == path.endsWith(this.pathSeparator);
            }
            if (!fullMatch) {
                return true;
            }
            if (pattIdxStart == pattIdxEnd && pattDirs[pattIdxStart].equals("*") && path.endsWith(this.pathSeparator)) {
                return true;
            }
            for (int i = pattIdxStart; i <= pattIdxEnd; ++i) {
                if (pattDirs[i].equals("**")) continue;
                return false;
            }
            return true;
        }
        if (pattIdxStart > pattIdxEnd) {
            return false;
        }
        if (!fullMatch && "**".equals(pattDirs[pattIdxStart])) {
            return true;
        }
        while (pattIdxStart <= pattIdxEnd && pathIdxStart <= pathIdxEnd && !(pattDir = pattDirs[pattIdxEnd]).equals("**")) {
            if (!new AntPathStringMatcher(pattDir, this.caseSensitive).matchStrings(pathDirs[pathIdxEnd], uriTemplateVariables)) {
                return false;
            }
            --pattIdxEnd;
            --pathIdxEnd;
        }
        if (pathIdxStart > pathIdxEnd) {
            for (int i = pattIdxStart; i <= pattIdxEnd; ++i) {
                if (pattDirs[i].equals("**")) continue;
                return false;
            }
            return true;
        }
        while (pattIdxStart != pattIdxEnd && pathIdxStart <= pathIdxEnd) {
            int patIdxTmp = -1;
            for (int i = pattIdxStart + 1; i <= pattIdxEnd; ++i) {
                if (!pattDirs[i].equals("**")) continue;
                patIdxTmp = i;
                break;
            }
            if (patIdxTmp == pattIdxStart + 1) {
                ++pattIdxStart;
                continue;
            }
            int patLength = patIdxTmp - pattIdxStart - 1;
            int strLength = pathIdxEnd - pathIdxStart + 1;
            int foundIdx = -1;
            block6: for (int i = 0; i <= strLength - patLength; ++i) {
                for (int j = 0; j < patLength; ++j) {
                    String subPat = pattDirs[pattIdxStart + j + 1];
                    String subStr = pathDirs[pathIdxStart + i + j];
                    if (!new AntPathStringMatcher(subPat, this.caseSensitive).matchStrings(subStr, uriTemplateVariables)) continue block6;
                }
                foundIdx = pathIdxStart + i;
                break;
            }
            if (foundIdx == -1) {
                return false;
            }
            pattIdxStart = patIdxTmp;
            pathIdxStart = foundIdx + patLength;
        }
        for (int i = pattIdxStart; i <= pattIdxEnd; ++i) {
            if (pattDirs[i].equals("**")) continue;
            return false;
        }
        return true;
    }

    private boolean isPotentialMatch(String path, String[] pattDirs) {
        if (!this.trimTokens) {
            int pos = 0;
            for (String pattDir : pattDirs) {
                int skipped = this.skipSeparator(path, pos, this.pathSeparator);
                if ((skipped = this.skipSegment(path, pos += skipped, pattDir)) < pattDir.length()) {
                    return skipped > 0 || pattDir.length() > 0 && this.isWildcardChar(pattDir.charAt(0));
                }
                pos += skipped;
            }
        }
        return true;
    }

    private int skipSegment(String path, int pos, String prefix) {
        int skipped = 0;
        for (int i = 0; i < prefix.length(); ++i) {
            char c = prefix.charAt(i);
            if (this.isWildcardChar(c)) {
                return skipped;
            }
            int currPos = pos + skipped;
            if (currPos >= path.length()) {
                return 0;
            }
            if (c != path.charAt(currPos)) continue;
            ++skipped;
        }
        return skipped;
    }

    private int skipSeparator(String path, int pos, String separator) {
        int skipped = 0;
        while (path.startsWith(separator, pos + skipped)) {
            skipped += separator.length();
        }
        return skipped;
    }

    private boolean isWildcardChar(char c) {
        for (char candidate : WILDCARD_CHARS) {
            if (c != candidate) continue;
            return true;
        }
        return false;
    }

    private String[] tokenizeToStringArray(String str, String delimiters, boolean trimTokens, boolean ignoreEmptyTokens) {
        if (str == null) {
            return new String[0];
        }
        StringTokenizer st = new StringTokenizer(str, delimiters);
        ArrayList<String> tokens = new ArrayList<String>();
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (trimTokens) {
                token = token.trim();
            }
            if (ignoreEmptyTokens && token.isEmpty()) continue;
            tokens.add(token);
        }
        return tokens.toArray(new String[0]);
    }

    private static class AntPathStringMatcher {
        private static final Pattern GLOB_PATTERN = Pattern.compile("\\?|\\*|\\{((?:\\{[^/]+?}|[^/{}]|\\\\[{}])+?)}");
        private static final String DEFAULT_VARIABLE_PATTERN = "(.*)";
        private final Pattern pattern;
        private final List<String> variableNames = new LinkedList<String>();

        public AntPathStringMatcher(String pattern) {
            this(pattern, true);
        }

        public AntPathStringMatcher(String pattern, boolean caseSensitive) {
            StringBuilder patternBuilder = new StringBuilder();
            Matcher matcher = GLOB_PATTERN.matcher(pattern);
            int end = 0;
            while (matcher.find()) {
                patternBuilder.append(this.quote(pattern, end, matcher.start()));
                String match = matcher.group();
                if ("?".equals(match)) {
                    patternBuilder.append('.');
                } else if ("*".equals(match)) {
                    patternBuilder.append(".*");
                } else if (match.startsWith("{") && match.endsWith("}")) {
                    int colonIdx = match.indexOf(58);
                    if (colonIdx == -1) {
                        patternBuilder.append(DEFAULT_VARIABLE_PATTERN);
                        this.variableNames.add(matcher.group(1));
                    } else {
                        String variablePattern = match.substring(colonIdx + 1, match.length() - 1);
                        patternBuilder.append('(');
                        patternBuilder.append(variablePattern);
                        patternBuilder.append(')');
                        String variableName = match.substring(1, colonIdx);
                        this.variableNames.add(variableName);
                    }
                }
                end = matcher.end();
            }
            patternBuilder.append(this.quote(pattern, end, pattern.length()));
            this.pattern = caseSensitive ? Pattern.compile(patternBuilder.toString()) : Pattern.compile(patternBuilder.toString(), 2);
        }

        private String quote(String s, int start, int end) {
            if (start == end) {
                return "";
            }
            return Pattern.quote(s.substring(start, end));
        }

        public boolean matchStrings(String str, Map<String, String> uriTemplateVariables) {
            Matcher matcher = this.pattern.matcher(str);
            if (matcher.matches()) {
                if (uriTemplateVariables != null) {
                    if (this.variableNames.size() != matcher.groupCount()) {
                        throw new IllegalArgumentException("The number of capturing groups in the pattern segment " + String.valueOf(this.pattern) + " does not match the number of URI template variables it defines, which can occur if capturing groups are used in a URI template regex. Use non-capturing groups instead.");
                    }
                    for (int i = 1; i <= matcher.groupCount(); ++i) {
                        String name = this.variableNames.get(i - 1);
                        String value = matcher.group(i);
                        uriTemplateVariables.put(name, value);
                    }
                }
                return true;
            }
            return false;
        }
    }
}

