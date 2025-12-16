package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final List<Map.Entry<String, Character>> MapaLiczb = List.of(
            Map.entry("three", '3'),
            Map.entry("seven", '7'),
            Map.entry("eight", '8'),
            Map.entry("four", '4'),
            Map.entry("five", '5'),
            Map.entry("nine", '9'),
            Map.entry("one", '1'),
            Map.entry("two", '2'),
            Map.entry("six", '6'),
            Map.entry("zero", '0'),
            Map.entry("0", '0'),
            Map.entry("1", '1'),
            Map.entry("2", '2'),
            Map.entry("3", '3'),
            Map.entry("4", '4'),
            Map.entry("5", '5'),
            Map.entry("6", '6'),
            Map.entry("7", '7'),
            Map.entry("8", '8'),
            Map.entry("9", '9')
    );



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String linia = scanner.nextLine();
        System.out.println(zwrocOdLewejMapa(linia));

//        File file = new File("src/main/java/org/example/2023_1_input.txt");
//        try {
//            Scanner fsc = new Scanner(file);
//            int suma = 0;
//            int suma2 = 0;
//            while(fsc.hasNextLine()){
//                suma += zwrocCalaLiczbe(fsc.nextLine());
//                suma2 += zwrocCalaLiczbeMapa(fsc.nextLine());
//            }
//            System.out.println("Suma liczb zczytanych z tekstu starą metodą: "+suma);
//            System.out.println("Suma liczb zczytanych z tekstu dołączając liczby zapisane słownie: "+suma2);
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

    }


    public static char zwrocLiczbeodLewej(String line) {
        for (int i = 0; i < line.length(); i++) {
            char znak = line.charAt(i);
            if (Character.isDigit(znak)) {
                return znak;
            }
        }
        return ' ';
    }


    public static char zwrocLiczbeodPrawej(String line) {
        for (int i = line.length() - 1; i >= 0; i--) {
            char znak = line.charAt(i);
            if (Character.isDigit(znak)) {
                return znak;
            }
        }
        return ' ';
    }

    public static int zwrocCalaLiczbe(String line) {
        char left = zwrocLiczbeodLewej(line);
        char right = zwrocLiczbeodPrawej(line);
        if (!Character.isDigit(left) || !Character.isDigit(right)) {
            return -1;
        }
        String number = "" + left + right;
        return Integer.parseInt(number);
    }


    public static char zwrocOdLewejMapa(String line) {
        for (int i = 0; i < line.length(); i++) {
            for (var mapa : MapaLiczb) {
                if (line.startsWith(mapa.getKey(), i)) {
                    return mapa.getValue();
                }
            }
        }
        return ' ';
    }



//    public static int zwrocCalaLiczbeMapa(String line) {
//        List<Character> znalezione = new ArrayList<>();
//
//        for (int i = 0; i < line.length(); i++) {
//            for (Map.Entry<String, Character> entry : MapaLiczb.entrySet()) {
//                if (line.startsWith(entry.getKey(), i)) {
//                    znalezione.add(entry.getValue());
//                }
//            }
//        }
//
//        if (znalezione.isEmpty()) {
//            return -1;
//        }
//
//        return Integer.parseInt("" + znalezione.get(0) + znalezione.get(znalezione.size() - 1));
//    }




}
