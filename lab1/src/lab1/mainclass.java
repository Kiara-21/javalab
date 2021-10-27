package lab1;

import java.util.Scanner;
import java.util.*; 

public class mainclass {

	public static void main(String[] args) 
	{
		labclass[] arr = new labclass[5]; //новый массив из 5 обьектов класса

		for (int i = 0; i<5; i++)
		{
            arr[i] = new labclass(); //создание
        }
		
		double sum_price = 0; //сумма проката фильмов
		
		for (int i = 0; i<5; i++)
		{
            sum_price = sum_price + arr[i].price; //подсчет суммы
        }
		
		double middle_price = sum_price/5; //определение средней стоимость проката
		
		System.out.println("> middle price:");
		
		for (int i = 0; i<5; i++)
		{
			if (arr[i].price > middle_price) //поиск фильмов со стоимостью проката выше средней
			{
				System.out.println(arr[i].filmname);
			}
        }
		
		double small_year = arr[0].year; //самый низкий год
		int s_num = 0; //номер фильма самого раннего года выпуска
		
		for (int i = 0; i<5; i++)
		{
			if (arr[i].year < small_year) 
			{
				small_year = arr[i].year; //поиск
				s_num = i;
			}
        }
		System.out.println("********smallest year********");
		System.out.println(arr[s_num].filmname); //вывод самого раннего фильма
		
		
		String[] ar = new String[5]; //доп. массив для соротировки по именам
		
		for (int i = 0; i<5; i++)
		{
			ar[i] = arr[i].filmname; //заполнение
        }
		
		Arrays.sort(ar); //сортировка
		
		System.out.println("********sorted********");
		for (int i = 0; i<5; i++)
		{
			System.out.println(ar[i]); //вывод отсортированных по алфавиту
        }
		
		Scanner in = new Scanner(System.in);
		System.out.println("film name = ");
	    String film_name = in.nextLine(); //ввод названия фильма который необходимо найти
		
	    for (int i = 0; i<5; i++)
		{
	    	if (film_name.equalsIgnoreCase(arr[i].filmname))  //поиск
			{
	    		Scanner in2 = new Scanner(System.in);
	    		arr[i].filmname = in2.nextLine(); //изменение названия фильма
				System.out.println("info: ");		//вывод информации
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
