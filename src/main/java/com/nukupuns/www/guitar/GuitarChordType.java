package com.nukupuns.www.guitar;

import com.nukupuns.www.basic.Staff;

/**
 * 吉他和弦组成元素
 */
public enum GuitarChordType {
    //整数 符号 英文名称 名称
    C(1,"C","C major","C大调"),
    D(2,"D","D major","C大调"),
    E(3,"E","E major","E大调"),
    F(4,"F","F major","F大调"),
    G(5,"G","G major","G大调"),
    A(6,"A","A major","A大调"),
    B(7,"B","B major","B大调"),

    SECOND(8,"2","second","2和弦"),
    FOURTH(9,"4","second","4和弦"),
    FIFTH(10,"5","fifth","5和弦"),
    SIX(11,"6","six","6和弦"),
    SEVENTH(12,"7","seventh","7和弦"),
    NINTH(13,"9","ninth","9和弦"),
    ELEVENTH(14,"11","eleventh","11和弦"),
    THIRTEENTH(15,"13","thirteenth","13和弦"),

    MAJOR(16,"","major","大三和弦"),
    MINOR(17,"m,min","minor","小三和弦"),
    ADD(18,"add,/","added", "增加和弦"),//在三和弦上再加一个和弦
    SUS(19,"sus","suspended","挂和弦"),
    MAJ(20,"maj","major","大调和弦"),
    AUG(21,"aug,+,''","augmented","增和弦"),//在原有和弦上升调某个和弦
    DIM(22,"dim,-,''","diminished","减和弦"),//降某个和弦
    DOM(23,"dom,''","dominant","属和弦"),

    S_(24, Staff.SHARP.getSignature(),"sharp","升调"),
    F_(25,Staff.FLAT.getSignature(),"flat","降调"),

    DEAD_TONE_STRINGS(26,"x","dead tone strings","死弦")

    ;

    private GuitarChordType(int number, String signature,
                            String english, String name){
        this.number = number;
        this.signature = signature;
        this.english = english;
        this.name = name;

    }

    private final int number;
    private final String signature;
    private final String english;
    private final String name;

    public int getNumber() {
        return number;
    }

    public String getSignature() {
        return signature;
    }

    public String getEnglish() {
        return english;
    }

    public String getName() {
        return name;
    }
}
