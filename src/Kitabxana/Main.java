package Kitabxana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kitablar.addBookName();
        while (true) {
            System.out.println("""
                    1-Kitablarin siyahisini gormek
                    2-Kitab goturmek
                    3-Kitab qaytarmaq
                    4-Sistemden cixmaq
                    """);
            System.out.print("Yerine yetirmek istediyiniz emeliyyat nomresini daxil edin:");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println(Kitablar.listKitab);
                    break;
                case 2:
                    Kitablar.kitabiGoturdu();
                    break;
                case 3:
                    Kitablar.kitabQaytarildi();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Bele nomrede bir emeliyyat movcud deyil  yoxdur");
            }
        }
    }
}