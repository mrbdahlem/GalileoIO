package eu.hansolo.galileo;

/**
 * User: hansolo
 * Date: 05.05.14
 * Time: 10:05
 */
public enum GalileoPin implements Pin {
    GPIO_3(3),   // LED between Cypress CY8C9540A and RTC battery header (QuarkX1000: GPIO_SUS1)
    GPIO_4(4),   // TXS0108E level shifter output enable (QuarkX1000: GPIO_SUS2)
    GPIO_5(5),   // Reset to Mini PCI-E slot (QuarkX1000: GPIO_SUS3)
    GPIO_6(6),   // Wireless disable (RF Kill to PCI-E slot) (QuarkX1000: GPIO_SUS4)
    GPIO_7(7),   // Jumper J2 (Cypress CY8C9540A I2C address select) (QuarkX1000: GPIO_SUS5)
    GPIO_8(8),   // Select SPI for AD7298 (QuarkX1000: GPIO_0)
    GPIO_10(10), // Routed IO 10 if selected by IO10_MUX (libgpio42=0) (QuarkX1000: GPIO_2)
    GPIO_12(12), // Reset to Cypress CY8C9540A (QuarkX1000: GPIO_4)
    GPIO_14(14), // Selected by IO2_MUX (gpio31=0) (QuarkX1000: GPIO_6)
    GPIO_15(15), // Selected by IO3_MUX (gpio30=0) (QuarkX1000: GPIO_7)
    GPIO_0(0),   // Enable pullup on IO2/GPIO6 (QuarkX1000: GPIO_8)
    GPIO_1(1),   // Enable pullop on IO3/GPIO7 (CY8C9540A: GPIO_9)
    GPIO_16(16), // Selected by IO10_MUX(GPORT3_BIT6, gpio42 and also by pwm7) (CY8C9540A: GPORT0_BIT0)
    GPIO_17(17), // Also controlled by pwm5 (CY8C9540A: GPORT0_BIT1)
    GPIO_18(18), // Selected by IO3_MUX(gpio30=1) (CY8C9540A: GPORT0_BIT2)
    GPIO_19(19), // Also controlled by pwm1 (CY8C9540A: GPORT0_BIT3)
    GPIO_20(20), // Selects A5 pin routing: 0=AD7298 (VIN5), 1=Cypress CY8C9540A (CY8C9540A: GPORT0_BIT4)
    GPIO_21(21), // Selects A4 pin routing: 0=AD7298 (VIN4), 1=Cypress CY8C9540A (CY8C9540A: GPORT0_BIT5)
    GPIO_22(22), // Selects A3 pin routing: 0=AD7298 (VIN3), 1=Cypress CY8C9540A (CY8C9540A: GPORT0_BIT6)
    GPIO_23(23), // Selects A2 pin routing: 0=AD7298 (VIN3), 1=Cypress CY8C9540A (CY8C9540A: GPORT0_BIT7)
    GPIO_24(24), // Also controlled by pwm4 (CY8C9540A: GPORT1_BIT0)
    GPIO_25(25), // Selected by IO11_MUX(GPORT3_BIT7, gpio43) (CY8C9540A: GPORT1_BIT1)
    GPIO_26(26), // (CY8C9540A: GPORT1_BIT2)
    GPIO_27(27), // (CY8C9540A: GPORT1_BIT3)
    GPIO_28(28), // (CY8C9540A: GPORT1_BIT4)
    GPIO_29(29), // Selects between GPIO and I2C on pins A4 and A5: 0=Quark I2C, 1=GPIO (CY8C9540A: GPORT1_BIT5)
    GPIO_30(30), // Selects IO3 pin routing: 0=Quark(GPIO7, gpio15), 1=Cypress CY8C9540A (CY8C9540A: GPORT1_BIT6)
    GPIO_31(31), // Selects IO3 pin routing: 0=Quark(GPIO6, gpio14), 1=Cypress CY8C9540A (CY8C9540A: GPORT1_BIT7)
    GPIO_32(32), // Selected by IO_MUX(gpio31=1) (CY8C9540A: GPORT2_BIT0)
    GPIO_33(33), // (CY8C9540A: GPORT2_BIT1)
    GPIO_34(34), // (CY8C9540A: GPORT2_BIT2)
    GPIO_35(35), // (CY8C9540A: GPORT2_BIT3)
    GPIO_36(36), // Select A1 pin routing: 0=AD7298, 1=Cypress CY8C9540A (CY8C9540A: GPORT3_BIT0)
    GPIO_37(37), // Select A0 pin routing: 0=AD7298, 1=Cypress CY8C9540A (CY8C9540A: GPORT3_BIT1)
    GPIO_38(38), // Selected by IO12_MUX(gpio54=1) (CY8C9540A: GPORT3_BIT2)
    GPIO_39(39), // Selected by IO13_MUX(gpio55=1) (CY8C9540A: GPORT3_BIT3)
    GPIO_40(40), // Selected IO0 pin routing: 0=Quark UART0 RXD (/dev/ttyS0), 1=Cypress CY8C9540A (GPORT4_BIT6, gpio50) (CY8C9540A: GPORT3_BIT4)
    GPIO_41(41), // Selected IO1 pin routing: 0=Quark UART0 TXD (/dev/ttyS0), 1=Cypress CY8C9540A (GPORT4_BIT7, gpio51) (CY8C9540A: GPORT3_BIT5)
    GPIO_42(42), // Selected IO10 pin routing: 0=Quark SPI1_CS, 1=Cypress CY8C9540A (GPORT0_BIT0, gpio16) (CY8C9540A: GPORT3_BIT6)
    GPIO_43(43), // Selected IO11 pin routing: 0=Quark SPI1_MOSI, 1=Cypress CY8C9540A (GPORT1_BIT1, gpio25) (CY8C9540A: GPORT3_BIT7)
    GPIO_44(44), // Selected by A0_MUX (gpio37=1) (CY8C9540A: GPORT4_BIT0)
    GPIO_45(45), // Selected by A1_MUX (gpio36=1) (CY8C9540A: GPORT4_BIT1)
    GPIO_46(46), // Selected by A2_MUX (gpio23=1) (CY8C9540A: GPORT4_BIT2)
    GPIO_47(47), // Selected by A3_MUX (gpio22=1) (CY8C9540A: GPORT4_BIT3)
    GPIO_48(48), // Selected by A4_MUX (gpio21=1) and I2C_MUX(gpio29=1) (CY8C9540A: GPORT4_BIT4)
    GPIO_49(49), // Selected by A5_MUX (gpio20=1) and I2C_MUX(gpio29=1) (CY8C9540A: GPORT4_BIT5)
    GPIO_50(50), // Selected by IO0_MUX(gpio40=1) (CY8C9540A: GPORT4_BIT6)
    GPIO_51(51), // Selected by IO1_MUX(gpio41=1) (CY8C9540A: GPORT4_BIT7)
    GPIO_52(52), // Connected to shield and to the RESET button (CY8C9540A: GPORT5_BIT0)
    GPIO_53(53), // (CY8C9540A: GPORT5_BIT1) 
    GPIO_54(54), // Selects IO12 pin routing: 0=Quark SPI_MISO, 1=Cypress (PORT3_BIT2, gpio38)
    GPIO_55(55); // Selects IO13 pin routing: 0=Quark SPI_SCK, 1=Cypress (PORT3_BIT3, gpio39)            

    public final int gpio;
    private GalileoPin(final int GPIO) {
        gpio = GPIO;
    }
}
