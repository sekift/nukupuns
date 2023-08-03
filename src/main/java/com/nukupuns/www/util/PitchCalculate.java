package com.nukupuns.www.util;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class PitchCalculate {

    // A0=27.500=21
    // C8=4186.009=108
    private static final String[] PITCHS = {"A0", "A#0", "B0",
            "C1", "C#1", "D1", "D#1", "E1", "F1", "F#1", "G1", "G#1", "A1", "A#1", "B1",
            "C2", "C#2", "D2", "D#2", "E2", "F2", "F#2", "G2", "G#2", "A2", "A#2", "B2",
            "C3", "C#3", "D3", "D#3", "E3", "F3", "F#3", "G3", "G#3", "A3", "A#3", "B3",
            "C4", "C#4", "D4", "D#4", "E4", "F4", "F#4", "G4", "G#4", "A4", "A#4", "B4",
            "C5", "C#5", "D5", "D#5", "E5", "F5", "F#5", "G5", "G#5", "A5", "A#5", "B5",
            "C6", "C#6", "D6", "D#6", "E6", "F6", "F#6", "G6", "G#6", "A6", "A#6", "B6",
            "C7", "C#7", "D7", "D#7", "E7", "F7", "F#7", "G7", "G#7", "A7", "A#7", "B7",
            "C8"
    };

    /**
     * 从音高计算出频率
     *
     * @param pitch 音高
     * @return 频率
     */
    public static double calculatePitch(int pitch) {
        // 这里选取 69 音高的频率 440Hz(A4) , 这是个整数 , 方便计算:69=A4=440
        double standardFrequency = 440.0;
        return (standardFrequency / 32.0) * Math.pow(2, pitch / 12.0 + 1);
    }

    /**
     * 从频率计算出音高
     *
     * @param frequency
     * @return
     */
    public static int calculateFrequency(double frequency) {
        // 这里选取 69 音高的频率 440Hz(A4) , 这是个整数 , 方便计算:69=A4=440
        double standardFrequency = 440.0;
        double resDou = (Math.log(32 * frequency / standardFrequency) / Math.log(2) * 12 + 9);
        return (int) Math.round(resDou) - 21;
    }

    /**
     * 从频率计算出音高名称
     *
     * @param frequency
     * @return
     */
    public static String calculateFrequencyName(double frequency) {
        if (frequency < 27.5 || frequency > 4186.009) {
            return "rest";
        }

        int res = calculateFrequency(frequency);
        String resStr = PITCHS[res];
        //System.out.println(frequency + " " + resStr);
        return resStr;
    }


    public static void main(String[] args) {
        // 1 读取huahai.txt文件
        File file = new File("src/main/resources/huahai.txt");
        try {
            List<String> list = FileUtils.readLines(file, StandardCharsets.UTF_8);
            for (String line : list) {
                String[] arr = line.split(" ");
                double frequency = Double.parseDouble(arr[0]);
                String name = calculateFrequencyName(frequency);
                System.out.println(frequency + " " + name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 2 从文件中读取每行的频率
        // 3 计算出音高
        // 4 保存到文件中
    }
}