import java.io.*;
import java.util.*;

//program to convert 12 hour clock to 24 hour clock

public class Clockformat {

    public static void main(String[] args) {
	
	System.out.println("Enter time in HH:MM:SSAM/PM format: ");
        Scanner in = new Scanner(System.in);
        String time = in.next();
        
        if((time.substring(8).equals("AM") && !(time.substring(0,2).equals("12"))) 
           || (time.substring(8).equals("PM") && time.substring(0,2).equals("12"))){
            System.out.println(time.substring(0,8));
        }
        else if(time.substring(8).equals("AM") && time.substring(0,2).equals("12")){
            int t=0;
            t = Integer.parseInt(time.substring(0,2))-12;
            String T= String.format("%02d",t);
            time = T+time.substring(2,8);
            System.out.println(time);
        }          
        else{
            int t=0;
            t = Integer.parseInt(time.substring(0,2))+12;
			String T= String.format("%02d",t);
            time = T+time.substring(2,8);
            System.out.println(time);
        }
    }
}
