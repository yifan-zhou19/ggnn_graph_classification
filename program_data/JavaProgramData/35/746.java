package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int s;
		int k = 0;
		int a;
		int b;
		int sum = 0;
		int summ = 0;
		int m;
		int n;
		int[][] sz = new int[8][8];
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
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (sz[i][j] >= k)
				{
					k = sz[i][j];
					a = i;
					b = j;
				}
			}
			for (s = 0;s < m;s++)
			{
				if (sz[a][b] > sz[s][b])
				{
					break;
				}
			}
			if (s == m)
			{
				System.out.printf("%d+%d\n",a,b);
				summ++;
			}
			a = b = k = 0;
			sum = 0;
		}
		if (summ == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

