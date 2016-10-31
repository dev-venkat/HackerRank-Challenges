import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//program to compare two sets of triplets[A(a0,a1,a2) and B(b0,b1,b2)] and display the cumulative score a b

public class Triplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        int a,b;
        a=0;
        b=0;
        
        a+=((a0>b0)?1:0)+((a1>b1)?1:0)+((a2>b2)?1:0);
        b+=((a0<b0)?1:0)+((a1<b1)?1:0)+((a2<b2)?1:0);
        
        System.out.println(a+" "+b);
    }
}
