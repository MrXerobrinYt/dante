/*
 * Decompiled with CFR 0.152.
 */
package generated.gb.upx;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b {
    public static volatile /* synthetic */ String[] GBUPX\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;

    public static /* bridge */ /* synthetic */ String GBUPX\u200e\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(byte[] byArray, String string, String string2) {
        byte[] byArray2 = new byte[]{19, 90, -9, 80, -94, 106, -54, -23, 5, 43, 61, -29, -10, -86, 49, 2};
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
        GBUPX\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b = new String[]{GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{56, 72, -38, -16, -34, -51, -124, -106, -2, 4, -36, -13, 30, -108, 93, -70}, "IY4SuFEW9oulPrdSJENOY2Am22tAh5Gi", "EGKdxt/47uS0RIzs"), GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{17, -83, -12, -118, -73, 73, 100, -56, 77, -33, -117, -123, -95, -50, 90, 24}, "e44fdrpHiuxLlAvUGzZbejjoZFewbOI6", "Ieqlnv56c+VK3g=="), GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{97, 50, 52, -105, -115, 53, 38, 123, -62, -44, 30, 4, -98, -105, -88, 83}, "k0abk1StdOvdDNcsdTbBMHU6kjo1pi3n", "R20vnIpoFCCTtVhA8o6iTmEJIabgMydtn5BDDs6p1Go8Nm7VlHJPPp+1WEn6nq5Dbgl55/BMQ32YjkAVqJfpWGxtLdrXPVs/"), GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{9, -16, -124, 100, -61, -57, 10, 76, 122, 116, 68, -54, -18, -115, -44, 78}, "2R8Ebzp5QXIORgObJjtfc9fxIC3bHeOV", "XcPeU8jeVBRESCPvz4X1"), GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{66, 86, 12, 107, -86, -30, 24, 97, -3, -7, 70, 33, -70, -10, 16, 38}, "nQNBd2kCVnKVVEdipswfyVFbs9tXQxY8", "WXcmSLq1AVo="), GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-12, 27, -16, 111, 52, -88, 1, 103, -34, 110, 51, -78, -85, -78, -47, 86}, "m7GKbXuBMDC3r4J0OIy7pB2XQsAQ59xU", "7UnPUCOCEVa8Rh/gve/1AZQ04Co3nhxQ7XcXgOql2W3+"), GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{52, 3, 72, 7, 73, 32, -31, 53, 39, -102, -113, 42, 112, -72, 84, 103}, "Z9N1i4gMKDULxcwF3xHnAVeAs6zOdrNJ", "CU9vGFVk4hkYu6geJrdKQ3UacgBtBaoRJt6aFzqie14GFHBTUn3gEQ+/rg9ntQ=="), GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{88, -126, 91, -77, -94, 23, 11, -121, -46, -12, 116, 43, -44, -103, -114, -91}, "DftuYUS0mNUEMbS3mKRUJy2XTIaXOOVm", "c5ROpZI2IejM2VML/JU="), GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{117, 32, -36, -12, 114, -37, -35, -40, 63, -44, -44, 45, 31, -15, -94, -44}, "5ButLcvSJh11fg8AmqnIxktciYP3mKm9", "LxLI41fM0tQG2YZzF/I="), GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-51, 62, -91, -103, -126, -113, -65, -4, 57, 13, 124, -44, -52, -47, 124, 65}, "BiLH4uPkRJ9N6iFOciC9Dk9SHyFzcMBC", "/ziauMKTgPk0KCfwn9tO"), GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-69, 39, -67, -39, -70, -81, -82, -62, -7, -16, -120, -11, -61, 47, 87, -84}, "OQ4at1bRWSxOt2QCB893TxpOGAFLLUyC", "kwPglrvuqPHaxoLCmW9jnJZq9omLp7/u1cLg3P0IQZ3aDODI4Oip4sfFmdnWaW+Alw=="), GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{90, 37, -68, -3, 39, -117, 3, -97, 99, -77, -113, -112, 1, -22, 46, 74}, "scNXMUwT4jSTqQIWCI3D2UefXGbjXYiX", "XyOA1gOxGg=="), GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-124, -93, -4, -93, -46, 79, -112, 52, -128, -29, -91, 59, 5, -113, -104, 47}, "ypYFCgLAhrwx5J9zz537CbQvUZv0RdTB", "zP2Uy6E="), GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{2, -102, 104, 55, 77, 39, -52, 15, 90, 32, -38, 69, -42, -68, 81, 7}, "GkAlDi6mmZNqYePLzHLaUVsKvwtrh973", "IoRAdXw+ngNDH+ZMoapkOQ63Vnh7HtEqSTTaXtHrSFIkmEU+bQ=="), GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-18, 59, 19, -124, -66, 67, -4, 119, 104, -92, -84, -91, 40, -47, 99, -7}, "PdViUp5arLrEna3hit9k8iNB5RfCHnWd", "6DYqgYpHoHl0yLGGZsM18vI9Q5v/CpEFaA=="), GBUPX\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-34, 30, 115, 87, -111, 81, 102, 54, 15, -49, 119, -55, 12, -29, -57, 65}, "31u0h2XpQvj9Y9eijWCdRHCZWLFxWyeY", "ilpvSYwTWicq3G+Ie7fNTN0vWVCibUwDNvAfxCv+w2yI")};
    }
}

