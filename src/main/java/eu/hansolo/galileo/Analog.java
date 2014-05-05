package eu.hansolo.galileo;

/**
 * User: hansolo
 * Date: 05.05.14
 * Time: 07:32
 */
public enum Analog implements Pin {
    A0(37),
    A1(36),
    A2(23),
    A3(22),
    A4(21),
    A5(20);

    public static final double FACTOR_5V = 5000d / 4096d;

    public final int gpio;

    private Analog(final int GPIO) {
        gpio = GPIO;
    }
}
