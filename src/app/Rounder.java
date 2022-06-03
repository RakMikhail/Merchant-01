package app;

import java.text.DecimalFormat;

public class Rounder {
    public static String roundValue(double value) {
        return new DecimalFormat("0.00").format(value);
    }

}
