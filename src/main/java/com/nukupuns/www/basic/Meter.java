package com.nukupuns.www.basic;

/**
 * 节拍（meter）:将强拍（S，accented beats）与弱拍（W，unaccented beats）组合成循环反复的模式。
 * 打拍的方式一般为：
 * 1）两拍：强-弱
 * 2）三拍：强-弱-弱
 * 3）四拍：强-弱-次强-弱
 * 简单节拍（simple meters）：一拍分成两等份
 * 复合节拍（compound meters）：一拍分成三等份
 * 节拍一般使用拍号（meter signature）标记，形如A/B的分数形式，上分的数字A表示每小节有几拍，下方的数字B表示几分音符为一拍。
 * 例如2/4，可读作四二拍或二四拍，指每小节二拍，四分音符一拍。
 * 无论是简单或复合节拍，其下方数字一般都为2、4、8、16等（简单节拍则是以B分音符为拍子单位，而复合节拍则是以三个B分音符构成的拍子单位），
 * 而简单节拍的上方数字一般为2、3、4（表示每小节A拍），复合节拍的上方数字一般为6、9、12（表示每小节B除以3个附点拍）。
 * 此外还有非对称性节拍，例如5/8、7/4等，一般用于早期民歌。
 *
 *
 */
public enum Meter {
    // 拍子简记 符号 中文
    M_2_2("2/2","二二拍"),
    M_2_3("3/2","二三拍"),
    M_2_4("4/2","二四拍"),
    M_4_2("2/4","四二拍"),
    M_4_3("3/4","四三拍"),
    M_4_4("4/4","四四拍"),
    M_4_6("6/4","四六拍"),
    M_4_12("12/4","四十二拍"),
    M_8_3("3/8","八三拍"),
    M_8_6("6/8","八六拍"),
    M_8_9("9/8","八九拍"),
    M_8_12("12/8","八十二拍"),
    M_16_9("9/16","十六九拍");

    private Meter(String signature, String name){
      this.signature = signature;
      this.name = name;
    }
    private final String signature;
    private final String name;

    public String getSignature() {
        return signature;
    }
    public String getName() {
        return name;
    }
}
