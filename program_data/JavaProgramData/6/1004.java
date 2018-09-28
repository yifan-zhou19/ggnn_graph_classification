package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int m;
	int n;
	int i;
	int j;
	int[][] a = new int[100][100];
	int l;
	int[] b = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 0;i < k;i++)
	{
		b[i] = 0;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}
	for (j = 0;j < m;j++)
	{
		for (l = 0;l < n;l++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[j][l] = Integer.parseInt(tempVar4);
			}
		if (j == 0 || j == m - 1)
		{
			b[i] += a[j][l];
		}
		else if (l == 0 || l == n - 1)
		{
			b[i] += a[j][l];
		}
		}
	}
	}
	for (i = 0;i < k;i++)
	{
		System.out.printf("%d\n",b[i]);
	}
	}
}

