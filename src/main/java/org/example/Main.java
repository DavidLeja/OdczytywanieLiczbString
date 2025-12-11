package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String line = s.nextLine();
//
//        System.out.println("Pierwsza liczba od lewej: " + zwrocLiczbeodLewej(line));
//        System.out.println("Pierwsza liczba od prawej: " + zwrocLiczbeodPrawej(line));
//        System.out.println("Liczba: "+zwrocCalaLiczbe(line));


        File file = new File("C:\\Users\\Egzamin\\Documents\\dl\\zadanie\\src\\main\\java\\org\\example\\2023_1_input.txt");
        try {
            Scanner fsc = new Scanner(file);
            int suma = 0;
            while(fsc.hasNextLine()){
                suma += zwrocCalaLiczbe(fsc.nextLine());
            }
            System.out.println(suma);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

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






}
