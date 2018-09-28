package <missing>;

public class GlobalMembers
{
	public static int[] b = new int[10000];
	public static void bianli(int[][] a, int m, int n)
	{
		int i;
		int j;
		int k = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		p = b;
		for (i = 0;k < (m + 1) * (n + 1);i++)
		{
			for (j = i;j <= n - i;j++)
			{
				*p = a[i][j];
				p++;
				k++;
			}
			for (j = i + 1;j <= m - i;j++)
			{
				*p = a[j][n - i];
				p++;
				k++;
			}
			for (j = n - i - 1;j >= i;j--)
			{
				*p = a[m - i][j];
				p++;
				k++;
			}
			for (j = m - i - 1;j > i;j--)
			{
				*p = a[j][i];
				p++;
				k++;
			}

		}

	}
	public static void Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int row;
		int col;
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
		bianli(a, row - 1, col - 1);
		for (i = 0;i < row * col;i++)
		{
			System.out.printf("%d\n",b[i]);
		}

	}

}

