/*
 * Decompiled with CFR 0.152.
 */
package generated.gb.upx;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b {
    public static volatile /* synthetic */ String[] GBUPX\u200d\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;

    public static /* bridge */ /* synthetic */ String GBUPX\u200d\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(byte[] byArray, String string, String string2) {
        byte[] byArray2 = new byte[]{-71, -11, 49, 100, 111, 30, 11, 113, -99, 42, 106, 37, -29, 19, 95, -76};
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
        GBUPX\u200d\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b = new String[]{GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{80, -81, -18, 44, -27, 125, -1, 33, -18, 53, 24, -34, 70, 11, -55, 91}, "G0ygPIEF3HBKLzyvj3rlYtiZeTrjyu6v", "f+vjO8YOlUivDTfmbwPGSEiy/y/RJuML7wAe0U1RiRlIr8h7mnDVELMRNfRuAvxESeiyKs9m+A=="), GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{99, -97, -13, 6, 39, -103, -99, 121, 121, 126, -35, 102, -57, -62, -65, 77}, "c7iQkNbUguP02xogHJrGvmOsleFsr69Z", "Q8f0Iym5iwFKcv0z"), GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{117, -5, 12, -15, 101, -74, 108, -69, -81, 76, -64, -117, 5, -32, 78, 15}, "mp8Qe4MVP3lKIYPXju3xpsZacab9yhuB", "deRQ0w=="), GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-72, -10, 64, 11, 116, 41, -124, 0, -101, 14, 99, -92, 35, 14, -128, 126}, "ApCIJgXcT3i42GEcJxJUSUWmOnlKIf5e", "mPZzbFIvqQ2sVW/iPzu1cA=="), GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-39, 51, -53, -86, -68, 43, 33, 57, 0, 45, -107, -121, -8, 93, -66, 8}, "9NfpxHJTBXJne01wvk5K3g8O4GL6sZH4", "lQ3Ju7AGGRU="), GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-89, 64, 93, 68, 27, -84, -61, 96, -58, 27, -97, 108, -108, -60, -13, 23}, "G5DibC3JNZcnVw4njqF19lY5i02nLGjI", "lBBhWQydlVmnLZNjptqpHuJCfhZNrv56x17AY7at6TCH"), GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{125, 90, 67, -112, -70, 95, 30, -94, -117, -92, 84, -25, 55, -5, 107, 19}, "LrQXNGjb6mBsYIWPlH2bxQyO8hNDmgV5", "Vl175oFoEKHJrGTsQMBZMGR+BdywawaJyg=="), GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{84, -32, -112, -69, 73, -81, 39, 79, 58, -56, 65, -73, -111, 86, 83, -70}, "KV1h9nnqVTa0oO9QDxdSbVBRwIpsTA2r", "eMPI/QWxLV8Y+VL/0HUDiWL5hoFOiktoPeVQsKA="), GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{74, 79, 62, -23, -57, -108, -126, -15, 18, 51, 24, 97, 68, -73, -63, -62}, "n6FgjOOqXLTsz5FAw1COaqCV3hOSJKG7", "CgwI9g=="), GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{1, -41, 18, 73, 125, -48, -75, 17, 64, 64, -36, 122, -119, 100, 74, -19}, "8dBHO47W2zf68RFvwE00utzfdGlBwnK1", "SdwjaEaN7SgtVdgm1FV4"), GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{17, 13, -119, -124, 28, -15, 88, 123, 92, -15, 52, -46, 110, 35, -106, 75}, "Rw3lXGq2JXxVnzoNZZQmVhA6dxcK365p", "MxXJgTDfRidJyy3naz6Laj45vA=="), GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-55, 30, 28, 14, -123, -87, 26, -50, -55, 14, 93, -80, 109, 1, -81, 103}, "WvF0cctqkps4f0h3rdZTLN9skyNUpnN3", "7gcpV5KjAdH9Flvpal8="), GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-25, -65, 12, 46, 93, -62, -56, -48, -64, 43, -87, 53, -2, 115, -73, -102}, "oE2aHgdUpkVz1OOoe0OaIrcsSdmwKlj5", "749XYWDVyOTEJY034U6dhu36MSxxwMrA+DzqN8V7vNvt"), GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{96, -115, 52, -48, -59, -18, 50, -47, -102, -34, -79, -51, -58, -98, 26, -118}, "sATRAygdkPowULJysCFKL5Gh16JWE6q0", "da0C8O30e9ie6vDQ4L0+"), GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-56, 23, 124, -98, 37, 112, -79, -87, -5, -7, 5, -117, -125, 24, -107, 90}, "Qn6TuzapOg8BP9TATpka2xnkgSIyrNzc", "+hgpojU="), GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{67, 57, 121, 86, -9, 113, -12, -9, -32, -8, -99, -92, 47, -53, -35, -40}, "CpnkOkXHcJTmPdMglkupnAtqJQoyGk6B", "JTo6GMs0xt7x"), GBUPX\u200c\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200d\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{101, -10, -72, -110, 99, 113, -124, 75, -42, 98, 61, -127, 121, 60, 31, -64}, "ys0lxjpowaPMit6ziY4SziI2NUODpC2y", "Mv/hjg==")};
    }
}

