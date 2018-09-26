package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int m;
	int n;
	int i;
	int j;
	int k;
	int c;
	int[][] a = new int[9][9];
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
	a[4][4] = m;
	for (i = 1;i <= n;i++)
	{
		int[][] b = new int[9][9];
		for (j = 1;j < 8;j++)
		{
			for (k = 1;k < 8;k++)
			{
				c = a[j][k];
				b[j][k] += 2 * c;
				b[j - 1][k - 1] += c;
				b[j - 1][k] += c;
				b[j - 1][k + 1] += c;
				b[j][k - 1] += c;
				b[j][k + 1] += c;
				b[j + 1][k - 1] += c;
				b[j + 1][k] += c;
				b[j + 1][k + 1] += c;
			}
		}
		for (j = 0;j < 9;j++)
		{
			for (k = 0;k < 9;k++)
			{
				a[j][k] = b[j][k];
			}
		}
	}
	for (j = 0;j < 9;j++)
	{
			for (k = 0;k < 8;k++)
			{
	System.out.printf("%d ",a[j][k]);
			}
	System.out.printf("%d\n",a[j][8]);
	}
	}
}

