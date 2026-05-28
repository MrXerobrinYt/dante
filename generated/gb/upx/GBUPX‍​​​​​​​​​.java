/*
 * Decompiled with CFR 0.152.
 */
package generated.gb.upx;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b {
    public static volatile /* synthetic */ String[] GBUPX\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;

    public static /* bridge */ /* synthetic */ String GBUPX\u200f\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(byte[] byArray, String string, String string2) {
        byte[] byArray2 = new byte[]{116, -35, -43, -61, 35, -21, 90, -76, -124, -107, -55, -22, -71, -43, -16, 93};
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
        GBUPX\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b = new String[]{GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-56, -54, -67, -60, 41, -57, -47, 124, -91, 88, 102, 83, 100, 86, -116, 21}, "EVlUl5kcHpGTPJpAtGfpLAstK5ZiWCvV", "7Oyh/SyR22uER08oXm+TOg=="), GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-17, 62, -34, 40, -113, 11, 109, -111, 60, -10, -126, 58, 35, 73, 24, 9}, "Dp9hOU8JKBlK5X9cEIwmdivVcRj7qzgj", "6i2EJbAq"), GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{49, 68, -107, 90, -66, 111, 25, -96, -21, 43, -25, -5, -114, -11, 118, -124}, "A7NJQE5VV9wT6GaS1XayO6dTKMSyMk6c", "HBy6dIpYc5vSdg=="), GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{106, -123, -32, 48, 18, -90, 82, 99, 40, 109, 53, -66, -71, 38, 126, -37}, "b875PtGb4h5zHyFZfvZILZymyEu6zavI", "Z875cyegZmhzaw=="), GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-40, 47, 92, -122, 112, -111, -57, -60, 73, 49, -61, -50, -13, -10, -40, 123}, "Wyc7yHLjL7vDEdv1VtkgACqvng42b3mJ", "+iZb0H28+dY="), GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-13, -52, -10, 63, -23, -73, 104, -113, -28, -75, 95, -65, 98, -14, -102, 85}, "PowQGXmXuSmCYUkE5vZzScuACVH7uFv0", "18b5GtudYKS+il2dX86fd+nJySbVunnhyIF97XTAwhXNxA=="), GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-1, -125, -20, -27, 111, 59, 5, 64, 42, 46, 126, 72, -128, -96, -62, -70}, "TIdG26rAh6H17G9QvsR0lXakKxbIKV4d", "jrmlhy4jDWgy"), GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{119, 116, 62, -43, 27, 36, 74, -95, 68, -5, -94, -27, 16, -47, 74, -46}, "atNsyBkNwkyMvsleK1x6EbLVlIMl5SYo", "cXUZiBcWRY5H9anQSNFDxUogNM09KWiZTdGb4Ers"), GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{1, -34, 30, -96, 102, -110, 0, -30, 44, 87, -112, -107, -21, 66, 32, 11}, "BYAXdcZmNsZY3E6GummoJvCQEOwYBDLm", "LPc+m2uFI9ARR7ipvWk="), GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{4, 15, 4, -53, 66, 69, -62, 44, 124, 18, -117, -40, 42, 50, 117, 25}, "P4AxwOndj9Kk2wFduWfx6iLoLwpV3YdY", "JFQ22kFjwyZJSaHQcyJBEgQ2Bg=="), GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-124, -115, -22, -2, -72, -9, -116, 51, 47, -9, -76, 15, 59, 83, 82, 17}, "iSOg20e02Zuh3jgCtQdKH72eT6RyR6vV", "nbHW8P6uhm1CxbQKaVc="), GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-94, -40, 75, -82, -25, -8, 60, -28, 31, -26, 124, 34, -40, -121, -65, 0}, "Mt0rIOfjuKjv2HmJZP9WXTTeCnWD2x6G", "ucUUsM/DM+EEjXkyyry3KY36G43GjEuwbQ=="), GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-3, -127, -4, -23, 47, 104, 44, 11, -73, -109, -28, 9, -118, 40, -92, -37}, "Aobzl9tNofMfWeREC9Z9vacrOShcuv3B", "koT/4Q=="), GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{71, 62, 29, 113, 56, 55, 26, 4, -28, 37, -111, 52, 29, 6, 8, 44}, "eStwXd0ZEbWZo5b57621fuzZ7XyG66lU", "DBgZfg=="), GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{30, -63, 5, 13, 98, 91, 59, 67, 7, -67, -3, 78, 98, 109, 119, 29}, "HyJUJi7WjzZJ28XFR47s6OE5gEnpWbaA", "Mc0mdl1CaHUZotV8fidKKDmZRlAmcQ0CAYrn"), GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{54, -13, 74, -97, 92, 72, 39, -57, -67, 122, -23, -22, -6, 55, -36, 103}, "6xaAzOyhAMaPjpm0rlOj4DipesImsh1e", "dftT8FZmPcTSXfvV/g=="), GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{25, 103, 28, 20, -128, 64, -101, 35, -65, -78, 59, -18, 114, 39, -44, -3}, "JQg18GnezXLyEWQuW5SmGkcuehHNoJZk", "NEMSC813kSexjwXvGR3q7Cc0JhqmX5E5tKldxW8f4eR9XBpXlnGQNKyMHvRWBOznIA=="), GBUPX\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{12, 122, 102, 8, -10, 85, -53, 17, -124, 34, -26, -33, 65, 6, -59, -72}, "BRYXa32FABS6g3w9odF3CX852VKn0Rz8", "GEFQPPYSkDirQNqPBkbX4hZsSU/MLdAUgA==")};
    }
}

