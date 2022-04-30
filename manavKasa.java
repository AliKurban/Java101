import java.awt.*;
import java.util.Scanner;
public class manavKasa {
    public static void  main (String[] args){

        double pearKg, appleKg, tomatoesKg, bananaKg, aubergineKg ;
        double pearPrice, applePrice, tomatoesPrice, bananaPrice, aurberginePrice;
        double pearTotal, appleTotal, tematoesTotal, bananaTotal, aurbergineTotal, totalPrice;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut'un Kilogramini Giriniz:"      );
        pearKg = inp.nextDouble();
        pearPrice = 2.14;
        pearTotal = pearKg * pearPrice;

        System.out.print("Elma'nin Kilogramini Giriniz:"      );
        appleKg = inp.nextDouble();
        applePrice = 3.67;
        appleTotal = appleKg * applePrice;

        System.out.print("Domates'in Kilogramini Giriniz:"      );
        tomatoesKg = inp.nextDouble();
        tomatoesPrice = 1.11;
        tematoesTotal = tomatoesKg * tomatoesPrice;

        System.out.print("Muz'un Kilogramini Giriniz:"      );
        bananaKg = inp.nextDouble();
        bananaPrice = 0.95;
        bananaTotal = bananaKg * bananaPrice;

        System.out.print("Patlican'in Kilogramini Giriniz:"      );
        aubergineKg = inp.nextDouble();
        aurberginePrice = 5.00;
        aurbergineTotal = aubergineKg * aurberginePrice;

        totalPrice = (pearTotal + appleTotal + tematoesTotal + bananaTotal + aurbergineTotal);
        System.out.println("Toplam Ucretiniz: " + totalPrice);





    }
}
