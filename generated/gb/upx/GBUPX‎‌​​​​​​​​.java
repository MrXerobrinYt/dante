/*
 * Decompiled with CFR 0.152.
 */
package generated.gb.upx;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class GBUPX\u200e\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b {
    public static volatile /* synthetic */ String[] GBUPX\u200f\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;

    public static /* bridge */ /* synthetic */ String GBUPX\u200f\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(byte[] byArray, String string, String string2) {
        byte[] byArray2 = new byte[]{-90, 62, 99, -58, 24, 12, -82, 78, 107, -41, 13, 22, 42, 42, -16, 8};
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
        GBUPX\u200f\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b = new String[]{GBUPX\u200e\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-126, 112, 7, 26, -65, -78, -110, -87, -98, 68, 10, 92, 81, 10, -33, -18}, "dhgZR6CIfCLkuTzNDtLAbhIAN1WgC9tk", "vT0Tb8j3jMA="), GBUPX\u200e\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-71, -24, -9, 11, 78, -127, 95, 48, 80, -28, 59, 63, 86, -118, -50, 100}, "P16SVxb3RyqE5Z4NJZflKcXoztsu3x9D", "pLa7MXSVXCw3s3paS4eTRJfd5hQlrFN/HL56cUWluHff7fp4ao8HMjuzelNDl59JmN2+VTXTN28boHlqI5uFRY+2uXcpwBMz"), GBUPX\u200e\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-44, -125, -25, 1, -35, 8, -85, -45, -38, 103, -103, 105, 3, -112, 98, -48}, "HjAdbDoSg5mpnmNNXxoVzA4JPvHXnxBY", "6ZnCBMsptviQPpt4CZhe"), GBUPX\u200e\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{77, 81, 33, 59, -64, -56, 34, 122, -128, 62, 56, -99, -9, 32, -29, 8}, "U8ybQVnO5gCJ3CFMGszeRfNO2T54kG97", "NhMxKQ=="), GBUPX\u200e\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{87, -65, 104, -31, -74, -84, 23, -46, -7, 45, 83, 76, -4, -104, -43, -73}, "z8K63OmqxlWtPlmtOzsLELsmPZPnkleH", "WeJbo/CRH9CuLWtZyJ3WpDenes6YhxbQ3BlnDOea1w=="), GBUPX\u200e\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-85, -105, 55, 82, 94, 120, 49, 102, -95, -88, -92, -72, 85, 127, -99, 111}, "hddky24D8JVFZTfZYYLc2ouiPSAYBCgY", "toM3WFMvd1o="), GBUPX\u200e\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{126, -83, -8, 112, -105, -34, 38, -107, -119, -57, -115, -116, 33, -51, -99, -20}, "1RfcwxF73JCQGzM2qzBMIZXORyLGm3xB", "O5rmZ5XUBdGV4aG8At6+uSCj0lSs4FGyrtOgpWKOi8k="), GBUPX\u200e\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{43, 43, -110, -105, -24, 121, 44, -1, 21, -103, -116, 121, 2, -6, 6, 112}, "jy3yLBMVTkZtCaNzlm73HnTfsPBu8DUu", "JifIwNFLBcg1l6R1b+gteDEj14rDeBb3A6q6ZVXQfWMgO82LwA=="), GBUPX\u200e\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-109, 92, 70, 14, 99, 124, 12, -68, -117, -116, 88, 123, -76, 21, -117, 117}, "5C3cPcGNrz5SPslYQulXZPTulU6OHZ2b", "iHUUHw=="), GBUPX\u200e\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{2, -60, -45, 41, 52, -69, -88, -30, -49, -80, 124, 66, -16, -122, 69, 89}, "nvhIp2on7VK4TlHlxwpAimZEdo2PcpBR", "GNfDFBv6s+2Mk0Q="), GBUPX\u200e\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-65, 8, 84, 69, 7, 51, -18, -52, 82, -15, 94, 66, -126, 63, -52, 55}, "r7Jk2tJkMcb3XEluHFPeB3iJoQKSuVWS", "vVBtR0Euy8lA8F0SsR3SLYIgYA=="), GBUPX\u200e\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-54, 117, -66, -71, -71, 35, 80, -125, -118, 39, 117, -42, -104, 44, 16, 15}, "19Nd8CRNkmZgpALWiGQbQn59ChYJudSD", "iyODtPUJbaO+IlrciQM="), GBUPX\u200e\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{102, 97, -30, -106, 126, 122, 99, -52, 33, -115, -38, -26, -53, -113, -45, 77}, "6vtNU9wf351Ih1XW8AAJ744vmzWFdjTx", "N2L/9l4zcMtm3ZnXjczuaTFV0b8sPjbZJ4Sjxd2X6Ed+f/erQ21iz2DRjcbA3/9zMU4="), GBUPX\u200e\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-10, 80, 48, -111, 123, -1, -18, 75, 95, -100, 19, 63, -45, 19, -71, 31}, "4Vo8acBdl3KFPIR0CCCQMWsAcaRQmYKz", "7HMv0Q=="), GBUPX\u200e\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{20, 71, -60, 39, 69, 115, -31, -104, -74, -96, 56, -86, -107, 26, 39, 83}, "99JnS40hSEaDPuVgu1T13tgaVOYOE1L6", "fzvPDU8="), GBUPX\u200e\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{20, -96, -10, -32, 64, 36, 103, -63, 10, -20, 92, -32, -9, -45, 80, -15}, "xFLzZq1AkAB8pexPN6WpgSg7HfFCTvPL", "Oo/V9nshP+8PjXG+p8VNwi/kyOReVyPGcw=="), GBUPX\u200e\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-93, 107, 3, -83, 96, 5, -115, -61, -29, -73, -86, -39, 46, 96, 78, 26}, "U7QhdZaYdyGEgtF0X4ef3GniWidlYUvk", "0y9/4Hdxhvv1"), GBUPX\u200e\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200f\u200e\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-90, -108, -25, 73, -36, 34, -24, -123, 80, 26, 37, 0, -128, 44, 56, -12}, "ZlQDuKhCfDmFkzm33rbAcjsVv5DKxJAl", "m43fI9wZ5KdCOzo+xSQwtOCK8SbNLfe8R0tPOZ0VFu2Om9M=")};
    }
}

