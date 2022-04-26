import java.util. Scanner;

public class NotOrtalamasi {
    public static void  main(String[] args) {

        //Değişenlerin tanımları.
        int mat,fizik,kimya,turkce,tarih,muzik;

        //Kullanıcıdan Veri Alma uygulaması
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunu Giriniz: ");
        mat = inp.nextInt();
        System.out.println(mat);

        System.out.print("Fizik Notunu Giriniz: ");
        fizik = inp.nextInt();
        System.out.println(fizik);

        System.out.print("Kimya Notunu Giriniz: ");
        kimya = inp.nextInt();
        System.out.println(kimya);

        System.out.print("Turkce Notunu Giriniz: ");
        turkce = inp.nextInt();
        System.out.println(turkce);

        System.out.printf("Tarih Notunu Giriniz: ");
        tarih = inp.nextInt();
        System.out.println(tarih);

        System.out.print("Muzik Notunu Giriniz: ");
        muzik = inp.nextInt();
        //Not:Yukarıda yazılan kodları görünüşe göre ayarlama yaptım.



        //Not Ortalaması İle Sınıfı Geçip Geçmediğini Kontrol Edelim
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik );
        double sonuc = toplam / 6.0 ;
        System.out.print("Not Ortalamasi: ");
        System.out.println(sonuc);

        boolean gecti = sonuc >= 60;
        boolean kaldı = sonuc < 60;
        boolean durum = gecti || gecti;
        String str = durum? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.println(str);

















    }
}
