package lab1;

import java.util.Scanner;
import java.util.*; 

public class mainclass {

	public static void main(String[] args) 
	{
		labclass[] arr = new labclass[5]; //����� ������ �� 5 �������� ������

		for (int i = 0; i<5; i++)
		{
            arr[i] = new labclass(); //��������
        }
		
		double sum_price = 0; //����� ������� �������
		
		for (int i = 0; i<5; i++)
		{
            sum_price = sum_price + arr[i].price; //������� �����
        }
		
		double middle_price = sum_price/5; //����������� ������� ��������� �������
		
		System.out.println("> middle price:");
		
		for (int i = 0; i<5; i++)
		{
			if (arr[i].price > middle_price) //����� ������� �� ���������� ������� ���� �������
			{
				System.out.println(arr[i].filmname);
			}
        }
		
		double small_year = arr[0].year; //����� ������ ���
		int s_num = 0; //����� ������ ������ ������� ���� �������
		
		for (int i = 0; i<5; i++)
		{
			if (arr[i].year < small_year) 
			{
				small_year = arr[i].year; //�����
				s_num = i;
			}
        }
		System.out.println("********smallest year********");
		System.out.println(arr[s_num].filmname); //����� ������ ������� ������
		
		
		String[] ar = new String[5]; //���. ������ ��� ����������� �� ������
		
		for (int i = 0; i<5; i++)
		{
			ar[i] = arr[i].filmname; //����������
        }
		
		Arrays.sort(ar); //����������
		
		System.out.println("********sorted********");
		for (int i = 0; i<5; i++)
		{
			System.out.println(ar[i]); //����� ��������������� �� ��������
        }
		
		Scanner in = new Scanner(System.in);
		System.out.println("film name = ");
	    String film_name = in.nextLine(); //���� �������� ������ ������� ���������� �����
		
	    for (int i = 0; i<5; i++)
		{
	    	if (film_name.equalsIgnoreCase(arr[i].filmname))  //�����
			{
	    		Scanner in2 = new Scanner(System.in);
	    		arr[i].filmname = in2.nextLine(); //��������� �������� ������
				System.out.println("info: ");		//����� ����������
				System.out.println(arr[i].filmname);
				System.out.println(arr[i].country);
				System.out.println(arr[i].genre);
				System.out.println(arr[i].year);
				System.out.println(arr[i].price);
				break;
			}
        }
		
	}

}
