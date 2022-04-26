import java.util.Scanner;

public class DikUcgen {
    public static void main(String[] args){

        //Değişken Atamaları
        int a, b;
        double c;

        Scanner inp = new Scanner(System.in);

        System.out.println("Yatay Kenari Giriniz: ");
        a = inp.nextInt();


        System.out.println("Dikey Kenari Giriniz: ");
        b = inp.nextInt();
        System.out.println(b);

        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenus Degeri: " + c);
        System.out.println(c);

        //Çevre Hesabı Formulu
        //Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        //       𝑢 = (a+b+c) / 2
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)


        double u, x;

        u = (a+b+c) / 2;
        System.out.print("Ucgenin Cevresi: ");
        System.out.println(u);


        x =  u * (u-a)* (u-b)* (u-c);
        System.out.println("Ucgenin Alani: " + x);
        System.out.println(x);









    }

}
