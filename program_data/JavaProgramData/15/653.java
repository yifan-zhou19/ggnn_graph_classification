package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a1;
		int a2;
		int b1;
		int b2;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] num = new int[1000][1000];
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					num[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (num[i][j] == 0)
				{
					a1 = i;
					a2 = j;
				}
			}
		}
		for (i = n - 1; i > 0; i--)
		{
			for (j = n - 1; j > 0; j--)
			{
				if (num[i][j] == 0)
				{
					b1 = i;
					b2 = j;
				}
			}
		}
		m = (a1 - b1 - 1) * (a2 - b2 - 1);
		System.out.printf("%d", m);
		return 0;
	}


}

