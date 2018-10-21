package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
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
		int[][] sz = new int[8][8];
		int i;
		int j;
		int p;
		int q;
		int a;
		int b;
		int c;
		c = 0;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(sz[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				a = 0;
				b = 0;
				for (q = 0;q < n;q++)
				{
					p = i;
					if (sz[p][q] <= sz[i][j])
					{
						a++;
						continue;
					}
					else
					{
						break;
					}
				}
				if (a == n)
				{
					for (p = 0;p < m;p++)
					{
						q = j;
						if (sz[p][q] >= sz[i][j])
						{
							b++;
							continue;
						}
						else
						{
							break;
						}
					}
				}
				if (b == m)
				{
					System.out.printf("%d+%d",i,j);
					c = 1;
				}
			}
		}
		if (c == 0)
		{
			System.out.print("No");
		}
		return 0;
	}


}

