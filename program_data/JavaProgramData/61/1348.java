package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  10.15 homework
	//  ??????

	//  Created by airjcy on 10/8/12.
	//  Copyright (c) 2012 airjcy. All rights reserved.
	//






	public static void Main(String[] args)
	{
		int n; //????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		for (i = 0; i < n; i++)
		{
			int a = 1;
			int b = 1;
			int num; //??????
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int j;
			int t;
			for (j = 1; j < num; j++)
			{
				t = b;
				b = a + b;
				a = t;
			}
			System.out.print(a);
			System.out.print("\n");
		}

	}
}

