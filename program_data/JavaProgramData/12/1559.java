package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[16][16];
	int i;
	int j;
	int k;
	int[] m = new int[16];
	int n;
	int len;
	int sum;
	i = 0;
		do
		{
		i = i + 1;
	j = 0;
	do
	{
	j = j + 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[i][j] = Integer.parseInt(tempVar);
	}
	m[i] = m[i] + 1;
	}while ((a[i][j] != 0) && (a[i][j] != -1));

		}while (a[i][1] != -1);
	len = i;
	for (i = 1;i < len;i++)
	{
	sum = 0;
		for (j = 2;j <= m[i];j++)
		{
			for (k = 1;k < j;k++)
			{
				if ((a[i][j] == 2 * a[i][k]) || (a[i][j] * 2 == a[i][k]))
				{
					sum = sum + 1;
				}
			}
		}
		System.out.printf("%d\n",sum);
	}
	}
}

