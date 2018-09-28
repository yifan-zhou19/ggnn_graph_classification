package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  Homework
	//
	//  Created by ??? on 13-11-20.
	//  Copyright (c) 2013? ???. All rights reserved.
	//


	public static int jiaogu(int n)
	{
		if (n == 1)
		{
			System.out.print("End");
			System.out.print("\n");
			return 0;
		}
		else
		{
			if (n % 2 == 1)
			{
				System.out.print(n);
				System.out.print("*3+1=");
				n = n * 3 + 1;
				System.out.print(n);
				System.out.print("\n");
				jiaogu(n);
			}
			else
			{
				System.out.print(n);
				System.out.print("/2=");
				n /= 2;
				System.out.print(n);
				System.out.print("\n");
				jiaogu(n);
			}
		}
		return 0;
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		jiaogu(n);
		return 0;
	}

}

