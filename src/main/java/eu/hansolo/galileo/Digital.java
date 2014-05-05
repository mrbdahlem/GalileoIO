package eu.hansolo.galileo;

/**
 * User: hansolo
 * Date: 05.05.14
 * Time: 07:33
 */
public enum Digital implements Pin {
    RX(50),
    TX(51),
    D0(50),
    D1(51),
    D2(14),
    D3(15),
    D4(28),
    D5(17),
    D6(24),
    D7(27),
    D8(26),
    D9(19),
    D10(16),
    D11(25),
    D12(38),
    D13(39);
    
    public final int gpio;
    
    private Digital(final int GPIO) {
        gpio = GPIO;    
    }
}
