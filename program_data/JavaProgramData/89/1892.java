package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[100000][2];
		int i;
		int t = 0;
		int j;
		int[] b = new int[10000];
		int[] c = new int[10000];
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i - 1][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i - 1][1] = Integer.parseInt(tempVar3);
			}
			t = t + 1;
			if (a[i - 1][0] == 0 && a[i - 1][1] == 0)
			{
				break;
			}
		}
		for (i = 1;i <= n;i++)
		{
			b[i - 1] = 0;
		}
		for (i = 1;i <= n;i++)
		{
			c[i - 1] = 0;
		}
		for (j = 0;j <= n - 1;j++)
		{
			for (i = 1;i <= t - 1;i++)
			{
				if (a[i - 1][1] == j)
				{
					b[j] = b[j] + 1;
				}
			}
		}
		for (j = 0;j <= n - 1;j++)
		{
			for (i = 1;i <= t - 1;i++)
			{
				if (a[i - 1][0] == j)
				{
				c[j] = c[j] + 1;
				}
			}
		}
		for (j = 0;j <= n - 1;j++)
		{
			if (b[j] == n - 1 && c[j] == 0)
			{
			System.out.printf("%d",j);
			}
			m = 1;
		}
		if (m == 0)
		{
		System.out.print("NOT FOUND");
		}
	}


}

