package com.nukupuns.www.basic;

/**
 * 调式（Mode）：大调（major）和小调（minor）的统称，用于确定主音和标明调式。
 * 大调性质：明亮、稳定；小调性质：暗淡、忧伤。
 * 调性还分有自然大/小调、和声大/小调和旋律大/小调，此外还有平行大/小调。
 * 西方调式有12个调，17个调名，分别为：
 * 升调sharp记号：♯ ，降调flat记号：♭ ，还原natural记号：♮ 。
 * C调、♯C调(♭D调)、D调、♯D调(♭E调)、E调、F调、♯F调(♭G调)、G调、♯G调(♭A调)、A调、♯A调(♭B调)、B调
 * 调可用五度循环图来理解
 */
public enum Mode {
    // 等级 唱名 名称
    C(1,"C","C调"),
    S_C(2,"♯C","升C调"),
    F_D(2,"♭D","降D调"),
    D(3,"D","D调"),
    S_D(4,"♯d","升D调"),
    F_E(4,"♭E","降E调"),
    E(5,"E","E调"),
    F(6,"F","F调"),
    S_F(7,"♯F","升F调"),
    F_G(7,"♭G","降G调"),
    G(8,"G","G调"),
    S_G(9,"♯G","升G调"),
    F_A(9,"♭A","降A调"),
    A(10,"A","A调"),
    S_A(11,"♯A","升A调"),
    F_B(11,"♭B","降B调"),
    B(12,"B","B调");

    private Mode(int number, String signature, String name){
        this.number = number;
        this.signature = signature;
        this.name = name;
    }
    private final int number;
    private final String signature;
    private final String name;

    public int getNumber() {
        return number;
    }
    public String getSignature() {
        return signature;
    }
    public String getName() {
        return name;
    }
}
