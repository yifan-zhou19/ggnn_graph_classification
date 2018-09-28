package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : 2.cpp
	// Author      : 
	// Version     :
	// Copyright   : Your copyright notice
	// Description : Hello World in C++, Ansi-style
	//============================================================================


	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100];
		int[] b = new int[100];
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
			b[i] = a[n - 1 - i];
		}
		System.out.print(b[0]);
		for (int i = 1;i < n;i++)
		{
			a[i] = b[i];
			System.out.print(" ");
			System.out.print(a[i]);
		}
		return 0;
	}
}

