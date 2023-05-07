package Kitabxana;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitablar {
    private String bookName;
    public static List<Kitablar> listKitab=new ArrayList<>();
    public static List<Kitablar>goturulenKitablar=new ArrayList<>();

    public Kitablar(String bookName) {
        this.bookName = bookName;
    }
    public static void addBookName(){
        Kitablar bassizAtli=new Kitablar("Bassiz atli");
        Kitablar.listKitab.add(bassizAtli);
        Kitablar dusunce=new Kitablar("Dusunce");
        Kitablar.listKitab.add(dusunce);



    }

    public static void main(String[] args) {
        addBookName();
        Scanner sc=new Scanner(System.in);
        for (int x=0;x<listKitab.size();x++) {
            System.out.println(x + "-" + listKitab.get(x));
        }
        System.out.print("Secmek istediyiniz kitabin nomresini daxil edin");
        int x=sc.nextInt();

    }

    public static void kitabiGoturdu(){

        Scanner sc=new Scanner(System.in);
for (int x=0;x<listKitab.size();x++) {
    System.out.println(x + "-" + listKitab.get(x));
}
        System.out.print("Secmek istediyiniz kitabin nomresini daxil edin");
        int x=sc.nextInt();
        if (listKitab.size()>x) {
            goturulenKitablar.add(listKitab.get(x));
            listKitab.remove(x);
        }else {
            System.out.println("Bele bir kitab nomresi yoxdur");
        }

    }
    public static void kitabQaytarildi() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < goturulenKitablar.size(); i++) {

            System.out.println(i + "-" + goturulenKitablar.get(i));
        }
        System.out.println("Qaytarmaq istediyiniz kitabin nomresini daxil edin");
        int x = sc.nextInt();
        if (goturulenKitablar.size()>x) {
            listKitab.add(goturulenKitablar.get(x));
            goturulenKitablar.remove(x);
        }else {
            System.out.println("Bele nomrede bir kitab goturulmeyib");
        }

    }

    @Override
    public String toString() {
        return "Kitablar{" +
                "bookName='" + bookName + '\'' +
                '}';
    }
}
