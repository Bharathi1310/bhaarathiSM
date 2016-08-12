import java.util.Scanner;
public class Repeated {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int count=0;
	int a[]=new int[n];
   
    int b=0;
    for(int i=0;i<a.length;i++){
      a[i]=in.nextInt();
    for(int j=i;j<a.length;j++){
    	if(a[0]==a[j]){
         count++;
    }
    }
    }System.out.println(a[0]);
    System.out.println(count);
	}

}
