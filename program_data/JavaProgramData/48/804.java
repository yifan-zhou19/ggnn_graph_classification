package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[11][11];
		int[][] b = new int[11][11];
	int i;
	int j;
	int k;
	int n;
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < 11;i++)
	{
	for (j = 0;j < 11;j++)
	{
	a[i][j] = 0;
	}
	}
	a[5][5] = 1;

	for (k = 0;k < n;k++)
	{
					for (i = 1;i < 10;i++)
					{
	for (j = 1;j < 10;j++)
	{
	b[i][j] = a[i + 1][j - 1] + a[i + 1][j + 1] + a[i + 1][j] + a[i][j + 1] + a[i][j - 1] + 2 * a[i][j] + a[i - 1][j - 1] + a[i - 1][j + 1] + a[i - 1][j];
	}
					}
	for (i = 1;i < 10;i++)
	{
	for (j = 1;j < 10;j++)
	{
	a[i][j] = b[i][j];
	}
	}
	}

	for (i = 1;i < 10;i++)
	{
		for (j = 1;j < 10;j++)
		{
		if ((j == 1) && (i != 0))
		{
	System.out.print("\n");
		}
	System.out.printf("%d",a[i][j] * m);
	if (j != 9)
	{
	System.out.print(" ");
	}
		}
	}
	System.in.read();
	System.in.read();
	}
}

