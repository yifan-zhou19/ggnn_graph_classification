package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : 4.cpp
	// Author      : 
	// Version     :
	// Copyright   : Your copyright notice
	// Description : Hello World in C++, Ansi-style
	//============================================================================


	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] a = new double[1000];
		double[] b = new double[1000];
		for (int i = 0;i < n;i++) //????
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		double sum = 0;
		for (int i = 0;i < n;i++)
		{
			sum += a[i];
		}
		double average = sum / n; //?????
		for (int i = 0;i < n;i++)
		{
			b[i] = Math.abs(a[i] - average);
		}
		double max1 = b[0]; //??????
		for (int i = 0;i < n;i++)
		{
			max1 = Math.max(max1,b[i]);
		}
		double[] c = new double[1000];
		int num = 0;
		for (int i = 0;i < n;i++) //?????????
		{
			if (b[i] == max1)
			{
				c[num] = a[i];
				num++;
			}
		}
		sort(c,c + num - 1); //?????
		System.out.print(c[0]);
		for (int i = 1;i < num;i++)
		{
			System.out.print(",");
			System.out.print(c[i]);
		}
		return 0;
	}

}

