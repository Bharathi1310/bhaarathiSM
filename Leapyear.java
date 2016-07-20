# bhaarathiSM
import java.util.Scanner;
public class Leapyear {
public static void main(String[] args) {
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year:");
		year=sc.nextInt();
    if(year%4==0 && year%400==0)
    {
    	System.out.print("leap year");
    }
    else if(year%100==0)
    {
    	System.out.print("not a leap year");
    }
    else
    {
    	System.out.print("not a leap year");
    }
	}

}
