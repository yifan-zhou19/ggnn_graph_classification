package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] sz = new int[100][100];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < row;j++)
		{
			for (i = 0;i < col;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[j][i] = Integer.parseInt(tempVar3);
				}
			}
		}

		int n;
		int k;
		int I;
		int J;
		int M;
		int N;
		if (col % 2 == 0 && row % 2 == 0)
		{
			if (col <= row)
			{
				n = col / 2;
			}
			else
			{
				n = row / 2;
			}
			for (k = 0;k < n;k++)
			{
				for (I = k;I < col - k - 1;I++)
				{
						   System.out.printf("%d\n",sz[k][I]);
				}
					 for (J = k;J < row - k - 1;J++)
					 {
					System.out.printf("%d\n",sz[J][col - k - 1]);
					 }
				for (M = col - k - 1;M > k;M--)
				{
					System.out.printf("%d\n",sz[row - k - 1][M]);
				}
					 for (N = row - k - 1;N > k;N--)
					 {
					System.out.printf("%d\n",sz[N][k]);
					 }
			}
		}
		else
		{
			if (row <= col)
			{
				n = row / 2 + 1;
				for (k = 0;k < n;k++)
				{
					for (I = k;I < col - k - 1;I++)
					{
						 System.out.printf("%d\n",sz[k][I]);
					}
					if (2 * k < row - 1)
					{
						for (J = k;J < row - k - 1;J++)
						{
							  System.out.printf("%d\n",sz[J][col - k - 1]);
						}
					}
					else
					{
					for (J = k;J <= row - k - 1;J++)
					{
						System.out.printf("%d\n",sz[J][col - k - 1]);
					}
					break;
					}
						 for (M = col - k - 1;M > k;M--)
						 {
						System.out.printf("%d\n",sz[row - k - 1][M]);
						 }
						 for (N = row - k - 1;N > k;N--)
						 {
						System.out.printf("%d\n",sz[N][k]);
						 }
				}
			}
			else
			{
				n = col / 2 + 1;
				for (k = 0;k < n;k++)
				{
					for (I = k;I < col - k - 1;I++)
					{
							 System.out.printf("%d\n",sz[k][I]);
					}
					if (k != n - 1)
					{
							 for (J = k;J < row - k - 1;J++)
							 {
							System.out.printf("%d\n",sz[J][col - k - 1]);
							 }
					}
					 else
					 {
					for (J = k;J <= row - k - 1;J++)
					{
						System.out.printf("%d\n",sz[J][col - k - 1]);
					}
					break;
					 }
					for (M = col - k - 1;M > k;M--)
					{
						System.out.printf("%d\n",sz[row - k - 1][M]);
					}
						 for (N = row - k - 1;N > k;N--)
						 {
						System.out.printf("%d\n",sz[N][k]);
						 }
				}
			}
		}
		return 0;
	}

}

