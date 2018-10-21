package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int i;
	int j;
	double[][] a = new double[200][200];
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
		a[i][j] = Double.parseDouble(tempVar3);
	}
	}
	}
	for (j = 0;j < n;j++)
	{
		if (j == 0)
		{
		if (a[0][j] >= a[0][j + 1] != 0 && a[0][j] >= a[1][j])
		{
	System.out.printf("%d %d\n",0,j);
		}
		}
	else if (j == n - 1)
	{
		if (a[0][j] >= a[0][j - 1] != 0 && a[0][j] >= a[1][j])
		{
	System.out.printf("%d %d\n",0,j);
		}
	}
	else if (a[0][j] >= a[0][j - 1] != 0 && a[0][j] >= a[1][j] != 0 && a[0][j] >= a[0][j + 1])
	{
	System.out.printf("%d %d\n",0,j);
	}
	}
					for (i = 1;i < m - 1;i++)
					{
					for (j = 0;j < n;j++)
					{
						if (j == 0)
						{
		if (a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i - 1][j])
		{
	System.out.printf("%d %d\n",i,j);
		}
						}
	else if (j == n - 1)
	{
		if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i - 1][j])
		{
	System.out.printf("%d %d\n",i,j);
		}
	}
	else if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i - 1][j])
	{
	System.out.printf("%d %d\n",i,j);
	}
					}
					}
					for (j = 0;j < n;j++)
					{
		if (j == 0)
		{
		if (a[m - 1][j] >= a[m - 1][j + 1] != 0 && a[i][j] >= a[m - 2][j])
		{
	System.out.printf("%d %d\n",m - 1,j);
		}
		}
	else if (j == n - 1)
	{
		if (a[m - 1][j] >= a[m - 1][j - 1] != 0 && a[i][j] >= a[m - 2][j])
		{
	System.out.printf("%d %d\n",m - 1,j);
		}
	}
	else if (a[m - 1][j] >= a[m - 1][j - 1] != 0 && a[i][j] >= a[m - 1][j + 1] != 0 && a[i][j] >= a[m - 2][j])
	{
	System.out.printf("%d %d\n",m - 1,j);
	}
					}
	}

}

