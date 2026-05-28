/*
 * Decompiled with CFR 0.152.
 */
package generated.gb.upx;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b {
    public static volatile /* synthetic */ String[] GBUPX\u200c\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;

    public static /* bridge */ /* synthetic */ String GBUPX\u200e\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(byte[] byArray, String string, String string2) {
        byte[] byArray2 = new byte[]{101, 75, -13, -93, -59, 58, 104, 27, 121, 38, 116, 125, -54, 4, 73, 110};
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
        GBUPX\u200c\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b = new String[]{GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-91, -69, -114, -60, -97, 21, -77, 23, -121, -65, 98, 73, -116, -8, -15, -63}, "9VJWWsENMBl2x6Cnmecnrf8QDmlNMwyI", "34Kq560IgnSehH4e"), GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-46, -82, -60, 65, -108, 42, -101, -52, -100, 55, 20, -34, 127, 69, -122, 33}, "Rq9wU7RausSdgAop0atBEukBApyWvTlz", "9LqFQu5tpcyAKg=="), GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{25, -66, -39, -128, 77, -25, -111, 120, -102, -73, 97, 99, 115, 84, -28, 75}, "65SDbewaeDZoszUeCfinHuYUeVKw7XsK", "AeHrtg=="), GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{0, 86, 112, 103, 29, 79, 116, -34, -43, 96, -91, -33, -21, -128, 112, -87}, "riHy4ugotkw8Vx5TAVrpbCtSbkyxDdBR", "O0h0Thh/QefQfQ=="), GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{1, 30, -31, 96, 75, -77, 6, 0, -10, -61, -46, 65, -6, 63, 63, 34}, "ShtfnLmVwrxXr20GigKTvFNbKw1Y3nOm", "JhPtclCNDiWu3cV47GRhAkcfw0ZOgWcA3NeIf7s+BSE2WOVoQg=="), GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{50, -46, -128, -13, 77, 68, 105, 18, 30, -59, 30, 94, -77, -74, 73, 43}, "8B36QvqhB8HChiDedXVtBYULLE3qdREN", "f+DXpGhXagI="), GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{36, -69, 34, 100, 13, -75, -22, -62, 62, 91, -95, -69, 2, 103, 63, -26}, "ScsmVTDC7hsbq2DoxQ8gWbTX8mTD3rW0", "IbE+ZTqVx+5nE72/UyYe6imYc3cj952oNw=="), GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{82, -91, -58, 46, -126, 32, 48, 13, 61, -12, -49, -28, -123, -97, -70, -85}, "4MtkZwtJdeO66VChj0nHVjwtxLHoXGmB", "AZ3ba60nICYt9PKqnaWQoUr02g+xOWkMNdzm/7g="), GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{88, -54, 78, 81, -31, 47, 33, 53, -36, 73, 98, -84, 91, 30, -37, -17}, "XVdhopvKPCsEBuhaM7z5duyZVeL9B4ep", "bfNOSg=="), GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{27, 4, 98, 118, -127, -120, 21, 105, 86, 32, 13, 49, -128, -66, 0, -125}, "ZlcBuLa6vNW2MjjYuRKmJ8NWMZiHcVmI", "MQdyXYCtGzF/Bi9urLo="), GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{80, 35, 57, -65, 78, -93, -86, 103, -91, 40, -126, 100, -15, 31, -48, -93}, "1S87qk7vl1K9eAWxbboX8WwgSObMRXIZ", "ER9y4Uuh8n+Wdqs38T3z"), GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-80, -12, -25, -88, 59, 8, 65, 80, 54, 0, -120, -74, -121, -39, -87, -69}, "Q0StqMRvjHiBFcmyuvF0GnMSxRyGqvpy", "xLeZ+TlraU8s"), GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{69, 87, -39, 121, -113, 98, -46, 88, 85, -13, -67, -2, 26, -2, -48, 55}, "SSD9WOyypMSZAqgLRQRpowpfNJpspr7p", "emv8JL1fhEdE3JzNOKHaFHMo4XqPew=="), GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-21, 67, 63, 60, 110, -89, -64, 5, -96, -80, 31, -86, 31, -69, -74, -63}, "yIEN2r8ZbGIQzL6oucdXhn7mScsWZyOD", "1GsTHjmx2Cut1zSODJvkjvNPP0RrrIMJl7IYnA=="), GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-36, -22, 64, -102, 62, 22, -57, -101, -37, -38, -102, -16, -96, -49, 125, 84}, "g1rOPHDTLpkraSovNNg00F4QUiyK3qRi", "laFbpQ=="), GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-31, 4, 86, -118, -91, -124, 21, -120, -20, -69, 87, 69, 53, -26, 51, -32}, "J6JkfzuM63Ua6FY6TRWqgMW1DhhPDElJ", "/VtzjaKKCaq0qG1CI9MPtcAkaI+76WGJnA=="), GBUPX\u200b\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200e\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{54, 33, -103, -128, 31, 47, 73, -91, -17, -94, 124, 87, -21, -29, 42, 14}, "4MWoow5PZgzEtgYUKrlK7PBJkUTPEYF0", "dxy2wRwxHofUt3889fccNQ==")};
    }
}

