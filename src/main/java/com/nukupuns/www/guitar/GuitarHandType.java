package com.nukupuns.www.guitar;

/**
 * 吉他左右手标记
 * left hand 左手
 * right hand 右手
 */
public enum GuitarHandType {
    // 类型 号码 标记 英文名称 中文名称
    L_T(1,"T","thumb","拇指"),
    L_1(2,"1","index finger","食指"),
    L_2(3,"2","middle finger","中指"),
    L_3(4,"3","third finger","无名指"),
    L_4(5,"4","little finger","小指"),

    R_p(6,"p","pulgar","拇指"),
    R_i(7,"i","indice","食指"),
    R_m(8,"m","medio","中指"),
    R_a(9,"a","anular","无名指"),
    R_ch(10,"ch","chico","小指");

    private GuitarHandType(int number, String signature, String name, String chineseName){
        this.number = number;
        this.signature = signature;
        this.name = name;
        this.chineseName = chineseName;
    }

    private final int number;
    private final String signature;
    private final String name;
    private final String chineseName;

    public int getNumber() {
        return number;
    }

    public String getSignature() {
        return signature;
    }

    public String getName() {
        return name;
    }

    public String getChineseName() {
        return chineseName;
    }

}
