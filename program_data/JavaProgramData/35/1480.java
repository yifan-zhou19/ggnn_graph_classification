package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] d = new int[8][8];
		int m;
		int n;
		int i;
		int j;
		int t;
		int a;
		int b;
		int p = 0;
		int q = 0;
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
					d[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (j == 0)
				{
					t = d[i][0];
					a = i;
					b = 0;
				}
				else if (d[i][j] > t)
				{
					t = d[i][j];
					a = i;
					b = j;
				}
			}
			for (i = 0;i < m;i++)
			{
				if (d[a][b] <= d[i][b])
				{
					p++;
				}
			}
			if (p == m)
			{
				System.out.printf("%d+%d",a,b);
				break;
			}
			else
			{
				continue;
			}
		}
		if (p != m)
		{
			System.out.print("No");
		}
		return 0;
	}


}

