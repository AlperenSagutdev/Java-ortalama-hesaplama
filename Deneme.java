import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int mat,fizik,tarih,turkce,kimya,muzik;

     System.out.println("Matematik notunuzu giriniz:  ");
     mat = inp.nextInt();

     System.out.println("Fizik notunuzu giriniz:  ");
     fizik = inp.nextInt();

     System.out.println("Kimya notunuzu giriniz :  ");
     kimya = inp.nextInt();

     System.out.println("Türkçe notunuzu giriniz :  ");
     turkce = inp.nextInt();

     System.out.println("tarih notunuzu giriniz :  ");
     tarih = inp.nextInt();

     System.out.println("Müzik notunuzu giriniz :  ");
     muzik = inp.nextInt();

      int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
      double sonuc = toplam/6.0;
      String durum = (sonuc>=60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

      System.out.println(sonuc);
      System.out.println(durum);

    }

}
