package Preparetion1;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner scnn=new Scanner(System.in);

        double startOfCourse = scnn.nextDouble();

        System.out.println(" kursun başlama saati " + startOfCourse);

        String kerom = scnn.next();
        System.out.println("şldlşd " + kerom);

        scnn.nextLine();  // nextline ı koymazsan altı görmüyor

        String hakan = scnn.nextLine();
        System.out.println("hakanın soyadı " + hakan );
    }
}
