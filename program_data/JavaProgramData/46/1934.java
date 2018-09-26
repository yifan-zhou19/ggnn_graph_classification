package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int sxrow;
	int xxrow;
	int sxcol;
	int xxcol;
	int i;
	int j;
	int[][] a = new int[M][N];
	int num;
	int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Integer.parseInt(tempVar3);
			}
			}
		}
		num = m * n;
		sxrow = m - 1;
		xxrow = 0;
		sxcol = n - 1;
		xxcol = 0;
		while (s != num)
		{
		for (i = xxcol;i <= sxcol;i++)
		{
			System.out.printf("%d\n",a[xxrow][i]);
			s++;
		}
		if (s == num)
		{
			break;
		}
		for (i = xxrow + 1;i <= sxrow;i++)
		{
			System.out.printf("%d\n",a[i][sxcol]);
			s++;
		}


		if (s == num)
		{
			break;
		}
		for (i = sxcol - 1;i >= xxcol;i--)
		{
			System.out.printf("%d\n",a[sxrow][i]);
			s++;
		}

		if (s == num)
		{
			break;
		}
		xxrow++;
		xxcol++;


		for (i = sxrow - 1;i >= xxrow;i--)
		{
			System.out.printf("%d\n",a[i][xxcol - 1]);
			s++;
		}

		if (s == num)
		{
			break;
		}
		sxrow--;
		sxcol--;

		}
		return 0;
	}

}

