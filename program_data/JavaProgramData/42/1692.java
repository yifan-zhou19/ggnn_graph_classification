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
		int n1 = n; //n1???????????
		int[] a = new int[n];
		for (int i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int b;
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int t = 1; //t????????????????????????????????????
		for (int i = 1;t <= n;i++)
		{
			if (a[t] == b) //???????
			{
				n1 = n1 - 1;
				for (int j = t;j <= n;j = j + 1)
				{
					a[j] = a[j + 1];
				}
				t = t - 1; //???????????????????????
			}
			t = t + 1;
		}
		System.out.print(a[1]);
		for (int i = 2;i <= n1;i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		return 0;
	}

}

