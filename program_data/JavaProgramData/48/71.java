package <missing>;

public class GlobalMembers
{
	public static int[][][] a = new int[10][10][5];

	public static int k;
	public static int i;
	public static int j;
	public static int l;
	public static int n;

	public static int Main()
	{
		for (i = 0;i < 5;i++)
		{
		for (j = 1;j < 10;j++)
		{
		for (k = 1;k < 10;k++)
		{
		a[j][k][i] = 0;
		}
		}
		}

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		a[5][5][0] = n;

		for (l = 0;l < k;l++)
		{
		for (i = 1;i < 10;i++)
		{
		for (j = 1;j < 10;j++)
		{
			if (a[i][j][l] != 0)
			{
				a[i][j][l + 1] += 2 * a[i][j][l];
				a[i - 1][j - 1][l + 1] += a[i][j][l];
				a[i - 1][j][l + 1] += a[i][j][l];
				a[i - 1][j + 1][l + 1] += a[i][j][l];
				a[i][j - 1][l + 1] += a[i][j][l];
				a[i][j + 1][l + 1] += a[i][j][l];
				a[i + 1][j - 1][l + 1] += a[i][j][l];
				a[i + 1][j][l + 1] += a[i][j][l];
				a[i + 1][j + 1][l + 1] += a[i][j][l];
			}
		}
		}
		}

		for (i = 1;i <= 9;i++)
		{
		  for (j = 1;j < 9;j++)
		  {
			System.out.printf("%d ",a[i][j][k]);
		  }
		  System.out.printf("%d\n",a[i][9][k]);
		}

		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
	return 0;
	}

}

