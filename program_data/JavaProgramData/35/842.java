package <missing>;

public class GlobalMembers
{
	public static int[][] dat = new int[9][9];
	public static int[][] num = new int[2][9];
	public static int Main()
	{
		int m;
		int n;
		int l1;
		int l2;
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
		for (l1 = 1;l1 <= m;l1++)
		{
			for (l2 = 1;l2 <= n;l2++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					dat[l1][l2] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (l1 = 1;l1 <= m;l1++)
		{
				t = -100000000;
				for (l2 = 1;l2 <= n;l2++)
				{
					if (dat[l1][l2] > t)
					{
							t = dat[l1][l2];
							num[0][l1] = l2;
					}
				}
		}
		for (l1 = 1;l1 <= n;l1++)
		{
				t = 100000000;
				for (l2 = 1;l2 <= m;l2++)
				{
					if (dat[l2][l1] < t)
					{
							t = dat[l2][l1];
							num[1][l1] = l2;
					}
				}
		}
		for (l1 = 1;l1 <= m;l1++)
		{
			if (num[1][num[0][l1]] == l1)
			{
					System.out.printf("%d+%d\n",l1 - 1,num[0][l1] - 1);
					break;
			}
		}
		if (l1 == m + 1)
		{
			System.out.print("No\n");
		}

		return 0;
	}

}

