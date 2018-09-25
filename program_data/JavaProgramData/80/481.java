package <missing>;

public class GlobalMembers
{
	/*
	 * 111111111111.cpp
	 *
	 *  Created on: 2011-1-9
	 *      Author: jsgl
	 */
	public static int panrun(int x)
	{ //???????????????366??????365
		if (x % 100 != 0)
		{
			if (x % 4 == 0 && x % 100 != 0)
			{
				return 366;
			}
			else
			{
				return 365;
			}
		}
		else
		{
			if (x % 400 == 0)
			{
				return 366;
			}
			else
			{
				return 365;
			}
		}
	}
	public static int Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum = 0;
		int i = 0;
		int[] a = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = y1 + 1; i < y2; i++)
		{
			sum1 = sum1 + panrun(i);
		}
		//cout << sum1 << " ";
		if (panrun(y1) == 366)
		{
			for (i = 0; i < m1; i++)
			{
				sum2 = sum2 + a[i];
			}
			sum2 = sum2 + d1;
			if (y1 != y2)
			{
				sum2 = 366 - sum2;
			}
		}
		else
		{
			for (i = 0; i < m1; i++)
			{
				sum2 = sum2 + b[i];
			}
			sum2 = sum2 + d1;
			if (y1 != y2)
			{
				sum2 = 365 - sum2;
			}
		}
		//cout << sum2 << " ";
		if (panrun(y2) == 366)
		{
			for (i = 0; i < m2; i++)
			{
				//cout<<"***"<<endl;
				sum3 = sum3 + a[i];
			}
			sum3 = sum3 + d2;
		}
		else
		{
			for (i = 0; i < m2; i++)
			{
				sum3 = sum3 + b[i];
			}
			sum3 = sum3 + d2;
		}
		//cout << sum3 << endl;
		if (y1 != y2)
		{
			sum = sum1 + sum2 + sum3;
		}
		else
		{
			sum = sum3 - sum2;
		}
		System.out.print(sum);
		System.out.print("\n");

		return 0;
	}

}

