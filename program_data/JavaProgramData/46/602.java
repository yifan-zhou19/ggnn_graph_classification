package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int[][] a = new int[100][100];
		int p = 0;
		int q = 0;
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 100;j++)
			{
				a[i][j] = -1;
			}
		}
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
		if (col == 1)
		{
			for (j = 0;j < row;j++)
			{
				System.out.printf("%d\n",a[j][0]);
				a[0][j] = -1;
			}
		}
		else
		{
		for (i = row - 1,j = col - 1;i > 0,j > 0;i--,j--)
		{
			for (;q <= j - 1;q++)
			{
				if (a[p][q] != -1)
				{
				System.out.printf("%d\n",a[p][q]);
				}
				a[p][q] = -1;
			}
			for (;p <= i - 1;p++)
			{
				if (a[p][q] != -1)
				{
				System.out.printf("%d\n",a[p][q]);
				}
				a[p][q] = -1;
			}
			for (;q >= col - j;q--)
			{
				if (a[p][q] != -1)
				{
				System.out.printf("%d\n",a[p][q]);
				}
				a[p][q] = -1;
			}
			for (;p >= row - i;p--)
			{
				if (a[p][q] != -1)
				{
				System.out.printf("%d\n",a[p][q]);
				}
				a[p][q] = -1;
			}
			p = p + 1;
			q = q + 1;
		}
		if ((q % 2 == 0) && (p % 2 == 0))
		{
			i = q / 2;
			j = p / 2;
			if (a[p - j][q - i] != -1)
			{
			System.out.printf("%d",a[p - j][q - i]);
			}
		}
		}
		return 0;
	}

}

