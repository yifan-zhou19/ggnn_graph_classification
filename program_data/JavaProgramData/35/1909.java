package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int p = 0;
		int[][] a = new int[8][8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
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
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;a[i][k] <= a[i][j] != 0 && k < n;)
				{
					k++;
				}
				if (k == n)
				{
					for (l = 0;a[l][j] >= a[i][j] != 0 && l < m;)
					{
						l++;
					}
					if (l == m)
					{
						System.out.printf("%d+%d\n",i,j);
						p++;
					}
				}
			}
		}
			if (p == 0)
			{
				System.out.print("No\n");
			}
	}
}

