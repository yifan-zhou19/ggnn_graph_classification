package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012795-zhong-5.cpp
	 *
	 *  Created on: 2010-11-17
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int[] a = {17, 27, 37, 47, 57, 67, 71, 72, 73, 74, 75, 76, 78, 79, 87, 97, 0};
		int[] b = {7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84, 91, 98};
		int n;
		int i;
		int j;
		int sum;
		int num;
		int he;
		int wuguan;
		sum = 0,num = 0,he = 0,wuguan = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 17;i++)
		{
			if (a[i] <= n)
			{
				sum = a[i] * a[i] + sum;
			}
		}
		for (j = 0;j < 14;j++)
		{
			if (b[j] <= n)
			{
				num = num + b[j] * b[j];
			}
		}
		he = num + sum;
		wuguan = (n * (n + 1) * (2 * n + 1)) / 6;
		wuguan = wuguan - he;
		System.out.print(wuguan);
		return 0;
	}

}

