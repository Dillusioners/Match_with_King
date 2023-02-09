/**
 * Author - Jayspray
 * Team - DIllusioners
 * SuperB mystery event
**/

import java.io.*;
class pattern_choice
{
	static void display()
	{
		System.out.println("##############################################");
		System.out.println("	Welcome to the Pattern Printer        ");
		System.out.println("##############################################");
	}
	static void square(int rows){

		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=rows; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
	static void triangle(int rows){

		for(int i=1; i <= rows; i++)
		{
			for(int j=i; j<=rows; j++)
				System.out.print(" ");
			for(int j=1; j<=i; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
	static void rectangle(int rows,int coloumns){

		for(int i=1; i <= rows; i++)
		{
			for(int j=1; j<=coloumns; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	static void diamond(int rows)
	{
		if(rows % 2 != 0)
			rows++;
		for(int i=1; i <= rows/2; i++)
		{
			for(int j=i; j <= rows/2; j++)
				System.out.print(" ");
			for(int j=1; j <= i; j++)
				System.out.print("* ");
			System.out.println();
		}
		for(int i=1; i<rows/2; i++)
		{
			for(int j=0; j<=i; j++)
				System.out.print(" ");
			for(int j=i; j<rows/2; j++)
				System.out.print("* ");
			System.out.println();
		}
	}


	static void runner(int user_choice)throws IOException
	{
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		int r;
		switch(user_choice)
		{
		case 1:
			System.out.println(">> Enter number of rows : ");
			r = Integer.parseInt(rd.readLine());
			square(r);
			break;
		case 2:
			System.out.println(">> Enter number of rows : ");
			r = Integer.parseInt(rd.readLine());
			triangle(r);
			break;
		case 3:
			System.out.println(">> Enter number of rows : ");
			r = Integer.parseInt(rd.readLine());
			System.out.println(">> Enter number of coloumns : ");
			int c = Integer.parseInt(rd.readLine());
			rectangle(r,c);
			break;
		case 4:
			System.out.println(">> Enter number of rows : ");
			r = Integer.parseInt(rd.readLine());
			diamond(r);
			break;
		default:
			System.out.print("Invalid Ouput!");
		}
	}
	public static void main(String[] args)throws IOException
	{

		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		display();
		System.out.println("Choose any option :- ");
		System.out.println("1.Square\n2.Triangle\n3.Rectangle\n4.Diamond");
		try
		{
			int choice = Integer.parseInt(rd.readLine());
			
			runner(choice);

		}
		catch(Exception e)
		{
			System.err.println(":/ Check input");
		}
	}
}