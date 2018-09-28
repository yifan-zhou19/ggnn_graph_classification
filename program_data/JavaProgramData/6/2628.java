package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  Homework
	//  Xcode Version 5.0.2 (5A3005)
	//  OS X Version 10.9 (13A603)
	//  Created by ??? on 13-12-4.
	//  Copyright (c) 2013? ???. All rights reserved.
	//


	public static int Main()
	{
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int time = 0;time < t;time++)
		{
			int m;
			int n;
			int sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[][] a = new int[m][n];
			for (int i = 0;i < m;i++)
			{
				for (int j = 0;j < n;j++)
				{
					*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			for (int i = 0;i < n;i++)
			{
				sum += *(a + i) + (n > 1) * *(*(a + m - 1) + i);
			}
			for (int i = 1;i < m - 1;i++)
			{
				sum += *(*(a + i)) + (m > 1) * *(*(a + i) + n - 1);
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

