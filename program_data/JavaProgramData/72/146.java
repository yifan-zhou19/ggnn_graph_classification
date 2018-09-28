package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int[][] a = new int[300][300];
		int i;
		int j;
		int t;
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
		for (i = 0;i <= m + 1;i++)
		{
			for (j = 0;j <= n + 1;j++)
			{
		a[i][j] = 0;
			}
		}
		for (i = 1;i <= m;i++)
		{
		for (j = 1;j <= n;j++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i][j] = Integer.parseInt(tempVar3);
		}
		}
		}
		for (i = 1;i <= m;i++)
		{
		for (j = 1;j <= n;j++)
		{
		t = 0;
		if (a[i - 1][j] <= a[i][j])
		{
			t++;
		}
		if (a[i + 1][j] <= a[i][j])
		{
			t++;
		}
		if (a[i][j - 1] <= a[i][j])
		{
			t++;
		}
		if (a[i][j + 1] <= a[i][j])
		{
			t++;
		}
		if (t == 4)
		{
			System.out.printf("%d %d\n",i - 1,j - 1);
		}
		}
		}
	}
}

