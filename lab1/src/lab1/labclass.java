package lab1;
import java.util.Scanner;
public class labclass {
	String filmname; //��������
	int year; //���
	String country; //������
	String genre; //����
	int price; //��������� �������
	
	
	public labclass() { //����������� 
		Scanner scanner = new Scanner(System.in);		
		System.out.println("filmname = ");
	     filmname = scanner.nextLine();
	     System.out.println("genre = ");
	     genre = scanner.nextLine();
	     System.out.println("country = ");
	     country = scanner.nextLine();
	     System.out.println("year = ");
	     year = scanner.nextInt();
	     System.out.println("price = ");
	     price = scanner.nextInt();
	}
}


