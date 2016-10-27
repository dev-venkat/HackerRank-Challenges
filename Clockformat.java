import java.io.*;
import java.util.*;

#program to convert 12 hour clock to 24 hour clock

public class Clockformat {

    public static void main(String[] args) {
	
	System.out.println("Enter time in HH:MM:SSAM/PM format: ");
        Scanner in = new Scanner(System.in);
        String time = in.next();
        
        if(time.substring(8)=="AM")            
            System.out.println(time.substring(1,8));
        else{
            int t=0;
            t = Integer.parseInt(time.substring(1,2))+12;
            time = t+time.substring(2,8);
            System.out.println(time);
        }
    }
}
