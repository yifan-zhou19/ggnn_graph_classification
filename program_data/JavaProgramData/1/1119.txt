package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  HomeWork_11.14.Functions
	//  ????
	//  Created by ??? on 11/19/12.
	//  Copyright (c) 2012 airjcy. All rights reserved.
	//

	///#include <string>



	//??n???????????from
	public static int num;
	public static void divide(int n,int from)
	{

		int i;
		for (i = from; i < n; i++)
		{
			if (n % i == 0)
			{
				if (n / i < i)
				{
					return;
				}
				num++;
				divide(n / i, i);
			}

		}
	}


	// 20    2 10   2 2 5     4 5    5 4
	public static void Main(String[] args)
	{

		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int numberToDivide;
		for (i = 0; i < n; i++)
		{
			numberToDivide = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num = 0;
			divide(numberToDivide, 2);
			System.out.print(num + 1);
			System.out.print("\n");
		}

	//    num =0;
	//    divide(20, 2);
	//    cout << num + 1;
	}

}

