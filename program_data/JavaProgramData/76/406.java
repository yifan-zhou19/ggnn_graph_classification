package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5000][2];
		int n;
		int i;
		int j;
		int t1;
		int t2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (j = 1;j <= n;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (a[i][0] > a[i + 1][0])
				{
					t1 = a[i + 1][0];
					a[i + 1][0] = a[i][0];
					a[i][0] = t1;
					t2 = a[i + 1][1];
					a[i + 1][1] = a[i][1];
					a[i][1] = t2;
				}
			}
		}
		int b = a[0][1];
		for (i = 0;i < n - 1;i++)
		{
			if (b < a[i + 1][0])
			{
				System.out.print("no");
				return 0;
			}
			else
			{
				if (b < a[i + 1][1])
				{
					b = a[i + 1][1];
				}
			}
		}
		System.out.printf("%d %d",a[0][0],b);
		return 0;
	}


}

