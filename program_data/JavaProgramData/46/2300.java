package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] mat = new int[100][100];
		int i;
		int j;
		int row;
		int col;
		int m = 0;
		int n = 0;
		int count = 0;

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

		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 100;j++)
			{
				mat[i][j] = -1;
			}
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					mat[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (;;)
		{
			for (;;)
			{
				System.out.printf("%d\n",mat[m][n]);
				count++;
				mat[m][n] = -1;
				n++;
				if (mat[m][n] == -1)
				{
					n--;
					m++;
					break;
				}
			}
			if (count >= row * col)
			{
				break;
			}
			for (;;)
			{
				System.out.printf("%d\n",mat[m][n]);
				count++;
				mat[m][n] = -1;
				m++;
				if (mat[m][n] == -1)
				{
					m--;
					n--;
					break;
				}
			}
			if (count >= row * col)
			{
				break;
			}
			for (;;)
			{
				System.out.printf("%d\n",mat[m][n]);
				count++;
				mat[m][n] = -1;
				n--;
				if (mat[m][n] == -1)
				{
					n++;
					m--;
					break;
				}
			}
			if (count >= row * col)
			{
				break;
			}
			for (;;)
			{
				System.out.printf("%d\n",mat[m][n]);
				count++;
				mat[m][n] = -1;
				m--;
				if (mat[m][n] == -1)
				{
					m++;
					n++;
					break;
				}
			}
			if (count >= row * col)
			{
				break;
			}
		}
		return 0;
	}
}

