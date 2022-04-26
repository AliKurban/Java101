import java.util.Scanner;

public class ucgenAlani {
    public  static  void  main(String[] args){
        double pi = 3.14;
        int r ;
        double a;
        //a = acı değeri

        Scanner inp = new Scanner(System.in);

        System.out.print("Yaricapi Giriniz: "    );
        r = inp.nextInt();
        System.out.println(r);

        System.out.print("Aci Degerini Giriniz:" );
        a =inp.nextDouble();
        System.out.println(a);
        //Duruma göre bunu alt satırlara alabilirim.


        double  alan = pi * r * r;
        double cevre = 2 * pi * r;
        double dilim = (pi*(r*r)*a)/360;
        System.out.println("Alan:" + alan );
        System.out.println("cevre:" + cevre);
        System.out.println("dilim:" + dilim);
        }
    }
