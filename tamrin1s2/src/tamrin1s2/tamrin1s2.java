package tamrin1s2;
import java.awt.*;
import java.util.Scanner;
public class tamrin1s2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String shekl=sc.nextLine() ;
        float tul = sc.nextFloat() ;
        float arz = sc.nextFloat() ;
        float mohit = tul+tul+arz+arz ;
        System.out.println("P = " + mohit);
        switch (shekl) {
            case "square" :
                System.out.println("S = " + tul*arz) ;
                break ;
            case "rectangle" :
                System.out.println("S = " + tul*arz);
                break ;
        }


    }


}

