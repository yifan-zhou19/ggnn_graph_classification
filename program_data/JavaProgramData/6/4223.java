package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : 7.cpp
	// Author      : 
	// Version     :
	// Copyright   : Your copyright notice
	// Description : Hello World in C++, Ansi-style
	//============================================================================


	public static int sum = 0;
	public static void ijudge(int i,int j,int k,int p,int q)
	{
		if ((j == 0) || (j == p - 1) || (k == 0) || (k == q - 1))
		{
			sum += i;
		}
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
		int p;
		int q;
		for (int i = 0;i < n;i++)
		{
			p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = 0;
			for (int j = 0;j < p;j++)
			{
				for (int k = 0;k < q;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					ijudge(a[j][k], j, k, p, q);
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

