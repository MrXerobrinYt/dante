/*
 * Decompiled with CFR 0.152.
 */
package generated.gb.upx;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class GBUPX\u200c\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b {
    public static volatile /* synthetic */ String[] GBUPX\u200d\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;

    public static /* bridge */ /* synthetic */ String GBUPX\u200b\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(byte[] byArray, String string, String string2) {
        byte[] byArray2 = new byte[]{37, 117, -106, -29, -47, 115, -109, -10, 111, 87, 88, -76, -18, -37, -51, 65};
        for (int i = 0; i < byArray.length; ++i) {
            int n = i;
            byArray[n] = (byte)(byArray[n] ^ byArray2[i % byArray2.length]);
        }
        byte[] byArray3 = string.getBytes(StandardCharsets.UTF_8);
        byte[] byArray4 = Base64.getDecoder().decode(string2);
        for (int i = 0; i < byArray4.length; ++i) {
            int n = i;
            byArray4[n] = (byte)(byArray4[n] ^ byArray2[i % byArray2.length]);
            int n2 = i;
            byArray4[n2] = (byte)(byArray4[n2] ^ byArray[i % byArray.length]);
            int n3 = i;
            byArray4[n3] = (byte)(byArray4[n3] ^ byArray3[i % byArray3.length]);
        }
        return new String(byArray4, StandardCharsets.UTF_8);
    }

    static {
        GBUPX\u200d\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b = new String[]{GBUPX\u200c\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{81, -6, 102, -8, -10, 50, -75, -106, 1, 70, 48, 55, 67, -115, -6, 18}, "GTwTmR5Xax2wUTHg4K7JGu4UO1Wwmo3A", "V81yyesU"), GBUPX\u200c\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-119, -24, 111, -119, -111, -68, -65, -31, 46, -98, 47, 48, 17, -81, 48, -45}, "M5D0P7mVA1czjf6derOzIFmw6Tlfw7SE", "sLhTze77vtYGwQ=="), GBUPX\u200c\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{118, -99, -48, -62, -120, -23, -88, 82, 26, -95, -63, 90, 84, 113, -112, 16}, "aK2BUFRHhiWaUUMldPA1G7G7cqjzzP6m", "ObyD8g=="), GBUPX\u200c\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{77, 109, -80, 48, 86, 95, 119, -34, -47, 25, -37, 35, 84, 79, -67, 11}, "PHJcVKnFLBzjAPHQqxU5WukvbfDsRwqa", "fEueIW99fQ=="), GBUPX\u200c\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{91, 39, -124, -122, 106, -61, -127, 94, -49, 3, 102, -20, -47, 42, -6, -28}, "Sg7eED7OA3dhqF1HxTprU18gzcP1EFHJ", "fCXLl1r102KhXG3lxAWlywwVnYZMhpZRwA1Xs7oc3Mk="), GBUPX\u200c\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{116, -52, -61, 4, -35, -99, 103, -57, -37, -47, -47, -84, 116, -88, 65, -13}, "ULDGt44SQBcv71q5UdWFarfExspH7Yky", "VPDjIt3MIew="), GBUPX\u200c\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-69, -2, 91, -28, -16, -123, -77, 90, -120, 91, 84, -47, 80, 86, -51, -88}, "hASS9QDb7AXfA9TOPLjNFRGY7BXpGOrS", "hdZn26ignlfROmPRMRz8hJ7AWN7P99cxjQ=="), GBUPX\u200c\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-44, 16, 40, -39, 21, -75, -68, 42, -5, -126, 8, 16, -105, -93, -14, 120}, "lK1uofur68Q8urqYgiDIhomxn00RNsbH", "3y5wgg+jrTm53ytQzKLmU8UcHr4etb888NFMK7a+vlbZMnXJHg=="), GBUPX\u200c\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{43, -43, 1, -76, 57, 117, 108, 57, -47, -1, 8, 1, -58, 99, 8, -20}, "V7oks5dYx2zT4QY8V5ne4ER7ZA1Fv1KD", "EpIPvCM0cT/argAwl1w="), GBUPX\u200c\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{55, 115, -54, 18, 22, 18, 93, -109, -20, 67, -7, 2, -46, 92, -81, 116}, "MIul742hYbyKcw5Nd3mUJ4GZu9cp7qL2", "ClXMF1VPAJXqTuIj1Eju"), GBUPX\u200c\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-8, 21, -53, 22, -111, -100, -45, 61, 71, 81, -69, 65, 43, -38, 119, -122}, "LfdWgD1Dd5CVE6F9g6mAnc4FX7qI65HA", "2wPOIp+smyZXDJFlCg=="), GBUPX\u200c\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{44, 66, -63, -106, 116, 55, -16, 42, -64, 29, -64, -59, -86, -113, 9, 76}, "flGc6bNvdXDQP2trCSz13HAWWuJ80cAO", "GWbH2HBgiA=="), GBUPX\u200c\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-78, -100, -85, -59, 106, -96, -105, 111, 125, 56, -87, -114, -61, 5, 21, 24}, "oSeExZFOusHuNzeljleR02jx3fFwhZKO", "urqnrmeKtUF8LpODow0VB7eFvPQ/4px0JS3BjNs7PyO4"), GBUPX\u200c\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{40, -122, -91, -2, 15, 118, 39, -104, -99, -19, 45, -128, 71, -25, -53, -37}, "ODhKz88nq5AxgnyVfU01jKbYo14UmORN", "E6qkxxE+foSYoQ=="), GBUPX\u200c\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-78, 68, 88, -72, -30, 19, -3, -22, -44, 123, 95, 84, -13, 77, 1, 11}, "44gH4BzZfJjsGmkdKpxbGeQFCVjBY2Sm", "4BFdgr8yqtHCWA=="), GBUPX\u200c\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-128, 123, -94, 58, -75, -58, 50, 20, 2, -33, 94, -5, 120, 49, 54, -124}, "vJllY6AVXy2sdYKmZFPp2tjoqIG7VQ5e", "kUSneJmAFyMuwx7wMgUSjbNbmynmxjEUHeU3qVwSbJPYW68kwoYWMDPABet9HBSGtA=="), GBUPX\u200c\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{28, -91, 43, -120, 27, -1, -29, -9, 115, 17, 94, 108, 15, -128, 62, 93}, "EgmBRDqq4NeOteGs7JFcPLkLXDOmgXQG", "Prcv5DzL9uczOklbVYgWSkKJBIgqx+HURSY/ZBqqAGh3qie5IZXk4zU2XUoYhA1HRIE="), GBUPX\u200c\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-92, 61, -21, -74, 2, 115, -71, 66, 87, -37, -81, -107, 73, -69, -89, -10}, "0YdxucukgrvwfooTfcEWHaWHBict50UC", "wg3gohZkpUZeibaED6etwbcsx5UzMs06Ig==")};
    }
}

