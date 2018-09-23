package <missing>;

public class GlobalMembers
{
	/*
	 ********************************************************************
	 ****** FileNm : app.cpp		
	 ****** CreatT : 2012-12-27			
	 ****** Author : Tom JIASHENG LUO ** Mail Me : CrysTom@163.com ******
	 ****** Teacher: XUANZHE LIU ******* School	: Peking University	*****
	 ********************************************************************
	 */

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int total;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[n][n];
		int numbers = n;
		for (k = 0; k < numbers; k++)
		{
			total = 0;
			for (i = 0; i < numbers; i++)
			{
				for (j = 0; j < numbers; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (n = numbers; n > 1; n--)
			{
				for (i = 0; i < n; i++)
				{
					int temp = a[i][0];
					for (j = 1; j < n; j++)
					{
						if (a[i][j] < temp)
						{
							temp = a[i][j];
						}
					}
					for (j = 0; j < n; j++)
					{
						a[i][j] -= temp;
					}
				}
				for (j = 0; j < n; j++)
				{
					int temp = a[0][j];
					for (i = 1; i < n; i++)
					{
						if (a[i][j] < temp)
						{
							temp = a[i][j];
						}
					}
					for (i = 0; i < n; i++)
					{
						a[i][j] -= temp;
					}
				}
				total += a[1][1];
				for (i = 0; i < n; i++) //?????
				{
					for (j = 1; j < n - 1; j++)
					{
						a[i][j] = a[i][j + 1];
					}
				}
				for (j = 0; j < n - 1; j++) //?????
				{
					for (i = 1; i < n - 1; i++)
					{
						a[i][j] = a[i + 1][j];
					}
				}
			}
			System.out.print(total);
			System.out.print("\n");
		}
		return 0;
	}

}

