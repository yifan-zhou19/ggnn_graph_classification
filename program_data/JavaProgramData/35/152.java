package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int max = 0;
		int flag = 1;
		int k;
		int t;
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
		int[][] a = new int[8][8];
		for (i = 0;i <= m - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i <= m - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				if (a[i][j] > max)
				{
				k = j;
				max = a[i][j];
				}
			}
			for (t = 0;t <= m - 1;t++)
			{
				if (a[t][k] < max)
				{
					break;
				}
			}
			if (t == m)
			{
				System.out.printf("%d+%d",i,k);
				flag = 0;
				break;
			}
		}
		if (flag == 1)
		{
			System.out.print("No");
		}
	}

}

