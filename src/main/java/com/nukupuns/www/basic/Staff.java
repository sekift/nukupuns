package com.nukupuns.www.basic;

/**
 * 用于记谱的符号，谱表+谱号
 */
public enum Staff {
    //名称(整数 符号 简记 名称
    SHARP(1,"♯","♯","升号"),
    FLAT(1,"♭","♭","降号"),
    DOUBLE_SHARP(1,"*","×","重升号"),
    DOUBLE_FLAT(1,"♭♭","♭♭","重降号"),
    NATURAL(1,"♮","♮","还原号"),
    MAJOR_SIGNATURE(1,"1","1","大调用1标记"),
    MINOR_SIGNATURE(1,"6","6","小调用6标记"),
    MAN_KEY(1,PianoScale.C3.toString(),PianoScale.C3.toString(),"男key常量"),
    WOMAN_KEY(1,PianoScale.C4.toString(),PianoScale.C4.toString(),"女key常量"),
    TREBLE(1,"G","G","高音谱号"),
    CENTER(1,"C","C","中音谱号"),
    BASS(1,"F","F","低音符号"),

//    ♩ 四分音符
//♫ 二个八分音符
//♬ 十六分音符
//♪ 八分音符

    //连线：有两个作用1.用于多个相同的音高，称为连音线，时值相加奏出一个音；
    // 2.用于多个不同音高，称为圆滑线，用于一个字的发音，俗称转音。
    TIE(1,"︵","︵","连线"),

    ;
    private Staff(int number, String signature, String shortHand, String name){
        this.number = number;
        this.signature = signature;
        this.shortHand = shortHand;
        this.name = name;
    }

    private final int number;
    private final String signature;
    private final String shortHand;
    private final String name;

    public int getNumber() {
        return number;
    }

    public String getSignature() {
        return signature;
    }

    public String getShortHand() {
        return shortHand;
    }

    public java.lang.String getName() {
        return name;
    }

}
