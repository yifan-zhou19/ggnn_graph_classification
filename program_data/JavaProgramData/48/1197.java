package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[9][9];
	int[][] c = new int[9][9];
	int i;
	int j;
	int k;
	int m;
	int n;
	for (i = 0;i < 9;i++)
	{
	for (j = 0;j < 9;j++)
	{
	a[i][j] = 0;
	c[i][j] = 0;
	}
	}

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	a[4][4] = n;




	for (k = 0;k < m;k++)
	{
	for (i = 0;i < 9;i++)
	{
	for (j = 0;j < 9;j++)
	{
	if (a[i][j] != 0)
	{
	c[i][j] = c[i][j] + 2 * a[i][j];
	c[i - 1][j] = c[i - 1][j] + a[i][j];
	c[i + 1][j] = c[i + 1][j] + a[i][j];
	c[i + 1][j + 1] = c[i + 1][j + 1] + a[i][j];
	c[i + 1][j - 1] = c[i + 1][j - 1] + a[i][j];
	c[i - 1][j + 1] = c[i - 1][j + 1] + a[i][j];
	c[i - 1][j - 1] = c[i - 1][j - 1] + a[i][j];
	c[i][j + 1] = c[i][j + 1] + a[i][j];
	c[i][j - 1] = c[i][j - 1] + a[i][j];
	}
	}
	}
	for (i = 0;i < 9;i++)
	{
	for (j = 0;j < 9;j++)
	{
	a[i][j] = c[i][j];
	c[i][j] = 0;
	}
	}



	}


	for (i = 0;i < 9;i++)
	{
	for (j = 0;j < 9;j++)
	{
	if (j == 8)
	{
	System.out.printf("%d\n",a[i][j]);
	}
	else
	{
	System.out.printf("%d ",a[i][j]);
	}
	}
	}

	}
}

