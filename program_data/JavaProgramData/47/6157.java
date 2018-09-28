package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : 8.cpp
	// Author      : 
	// Version     :
	// Copyright   : Your copyright notice
	// Description : 
	//============================================================================


	public static int Main()
	{
		int n = 0;
		int i = 0;
		int j = 0;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100000];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0,j = n - 1;i < j;i++,j--)
		{
			t = a[i];
			a[i] = a[j];
			a[j] = t;
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n - 1]);
		return 0;
	}

}

