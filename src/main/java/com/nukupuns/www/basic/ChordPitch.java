package com.nukupuns.www.basic;

/**
 * 和弦功能表
 * 和弦(chord)：数个不同音高的音排列组合。
 * 升调记号：♯ ，降调记号：♭ ，还原记号：♮ 。
 */
public enum ChordPitch {

    // 音名 唱名 罗马音级 属名音级
    C("C","1","Ⅰ","主音"),
    D("D","2","Ⅱ","上主音"),
    E("E","3","Ⅲ","中音"),
    F("F","4","Ⅳ","下属音"),
    G("G","5","Ⅴ","属音"),
    A("A","6","Ⅵ","下中音"),
    B("B","7","Ⅶ","导音");

    private ChordPitch(String pitch, String syllable, String intervalRoma, String intervalNature){
        this.pitch = pitch;
        this.syllable = syllable;
        this.intervalRoma = intervalRoma;
        this.intervalNature = intervalNature;
    }

    private final String pitch;//音级
    private final String syllable;//唱名
    private final String intervalRoma; //音级1罗马
    private final String intervalNature;//音级2属名

    public String getPitch() {
        return pitch;
    }

    public String getSyllable() {
        return syllable;
    }

    public String getIntervalRoma() {
        return intervalRoma;
    }

    public String getIntervalNature() {
        return intervalNature;
    }

}
