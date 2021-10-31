package lab2_example4;

public class Rec4 {
	
	public static int fact(int n){
		int result;
		if (n==1)
		return 1;
		else{
		result=fact(n-1)*n;
		return result;
		}
		}

	public static void main(String[] args) {
		int f = fact(5);
		System.out.println("f = " + f);
	}

}
