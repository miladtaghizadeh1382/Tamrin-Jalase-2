package tamrin2s2;
import java.awt.*;
import java.util.Scanner;
public class tamrin2s2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [] score = new float[10] ;
        int [] zarib = new int[10] ;
        float total = 0 ;
        int totalzarib = 0 ;
        int a , i , b ;
        System.out.println("Enter the number of scores");
        a = sc.nextInt() ;
        for ( i=0 ; i < a ; i++ ) {
            System.out.println("Enter the score");
            score[i] = sc.nextFloat() ;
            System.out.println("Enter the coefficient");
            zarib[i] = sc.nextInt() ;
            total = total + score[i]*zarib[i] ;
            totalzarib = totalzarib + zarib[i] ;
        }
        float avg = total/totalzarib ;
        System.out.println("avg is : " + avg);
    }
    }