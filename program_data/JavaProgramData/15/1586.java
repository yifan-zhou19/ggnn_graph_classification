package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int r;
		int i;
		int j;
		int[][] a = new int[505][505];
		int m1;
		int m2;
		int n1;
		int n2;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		m1 = r;
		n1 = r;
		m2 = 0;
		n2 = 0;
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < r;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
				if (a[i][j] == 0)
				{
					if (i <= m1 != 0 && j <= n1)
					{
						m1 = i;
						n1 = j;
					}
					if (i >= m2 != 0 && j >= n2)
					{
						m2 = i;
						n2 = j;
					}
				}
			}
		}
		sum = (m2 - m1 - 1) * (n2 - n1 - 1);
		System.out.printf("%d",sum);
		return 0;
	}
}

