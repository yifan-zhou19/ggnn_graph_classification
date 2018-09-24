package <missing>;

public class GlobalMembers
{
	//  ????
	//  main.cpp
	//  Homework
	//
	//  Created by ??? on 13-10-31.
	//  Copyright (c) 2013? ???. All rights reserved.
	//


	public static int Main()
	{
		int n;
		int m;
		int total = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String student = new String(new char[n]);
		double[][] dorm = new double[n + 2][n + 2]; //?????????????
		double[][] tempdorm = new double[n + 2][n + 2];
		for (int i = 1;i < n + 1;i++)
		{
			student = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (int s = 1;s < n + 1;s++)
			{
				if (student.charAt(s - 1) == '.')
				{
					dorm[i][s] = 1;
				}
				if (student.charAt(s - 1) == '#')
				{
					dorm[i][s] = 0; //0???????0 ????????
				}
				if (student.charAt(s - 1) == '@')
				{
					dorm[i][s] = 2;
				}
			}
		}

		for (int i = 1;i < n + 1;i++)
		{
			for (int j = 1;j < n + 1;j++)
			{
				tempdorm[i][j] = dorm[i][j];
			}
		}

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int d = 1;d < m;d++)
		{
			for (int i = 1;i < n + 1;i++)
			{
				for (int j = 1;j < n + 1;j++)
				{
				if (dorm[i][j] > 1)
				{
						tempdorm[i - 1][j] = dorm[i - 1][j] * dorm[i][j]; //?tempdorm????????dorm??????????????????�??�?????????�??�???
						tempdorm[i + 1][j] = dorm[i + 1][j] * dorm[i][j];
						tempdorm[i][j - 1] = dorm[i][j - 1] * dorm[i][j];
						tempdorm[i][j + 1] = dorm[i][j + 1] * dorm[i][j];
				}
				}
			}
			for (int i = 1;i < n + 1;i++)
			{
				for (int j = 1;j < n + 1;j++)
				{
					if (tempdorm[i][j] > 1)
					{
						dorm[i][j] = 2;
					}
				}
			}
		}

		for (int i = 1;i < n + 1;i++) //????
		{
			for (int j = 1;j < n + 1;j++)
			{
				if (dorm[i][j] > 1)
				{
					total++;
				}
			}
		}

		System.out.print(total);
		System.out.print("\n");
		return 0;
	}
}

