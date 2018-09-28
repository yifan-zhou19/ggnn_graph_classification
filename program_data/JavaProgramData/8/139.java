package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int t;
		int j;
		int[][] a = new int[2][1000];
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
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[0][i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[1][i] = Integer.parseInt(tempVar4);
			}
		}
		for (j = 0;j < m - 1;j++)
		{
			for (i = 0;i < m - 1 - j;i++)
			{
				if (a[0][i] > a[0][i + 1])
				{
					t = a[0][i];
					a[0][i] = a[0][i + 1];
					a[0][i + 1] = t;
				}
			}
		}
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - 1 - j;i++)
			{
				if (a[1][i] > a[1][i + 1])
				{
					t = a[1][i];
					a[1][i] = a[1][i + 1];
					a[1][i + 1] = t;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d ",a[0][i]);
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",a[1][i]);
		}
		System.out.printf("%d\n",a[1][n - 1]);
	}


}

