package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int num = 0;
		int firh = 0;
		int lash;
		int firl = 0;
		int lasl;
		int i;
		int j;
		int row;
		int col;
		int[][] a = new int[105][105];
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
		lash = row - 1;
		lasl = col - 1;
		while (num <= (row * col))
		{
			for (i = firl;i <= lasl;i++)
			{
				System.out.printf("%d\n",a[firh][i]);
				num++;
			}
			if (num == row * col)
			{
				break;
			}
			firh++;
			for (i = firh;i <= lash;i++)
			{
				System.out.printf("%d\n",a[i][lasl]);
				num++;
			}
			if (num == row * col)
			{
				break;
			}
			lasl--;
			for (i = lasl;i >= firl;i--)
			{
				System.out.printf("%d\n",a[lash][i]);
				num++;
			}
			if (num == row * col)
			{
				break;
			}
			lash--;
			for (i = lash;i >= firh;i--)
			{
				System.out.printf("%d\n",a[i][firl]);
				num++;
			}
			if (num == row * col)
			{
				break;
			}
			firl++;
		}
	}
}

