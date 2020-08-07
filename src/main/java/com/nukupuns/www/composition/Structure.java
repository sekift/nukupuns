package com.nukupuns.www.composition;

/**
 * 作曲的概念
 * sekift
 * 2020-05-25
 */
public enum Structure {

    // (概念)缩写 - 整数 英文 name 概念
    TONAL_MUSIC(1,"tonal music","调性音乐","1650-1900时期的西方音乐"),
    TONALITY(1,"tonality","调性","拥有音调中心的音乐作品"),
    TONIC(1,"tonic","主音","引力中心，主调"),
    PITCHES(1,"pitches","音高","振动发出的声音"),
    REGISTER(1,"register","音区","音乐进行的区域"),
    INTERVAL(1,"interval","音程","任意两个音高之间的距离"),
        (1,"","",""),
        (1,"","",""),
        (1,"","",""),
        (1,"","",""),
        (1,"","",""),
        (1,"","",""),
        (1,"","",""),
        (1,"","",""),
        (1,"","",""),
        (1,"","",""),




    FORM(1,"from","曲式","部分的数量，有机组织"),
    PHRASE(2,"phrase","短句","具有一定完整性的单元"),
    EVENT(3,"event","事件",""),
    MOTIVE(4,"motive","动机","音程与节奏的有机结合，包括内在的和声，具有变化或不变化的一再重复"),
    VARIANT(5,"variant","变体","乐曲特殊的变化，即变奏"),
    SENTENCE(6,"sentence","乐句","一个完整的乐思或主题"),
    PERIOD(7,"period","乐段","一个完整的乐思或主题，一般比乐句更长"),
    ANTECEDENT(8,"antecedent","前句","乐句或乐段的开端部分"),
    CONSEQUENT(9,"consequent","后句","乐句或乐段的后端部分，是前句的变化重复"),


    UNKOWN(1,"x","","");
    private Structure(int number, String english, String name, String concept){
        this.number = number;
        this.english = english;
        this.name = name;
        this.concept = concept;
    }

    private final int number;
    private final String english;
    private final String name;
    private final String concept;

    public int getNumber() {
        return number;
    }

    public String getEnglish() {
        return english;
    }

    public String getName() {
        return name;
    }

    public String getConcept() {
        return concept;
    }
}
