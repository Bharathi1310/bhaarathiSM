import java.util.Scanner;
public class hcf {
public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the first number");
        int a=in.nextInt();
        System.out.println("enter the second number");
	   int b=in.nextInt();
	   int c=0;
	   int temp;
	   temp=a;
	   a=b;
	   b=temp;
	   c=a%b;
	   System.out.println(c);
	}

}
