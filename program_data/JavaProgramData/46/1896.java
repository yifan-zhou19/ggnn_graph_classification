package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] s = new int[100][100];
		int row;
		int col;
		int n = 0;
		int m = 0;
		int k;
		int a = 0;
		int b = 1;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= row - 1;i++)
		{
			for (j = 0;j <= col - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		k = row * col;
		for (i = 1;i <= k;i++)
		{
			System.out.printf("%d\n", s[n][m]);
			if (n == b - 1 && m < col - 1)
			{
						m = m + 1;
			}
			else if (n < row - 1 && m == col - 1)
			{
							 n = n + 1;
			}
				 else if (n == row - 1 && m == col - 1)
				 {
								   m = m - 1;
				 }
					  else if (n == row - 1 && m < col - 1 && m> a)
					  {
										m = m - 1;
					  }
						   else if (n == row - 1 && m == a)
						   {
											 n = n - 1;

						   }
								else if (n < row - 1 && m == a && b < n)
								{
												 n = n - 1;
								}
									 else if (n == b && m == a)
									 {
												   m = m + 1;
												   a = a + 1;
												   b = b + 1;
												   row = row - 1;
												   col = col - 1;
									 }
		}

		return 0;
	}







}

