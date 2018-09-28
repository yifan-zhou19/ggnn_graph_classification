package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : 13.cpp
	// Author      : 
	// Version     :
	// Copyright   : Your copyright notice
	// Description : Hello World in C++, Ansi-style
	//============================================================================


	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] x = new int[10];
		int m;
		int[] a = new int[200];
		for (int i = 0;i < n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 0;i < m;i++)
			{
				x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			x[m] = 60; //?????60?
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,400);
			int num = -3;
			int sum = 0;
			for (int i = 0;i <= m;i++)
			{
				for (num += 3;sum < x[i];sum++,num++) //????????????1
				{
					a[num] = 1;
				}
			}
			int sum2 = 0;
			for (int i = 0;i < 60;i++) //????
			{
				sum2 += a[i];
			}
			System.out.print(sum2);
			System.out.print("\n");
		}
		return 0;
	}

}

