package <missing>;

public class GlobalMembers
{
	/*
	 * poj03.cpp
	 *
	 *  Created on: 2011-9-23
	 *      Author: G199
	 */


	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int f;
		double[] male = new double[50];
		double[] female = new double[50];
		double h;
		double temp;
		String sex = new String(new char[20]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = f = 0;
		while (n-- != 0)
		{
			sex = ConsoleInput.readToWhiteSpace(true).charAt(0);
			h = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (sex.charAt(0) == 'm')
			{
				male[m++] = h;
			}
			else
			{
				female[f++] = h;
			}
		}
		for (i = 0; i < m; i++)
		{
			for (j = m - 1; j > i; j--)
			{
				if (male[j - 1] > male[j])
				{
					temp = male[j - 1];
					male[j - 1] = male[j];
					male[j] = temp;
				}
			}
		}
		for (i = 0; i < f; i++)
		{
			for (j = f - 1; j > i; j--)
			{
				if (female[j - 1] < female[j])
				{
					temp = female[j - 1];
					female[j - 1] = female[j];
					female[j] = temp;
				}
			}
		}
		for (i = 0; i < m; i++)
		{
			System.out.printf("%.2f", male[i]);
			System.out.printf("%.2f", ' ');
		}
		for (i = 0; i < f - 1; i++)
		{
			System.out.printf("%.2f", female[i]);
			System.out.printf("%.2f", ' ');
		}
		System.out.printf("%.2f", female[f - 1]);
		System.out.printf("%.2f", "\n");
		return 0;
	}

}

