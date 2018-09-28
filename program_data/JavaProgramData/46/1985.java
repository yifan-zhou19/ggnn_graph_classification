package <missing>;

public class GlobalMembers
{
	public static int[][] sz = new int[100][100];
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int a1;
		int a2;
		int b1;
		int b2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (k = 0;;k++)
		{
			a1 = k;
			a2 = m - 1 - k;
			b1 = k;
			b2 = n - 1 - k;
			if (a1 > a2 || b1 > b2)
			{
				break;
			}
			if (a1 == a2 && b1 != b2)
			{
				for (i = b1;i <= b2;i++)
				{
					System.out.printf("%d\n",sz[i][a1]);
				}
			}
			else if (b1 == b2)
			{
				for (j = a1;j <= a2;j++)
				{
					System.out.printf("%d\n",sz[b1][j]);
				}
			}
			else if (b1 == b2 && a1 == a2)
			{
				System.out.printf("%d\n",sz[b1][a1]);
			}
			else
			{
				for (j = a1;j <= a2;j++)
				{
					System.out.printf("%d\n",sz[b1][j]);
				}
				for (i = b1 + 1;i <= b2;i++)
				{
					System.out.printf("%d\n",sz[i][a2]);
				}
				for (j = a2 - 1;j >= a1;j--)
				{
					System.out.printf("%d\n",sz[b2][j]);
				}
				for (i = b2 - 1;i >= b1 + 1;i--)
				{
					System.out.printf("%d\n",sz[i][a1]);
				}
			}
		}
		return 0;
	}

}

