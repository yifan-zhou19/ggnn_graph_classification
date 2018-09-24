package <missing>;

public class GlobalMembers
{
	public static int re(int[][] a, int row, int col, int[] b)
	{
		int i;
		int j;
		int k = 0;
		int p;
		int mm;
		int m;
		for (i = 0;i <= row / 2;i++)
		{
			for (j = i;j < col - i && k < row * col;j++)
			{
				b[k] = a[i][j];
			k++;
			}

			for (p = i + 1;p < row - i && k < row * col;p++)
			{
				b[k] = a[p][j - 1];
				k++;
			}

			for (mm = (col - 2 - i);mm >= i != 0 && k < row * col;)
			{
				b[k] = a[row - i - 1][mm];
				k++;
				mm--;
			}

			for (m = row - 2 - i;m > i && k < row * col;m--)
			{
				b[k] = a[m][i];
				k++;
			}
		}

		return k;
	}



	public static int Main()
	{
		int[][] a = new int[100][100];
		int[] b = new int[10000];
		int row;
		int col;
		int i;
		int j;
		int xx;

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

		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		xx = re(a, row, col, b);
		for (i = 0;i < xx;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
		return 0;
	}

}

