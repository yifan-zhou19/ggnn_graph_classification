package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int m;
		int[][] a = new int[100][100];
		int l;
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
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 100;j++)
			{
				a[i][j] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		l = n + m;
		for (i = 0;i <= l;i++)
		{
			for (j = 0;j <= i;j++)
			{
				if (j < n && (i - j) < m)
				{
				System.out.printf("%d\n",a[j][i - j]);
				}
			}
		}
	}
}

