package com.nukupuns.www.guitar;

import com.nukupuns.www.basic.PianoScale;

/**
 * 吉他对照图，吉他一般有20个品位，音域一般为e到b3。
 * 吉他 音高、六线谱、品等对照图
 */
public enum GuitarScale {
    // G-前缀，0-品位0品，6-弦第6弦
    G_0_6(1,PianoScale.E2),
    G_0_5(2,PianoScale.A2),
    G_0_4(3,PianoScale.D3),
    G_0_3(4,PianoScale.G3),
    G_0_2(5,PianoScale.B3),
    G_0_1(6,PianoScale.E4),

    G_1_6(7,PianoScale.F2),
    G_1_5(8,PianoScale.S_A2),
    G_1_4(9,PianoScale.S_D3),
    G_1_3(10,PianoScale.S_G3),
    G_1_2(11,PianoScale.C4),
    G_1_1(12,PianoScale.F4),

    G_2_6(13,PianoScale.S_F2),
    G_2_5(14,PianoScale.B2),
    G_2_4(15,PianoScale.E3),
    G_2_3(16,PianoScale.A3),
    G_2_2(17,PianoScale.S_C4),
    G_2_1(18,PianoScale.S_F4),

    G_3_6(19,PianoScale.G2),
    G_3_5(20,PianoScale.C3),
    G_3_4(21,PianoScale.F3),
    G_3_3(22,PianoScale.S_A3),
    G_3_2(23,PianoScale.D4),
    G_3_1(24,PianoScale.G4),

    G_4_6(25,PianoScale.S_G2),
    G_4_5(26,PianoScale.S_C3),
    G_4_4(27,PianoScale.S_F3),
    G_4_3(28,PianoScale.B3),
    G_4_2(29,PianoScale.S_D4),
    G_4_1(30,PianoScale.S_G4),

    G_5_6(31,PianoScale.A2),
    G_5_5(32,PianoScale.D3),
    G_5_4(33,PianoScale.G3),
    G_5_3(34,PianoScale.C4),
    G_5_2(35,PianoScale.E4),
    G_5_1(36,PianoScale.A4),

    G_6_6(37,PianoScale.S_A2),
    G_6_5(38,PianoScale.S_D3),
    G_6_4(39,PianoScale.S_G3),
    G_6_3(40,PianoScale.S_C4),
    G_6_2(41,PianoScale.F4),
    G_6_1(42,PianoScale.S_A4),

    G_7_6(43,PianoScale.B2),
    G_7_5(44,PianoScale.E3),
    G_7_4(45,PianoScale.A3),
    G_7_3(46,PianoScale.D4),
    G_7_2(47,PianoScale.S_F4),
    G_7_1(48,PianoScale.B4),

    G_8_6(49,PianoScale.C3),
    G_8_5(50,PianoScale.F3),
    G_8_4(51,PianoScale.S_A3),
    G_8_3(52,PianoScale.S_D4),
    G_8_2(53,PianoScale.G4),
    G_8_1(54,PianoScale.C5),

    G_9_6(55,PianoScale.S_C3),
    G_9_5(56,PianoScale.S_F3),
    G_9_4(57,PianoScale.B3),
    G_9_3(58,PianoScale.E4),
    G_9_2(59,PianoScale.S_G4),
    G_9_1(60,PianoScale.S_C5),

    G_10_6(61,PianoScale.D3),
    G_10_5(62,PianoScale.G3),
    G_10_4(63,PianoScale.C4),
    G_10_3(64,PianoScale.F4),
    G_10_2(65,PianoScale.A4),
    G_10_1(66,PianoScale.D5),

    G_11_6(67,PianoScale.S_D3),
    G_11_5(68,PianoScale.S_G3),
    G_11_4(69,PianoScale.S_C4),
    G_11_3(70,PianoScale.S_F4),
    G_11_2(71,PianoScale.S_A4),
    G_11_1(72,PianoScale.S_D5),

    G_12_6(73,PianoScale.E3),
    G_12_5(74,PianoScale.A3),
    G_12_4(75,PianoScale.D4),
    G_12_3(76,PianoScale.G4),
    G_12_2(77,PianoScale.B4),
    G_12_1(78,PianoScale.E5),

    G_13_6(79,PianoScale.F3),
    G_13_5(80,PianoScale.S_A3),
    G_13_4(81,PianoScale.S_D4),
    G_13_3(82,PianoScale.S_G4),
    G_13_2(83,PianoScale.C5),
    G_13_1(84,PianoScale.F5),

    G_14_6(85,PianoScale.S_F3),
    G_14_5(86,PianoScale.B3),
    G_14_4(87,PianoScale.E4),
    G_14_3(88,PianoScale.A4),
    G_14_2(89,PianoScale.S_C5),
    G_14_1(90,PianoScale.S_F5),

    G_15_6(91,PianoScale.G3),
    G_15_5(92,PianoScale.C4),
    G_15_4(93,PianoScale.F4),
    G_15_3(94,PianoScale.S_A4),
    G_15_2(95,PianoScale.D5),
    G_15_1(96,PianoScale.G5),

    G_16_6(97,PianoScale.S_G3),
    G_16_5(98,PianoScale.S_C4),
    G_16_4(99,PianoScale.S_F4),
    G_16_3(100,PianoScale.B4),
    G_16_2(101,PianoScale.S_D5),
    G_16_1(102,PianoScale.S_G5),

    G_17_6(103,PianoScale.A3),
    G_17_5(104,PianoScale.D4),
    G_17_4(105,PianoScale.G4),
    G_17_3(106,PianoScale.C5),
    G_17_2(107,PianoScale.E5),
    G_17_1(108,PianoScale.A5),

    G_18_6(109,PianoScale.S_A3),
    G_18_5(110,PianoScale.S_D4),
    G_18_4(111,PianoScale.S_G4),
    G_18_3(112,PianoScale.S_C5),
    G_18_2(113,PianoScale.F5),
    G_18_1(114,PianoScale.S_A5),

    G_19_6(115,PianoScale.B3),
    G_19_5(116,PianoScale.E4),
    G_19_4(117,PianoScale.A4),
    G_19_3(118,PianoScale.D5),
    G_19_2(119,PianoScale.S_F5),
    G_19_1(120,PianoScale.B5),

    G_20_6(121,PianoScale.C4),
    G_20_5(122,PianoScale.F4),
    G_20_4(123,PianoScale.S_F4),
    G_20_3(124,PianoScale.S_D5),
    G_20_2(125,PianoScale.G5),
    G_20_1(126,PianoScale.C6);

    private GuitarScale(int number, PianoScale key){
        this.number = number;
        this.key = key;
    }

    private final int number;
    private final PianoScale key;

    public int getNumber() {
        return number;
    }

    public PianoScale getKey() {
        return key;
    }

}
