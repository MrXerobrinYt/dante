/*
 * Decompiled with CFR 0.152.
 */
package generated.gb.upx;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class GBUPX\u200d\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b {
    public static volatile /* synthetic */ String[] GBUPX\u200e\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b;

    public static /* bridge */ /* synthetic */ String GBUPX\u200b\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(byte[] byArray, String string, String string2) {
        byte[] byArray2 = new byte[]{-120, 69, -78, -59, 14, -109, -44, 25, 125, -99, 52, -112, 65, 59, 125, -43};
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
        GBUPX\u200e\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b = new String[]{GBUPX\u200d\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{7, -96, -39, 60, 31, -112, 63, -80, -109, -65, -8, 127, 122, -79, -115, -2}, "Jy1Cc5rbvusqONz4FwttQRppphdhcqiS", "Y6OBDw=="), GBUPX\u200d\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{123, 2, 11, -42, -79, 9, 115, -84, -1, 64, -15, -74, -58, -22, 121, 21}, "vmwBJpUkJDGt23G7xdIJ6iJR8iX0J401", "TAwf8YsNC4TdZcSxka0="), GBUPX\u200d\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{125, 109, -101, -60, -81, -85, 123, 50, -44, -51, -5, -10, 88, 44, 119, -11}, "oYyB2NUT4ibnSxG7Gu5cR5qHh5u6FlcT", "Z0SG5+mAXB7NyPb5bzFC"), GBUPX\u200d\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{48, 51, -5, -59, 94, 44, -41, 111, -33, -88, -120, 45, -48, 121, 18, -15}, "mUoT13npqHuXTAdEG56b7YUWsLrDj859", "cwz14w=="), GBUPX\u200d\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-3, -109, -80, -3, 64, -61, -48, 77, -15, 28, -52, -65, -100, -47, 26, 81}, "nOlSOlz2kQDscPeH7kvR1IQM0VCKCcfO", "5qy4z3vK2Ac="), GBUPX\u200d\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-79, -55, 80, 125, 116, -86, -75, 111, -24, -77, -7, -17, -87, -66, 86, -34}, "K4VbwoJXlyDQ2DG4YdSTKiVZczKG1naw", "jph+a3a3mkSrptLf/5N/jcfeZkpQrYca6ajRw/+iWNyUmShvbaI="), GBUPX\u200d\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{36, 68, -94, -4, -3, -3, -99, 78, -85, -38, -89, -112, -20, 71, -23, -26}, "LSuAJHqoKyu7pS8Ct2jGEgeoBGCh6QfQ", "Pn640dbBhU6Og73BvGe0xiUEoc/ButsT2g=="), GBUPX\u200d\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-101, 45, -108, 17, 45, 55, 96, -125, 86, 30, 47, 78, -43, -77, 83, -33}, "PjFr6wFwIdZBIL0hQZSWTJG5GaXDCzA3", "pDezAHI0X6t5Ewd/6A=="), GBUPX\u200d\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{61, -114, 11, 85, -61, -58, -10, -22, 97, 8, 72, 74, -26, -29, -70, 83}, "GxJPo8608maqKtxrFRLBW5uTZyMUD9kH", "CpkybNiXr7QGCktRyPS2"), GBUPX\u200d\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-59, -48, 3, 96, -17, 26, 47, 104, -34, -126, 83, 10, -40, -66, -52, -38}, "KNEOw1lqYfNGWHh5ouz1gWdlREdJAyyu", "/vE1RuxCLHfYhnwu5JHWgN/LHQ=="), GBUPX\u200d\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-30, 96, 64, -45, 33, -90, -51, -72, 81, -116, 126, -112, 106, 0, 35, -33}, "KSpiSsex9cavMqGoAV8EkhurvQxo1lo8", "zkZZlAelzKEcim2eCQIBwtVTCrgpodakQr5yljQCYoHIWlzfFg=="), GBUPX\u200d\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{23, -32, 127, 20, 53, 125, 87, 46, 76, -110, -81, 39, -64, 57, -110, 94}, "7SH0jXpiMf5aa2AljobvjpUt9AIr88X1", "StJFVw=="), GBUPX\u200d\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{-119, -127, -58, -19, -79, 8, -99, -115, 101, 33, 91, -97, 50, -110, 49, -49}, "9sfsvrXtAs0t7Pz0uAsfnrQTd5lSrZTM", "4rfs0YY+mqthASS+V4EO"), GBUPX\u200d\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{54, 81, 94, 41, 27, 85, 79, 16, 29, 68, -92, -1, -8, -58, 51, -78}, "Z4Hkgh1cxV394YaCwZL3HruOwDuuwmwH", "Ogx5Lh1JFxwLMvig7Ow3kjR5e24qBxlvWA=="), GBUPX\u200d\u200d\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b.GBUPX\u200b\u200f\u200b\u200b\u200b\u200b\u200b\u200b\u200b\u200b(new byte[]{76, 36, -10, 69, 99, 62, -52, -54, -18, -83, 19, -70, 113, -71, 87, -102}, "CchPbnF276IQlTaVcm1VjSk3BHuPcc9I", "Wjf6dHU1+KD01zWKeYhE")};
    }
}

