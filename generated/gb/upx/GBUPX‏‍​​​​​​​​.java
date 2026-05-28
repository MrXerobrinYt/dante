/*
 * Decompiled with CFR 0.152.
 */
package generated.gb.upx;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class GBUPX\u200f\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b {
    public static volatile /* synthetic */ String[] GBUPX\u200b\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;

    public static /* bridge */ /* synthetic */ String GBUPX\u200c\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(byte[] byArray, String string, String string2) {
        byte[] byArray2 = new byte[]{-22, -122, 61, 124, -38, -100, 101, 69, -24, -70, 32, 98, 120, 74, -12, -29};
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
        GBUPX\u200b\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b = new String[]{GBUPX\u200f\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-99, 32, -125, 17, 95, 7, -17, -13, -48, -88, -89, -28, 52, 127, -114, 17}, "bbc64NqD8A0rZS94OfdJepD4U9b0t63O", "zGzQCVs="), GBUPX\u200f\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{38, 63, 119, 47, -102, -75, 66, 48, 105, -48, -86, 75, -24, -51, 8, -32}, "Lkcjl16WrBNLZtKXNVxJuHcVEch6ZtC9", "IwdbaM68QV42ow=="), GBUPX\u200f\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-127, 126, 20, -32, 121, 76, 125, -116, -2, 81, -63, 99, 17, -25, 44, -35}, "7fYSkYxoZFEruNDkx5vclgKn2XsVqxzc", "23cpwA=="), GBUPX\u200f\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{66, 120, 63, 78, -119, 11, 59, 11, 75, 34, -26, 111, -55, -43, 37, -15}, "g9KnjHcrD58uEfolthyW3i5yB94U8Dms", "QyAWUoogdhRgc/Bw/9wk"), GBUPX\u200f\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{42, -28, 44, -48, 119, 52, -90, -69, -10, -7, -124, -79, -88, 46, 24, 91}, "yESDlhTuAHX0uPFBx0RDd3w4JVw1CzAf", "J8QH4G4ul72Y3bPguRcwfn24EfN8KaHh2w=="), GBUPX\u200f\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{53, 66, 50, -74, 21, 64, -94, 3, 15, 99, -13, 90, -13, 125, 43, -70}, "bkb645uN7epnwUndARUf8U0SRhYjQmnM", "Ilk04VUQpTU="), GBUPX\u200f\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{111, -126, -86, -55, 110, -92, -95, 79, 90, 111, -87, 93, -101, -19, 13, 4}, "8vL7NR086OzX82HcMvWXLO82vqQma0mR", "I5GeilWE9ARDTLxkx7YrAA2AlfhQj7YSTnSdU47zEDgw"), GBUPX\u200f\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-71, 17, -27, -49, -44, -29, 111, -83, -102, -31, 118, -126, 14, 43, -30, 23}, "kY08ZUUGYFMqQQHrINayqmkI9jhD833F", "hCG6m+/CU4Wth1SVfwnPBoUt7cLcrifWlw=="), GBUPX\u200f\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-8, -101, 48, -75, -69, -10, -98, -96, 90, 124, 59, -90, -49, -39, 54, 20}, "geTrjyAPOYyGYgDK0sWjm9ABiteUtnMH", "75EXrqXmsJ5KRyOC/dkAML2GAw=="), GBUPX\u200f\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{68, -123, -88, 54, -24, 61, -10, -80, -20, 89, 10, 5, 91, -88, -86, -104}, "jkfDLibbDjxagiXQxzMG4wt8iXnBZ1Rj", "XoG9G9A9+7z3WwcJXa8="), GBUPX\u200f\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{34, -114, 30, 28, -92, 33, 28, -59, 0, 35, -87, -110, 76, -120, 1, 2}, "vimRvPp7yVnbJRJYYGxrd6ZhGhHnD2oF", "JIgAJ6YYA5wmGqWaY7k/"), GBUPX\u200f\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-102, 25, 36, 90, 90, 83, -52, -63, 58, -49, 124, 109, -94, -113, -57, -106}, "dDJMqN18YptYCuYO0slDyHyGT8m2PDXa", "0DcPZQ=="), GBUPX\u200f\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-94, -29, 79, -41, 0, 2, -20, -19, -38, 36, 59, 70, -108, -2, 32, 29}, "z3ynoIA8WO5jwYk9gxP9REWAQJAwhjxO", "rLhfyws7zKf5Eg=="), GBUPX\u200f\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{122, 14, -28, 93, 62, 123, 56, -124, 108, -115, -5, 59, -61, -80, -18, 120}, "Xk9BilP7808dYelhbQSL93OMSjtU7bqe", "cCCOSxZFPA=="), GBUPX\u200f\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{32, 21, -121, 24, -27, 30, -83, -107, -71, 63, 102, 120, 67, 104, -128, -49}, "EQKkBIej8Xjc14J9Dye0xxQO5rrnPUXn", "My2jH8YjoZDvR2N9Ui+vlREei1zkRt/qvw=="), GBUPX\u200f\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-31, -86, 3, 39, 94, -33, 0, 57, -12, 57, 11, 20, -37, 82, 62, -32}, "FBZFzCZN6OFoi4oCdA5xAivBlXios4sA", "wJ0wT1HsPha2Ez8DnAs+x+yNXzx+wh8U9hJMHtoUItOJhDYAQPkoWaADJBfW")};
    }
}

