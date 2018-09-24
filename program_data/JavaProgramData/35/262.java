package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int s;
		int s1;
		int t;
		int x1;
		int x;
		int z = 0;
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
			s1 = -1;
			s = 8;
			x = 8;
			x1 = 10000;
			for (j = 0;j < n;j++)
			{
				if (s1 < a[i][j])
				{
					s1 = a[i][j];
					s = j;
				}
			}
			for (t = 0;t < m;t++)
			{
				if (x1 > a[t][s])
				{
					x1 = a[t][s];
					x = t;
				}
			}
			if (x == i)
			{
				System.out.printf("%d+%d\n",x,s);
				z++;
			}
		}
		if (z == 0)
		{
			System.out.print("No");
		}
		//scanf("%d",&n);
		return 0;
	}
}

