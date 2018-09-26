package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : 1.cpp
	// Author      : 
	// Version     :
	// Copyright   : Your copyright notice
	// Description : Hello World in C++, Ansi-style
	//============================================================================


	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int[] b = new int[n];
		int m = 0;
		for (int i = 0;i < n;i++) //?a[n]?????????b[n]
		{
			if (a[i] % 2 == 1)
			{
				b[m] = a[i];
				m++;
			}
		}
		sort(b,b + m); //?b[n]?????
		System.out.print(b[0]);
		for (int i = 1;i < m;i++) //??b[n]
		{
			System.out.print(",");
			System.out.print(b[i]);
		}
		return 0;
	}

}

