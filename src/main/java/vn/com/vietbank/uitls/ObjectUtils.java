package vn.com.vietbank.uitls;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ObjectUtils {
    public static boolean isEmpty(Object obj) {
        return (obj == null || "".equals(obj));
    }
    public static String formatShowingAmount(double amount) {
        NumberFormat NumFrm = new DecimalFormat("###,###,###,###,##0.00#");
        return NumFrm.format(Math.abs(amount));
    }
}
