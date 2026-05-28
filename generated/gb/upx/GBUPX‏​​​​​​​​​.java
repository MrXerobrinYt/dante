/*
 * Decompiled with CFR 0.152.
 */
package generated.gb.upx;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class GBUPX\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b {
    public static volatile /* synthetic */ String[] GBUPX\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;

    public static /* bridge */ /* synthetic */ String GBUPX\u200c\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(byte[] byArray, String string, String string2) {
        byte[] byArray2 = new byte[]{-112, -33, 109, -36, 108, 123, -53, 32, 67, 21, -48, -41, -126, 23, 112, -104};
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
        GBUPX\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b = new String[]{GBUPX\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-77, 94, 84, 55, -76, -111, -108, 123, -41, -72, 52, 50, -108, -27, 100, -65}, "29ySvBu9nahWv2fVMzKfovI11RzZgP1R", "9QJVEO27lS/V9T0Vkrtrip9Qdj61yKUikociQ4vYOcHgF10Iq7CANtC2Mkqaum4="), GBUPX\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-54, 76, -84, 111, 125, -68, -112, -119, 89, 118, -126, -100, 20, 84, -24, -57}, "tWXas01EtFriLxBHPUNmNzRbYoJ3tnW5", "62iRfCPNxqlDRA=="), GBUPX\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{96, 58, -7, 47, 91, -79, 93, 102, -94, -66, 95, -67, -122, -48, -9, -110}, "mopt6pvyQOEJNcDXe12GGZPRoPlpjPLG", "Iz/oKQ=="), GBUPX\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-58, 103, 37, -105, 28, -53, -25, -124, -11, 93, -102, 117, -14, -30, -69, -62}, "ZrbYFBFs2Vz3Uc3MDXbkqSNrJZxJeYxZ", "7Hotryyn0ZazY84rzu/t7PBeIYg="), GBUPX\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{53, 56, 111, 113, 91, -74, -5, -109, 74, -112, -13, 79, -80, 3, -7, -93}, "JH5ieRKdJ3gZawKqUM1RGKOzEMxvErqH", "CgA+eUqBwo8="), GBUPX\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-49, 68, -102, -25, -76, -52, 29, -108, -96, -62, -77, -18, 68, -34, 32, -76}, "NgXPqdjtxF5zFxJWWwuvxtJ0XcIgvugC", "9Ua6w7DaEpP36On1Zs8EhLdHh/i+3HjGmcKR7kDEMpnlDbLZog=="), GBUPX\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{104, 3, 74, 61, 55, -38, -119, -108, -94, 11, 68, -74, 46, -24, -24, 102}, "8GXAXYkJId9K6nR8biFtsXgACZfVAtMj", "NzF7Uhrzhr+fCg+FNurTPHgLfiAh8cCwkyNNkkHmzHx+MncOBuWLvYobFJJ2"), GBUPX\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-63, -23, 13, -39, -80, 108, 59, -71, 31, -57, -97, 11, 6, -104, -49, 94}, "5n8I0o4mE3k6PEmB73x00ydwV1iQdlHy", "gfdR8fRmfax3mJtcMrjQ"), GBUPX\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-48, -16, 25, 63, 19, 53, 77, 82, -9, 80, -87, -57, -76, -127, 32, -45}, "vz8IJQ8vvUnVktMc67OCxBXDOffS5vRK", "0u9ZAgYXAUX1cLQ="), GBUPX\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-39, 110, -28, -35, 29, 42, 87, 112, 85, -98, -7, -33, 35, -98, 125, 40}, "lAmeex5hmjqDasPXTpVRcgWsPbBNn0xx", "xUD60Qw7DXZnnP32I4M="), GBUPX\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-6, -101, 56, -79, -34, -50, -112, -74, 56, 45, -45, -116, -101, -70, -105, 116}, "B5PIa37Q8D8WH4RUYWva0zwBO4uINPwM", "yMEbkcuUyIlfC4q4uOm3TtaiKg=="), GBUPX\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{122, -16, 40, 98, 111, 53, 69, -49, 74, -7, 45, 48, -81, -105, -55, 16}, "jkRHl9vnRqoZrNjfdwF6yX3WW0RwIXS5", "NatMHns="), GBUPX\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{110, 124, 87, 37, -7, 26, -93, -24, 62, 39, -94, -42, 65, -26, 23, 97}, "FuDK6fFIalA8WVNfSwFZplNsElD2li63", "TmB/Cw=="), GBUPX\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-102, -1, -6, 93, 8, -42, -20, -71, -68, -6, -109, -27, 107, 99, 92, -102}, "WqPDxoKiMBoGfIcfOuQMNJ2TcNxmoH1J", "hODZbRHXxLXR2ZDQaEtbhfX5zmQ="), GBUPX\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{43, 87, 37, 0, 93, 77, 8, 49, 38, 120, -92, 67, -95, 117, -39, -44}, "55CFpHK65l9mTrvkQaPr94USoB1y02aQ", "eRcPaFh1J2Znce9W22rA2xNQHBEFDTQNJ0m7X+M11/cwCgc1RSs1YmF9+0eWZtvWFVg="), GBUPX\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-112, -69, -50, 99, 4, -10, -49, 84, 54, 51, -45, -56, 78, 9, -39, -91}, "7DhZQwBXRzgi59uoETwcuh9qrK70gNba", "wIrPFyDx6W0QLMbZVUPJuKOKyy4S8ZhLIRuQkUYplaLGlspcMQ=="), GBUPX\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200c\u200b\u200c\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-45, 81, -10, -10, -123, 116, 67, -77, -20, -72, 115, 127, 78, 86, 55, 101}, "mgfhYwel0Gpsp6VvOw32lhCyopnjb4Ua", "2UP5sKlzQr6omnF0EA0Od/VArKeIaGml7bszYFwGA3Db")};
    }
}

