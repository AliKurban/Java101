import java.util.Scanner;
public class vucudKitleIndeksi {
    public static void main(String[] args){
        double bodymassindex, weight, size ;
        Scanner inp= new Scanner(System.in);
        System.out.println("Kilonuzu (kg) Cinsinden Giriniz: " );
        weight = inp.nextDouble();
        System.out.println("Boyunuzu (m) Cinsinden Giriniz: " );
        size = inp.nextDouble();
        bodymassindex = weight / (size * size) ;
        System.out.println("Vucud Kitle Indeksiniz: " + bodymassindex);


    }
}
