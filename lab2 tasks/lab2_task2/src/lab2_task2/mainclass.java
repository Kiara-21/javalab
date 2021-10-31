package lab2_task2;
import java.util.Scanner;

public class mainclass {
	public static String toBinary(int num) {
		  if (num>0)
		    return toBinary(num / 2) + (num % 2);
		  else 
		    return "";
		}
	public static void main(String[] args) {
		Scanner in2 = new Scanner(System.in);
		int a = in2.nextInt();
		String s = toBinary(a);
		System.out.println("s = " + s);
	}

}
