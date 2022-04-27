import java.util. Scanner;

public class KdvHesaplayan {
    public static void main(String[] args){

        //KDV Tutarı Hesaplayan Program
        //Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        //
        //(Not : KDV tutarını 18% olarak alın)
        //
        //KDV'siz Fiyat = 10;
        //
        //KDV'li Fiyat = 11.8;
        //
        //KDV tutarı = 1.8;
        //
        //Ödev
        //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

        Scanner inp = new Scanner(System.in);

        double kdvOrani = 0.18;
        double fiyat;
        double kdvFiyat1,kdvFiyat2;
        double kdvliFiyat1,kdvliFiyat2;
        double kdvOrani2 = 0.008;


        System.out.print("Urun Fiyati Giriniz: ");
        fiyat = inp.nextDouble( );
        System.out.println(fiyat);

        boolean yuksek = fiyat <1000;
        boolean dusuk = fiyat >= 1000;
        boolean sonuc = yuksek && dusuk ;
        String str = sonuc ?"yuksek kdv":"dusuk kdv";
        System.out.println(str);

        System.out.println("yuksek kdv yazisindan sonra burayi esas al");
        kdvFiyat1 = fiyat * kdvOrani;
        kdvliFiyat1 = fiyat + kdvFiyat1;

        System.out.println("fiyat: " + fiyat);
        System.out.println("kdvOrani: " + kdvOrani);
        System.out.println("kdvFiyat: " + kdvFiyat1);
        System.out.println("kdvliFiyat: " + kdvliFiyat1);


        System.out.println("dusuk kdv yazisindan sonra burayi esas al");
        kdvFiyat2 = fiyat * kdvOrani2;
        kdvliFiyat2 = fiyat + kdvFiyat2;

        System.out.println("fiyat: " + fiyat);
        System.out.println("kdvOrani: " + kdvOrani2);
        System.out.println("kdvFiyat: " + kdvFiyat2);
        System.out.println("kdvliFiyat: " + kdvliFiyat2);








        }




    }

