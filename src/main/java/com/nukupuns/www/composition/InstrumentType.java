package com.nukupuns.www.composition;

/**
 * 乐器类型
 */
public enum InstrumentType {
    // 乐器缩写 - 整数 英文 name
    STA(1,"staff","谱"),
    VO(2,"vocal","歌声"),
    LY(3,"lyric","歌词"),

    PN(3,"piano","钢琴"),
    EPN(4,"electrical piano","电钢琴"),
    OR(5,"organ","电子琴"),

    GT(6,"guitar","吉他"),
    EGT(7,"electric guitar","电吉他"),
    CGT(8,"classic guitar","古典吉他"),
    AGT(9,"aero guitar","空心吉他"),
    UK(10,"ukulili","尤克里里"),

    BS(12,"bass","贝斯"),

    DR(11,"drum","鼓"),
    KI(1,"kick","地鼓"),
    HI(1,"hihat","踩镲"),
    SN(1,"snare","军鼓"),

    STR(13,"strings","弦乐"),
    VOL(14,"violin","小提琴"),
    VOA(15,"viola","中提琴"),
    CE(16,"cello","大提琴"),
    SAX(17,"sax","萨克斯"),
    FL(18,"flute","长笛"),
    TP(19,"trumpet","小号"),
    BO(20,"bassoon","大号"),
    TR(21,"trombone","长号"),
    FH(22,"french horn","圆号"),
    CL(23,"clarinet","单簧管"),
    OB(24,"oboe","双簧管"),
    SYN(25,"synthesis","合成乐器"),

    CLAP(1,"clap","拍手"),
    OS(26,"os","口白");

    private InstrumentType(int number, String english, String name){
        this.number = number;
        this.english = english;
        this.name = name;
    }

    private final int number;
    private final String english;
    private final String name;

    public int getNumber() {
        return number;
    }

    public String getEnglish() {
        return english;
    }

    public String getName() {
        return name;
    }
}
