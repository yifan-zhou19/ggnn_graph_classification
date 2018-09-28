package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int k;
		int a;
		int b;
		int[][] sz = new int[8][8];
		int result = 0;
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
			for (k = 0;k < n;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][k] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			a = i;
			b = 0;
			for (k = 0;k < n - 1;k++)
			{
				if (sz[a][b] < sz[i][k + 1])
				{
					b = k + 1;
				}
			}
			result = 0;
			for (int j = 0;j < m;j++)
			{
				if (sz[a][b] <= sz[j][b])
				{
					result++;
				}
			}
			if (result == m)
			{
				break;
			}
		}
		if (result == m)
		{
			System.out.printf("%d+%d",a,b);
		}
		else
		{
			System.out.print("No");
		}
		return 0;
	}

}

