import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

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
        
        a=(a0>b0)?1:0;
        b=(a0<b0)?1:0;
        a+=(a1>b1)?1:0;
        b+=(a1<b1)?1:0;
        a+=(a2>b2)?1:0;
        b+=(a2<b2)?1:0;
        
        System.out.println(a+" "+b);
    }
}
