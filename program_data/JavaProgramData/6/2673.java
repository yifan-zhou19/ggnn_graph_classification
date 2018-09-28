package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : juzhenbianyuan.cpp
	// Author      : 
	// Version     :
	// Copyright   : Your copyright notice
	// Description : Hello World in C++, Ansi-style
	//============================================================================


	public static int Main()
	{
		int[][] a = new int[101][101];
			int r;
			int c;
			int j;
			int k;
			int l;
			int m;
			int sum;
			int n;
			int p;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  for (p = 1;p <= n;p++)
		  {
			  sum = 0;
			r = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 0;i < r;i++)
			{
				for (int j = 0;j < c;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}


			for (j = 0;j < r;j++)
			{
				sum = sum + **(a + j); //?????????
			}

			for (k = 1;k < c;k++)
			{
				sum = sum + *(*(a + r - 1) + k); //?????????
			}
			for (l = r - 2;l >= 0;l--)
			{
				sum = sum + *(*(a + l) + c - 1); //?????????
			}
			for (m = 1;m < c - 1;m++)
			{
				sum = sum + *(*(a + 0) + m); //?????????
			}
		 System.out.print(sum);
		 System.out.print("\n");

		  }
		return 0;
	}

}

