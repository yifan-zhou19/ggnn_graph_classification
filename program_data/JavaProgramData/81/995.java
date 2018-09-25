package <missing>;

public class GlobalMembers
{
	public static int[][] mat = new int[5][5];

	public static int check(int n,int m)
	{
		int l1;
		int t;
		if ((n < 0) || (n>4) || (m < 0) || (m>4))
		{
			return 0;
		}
		else
		{
				for (l1 = 0;l1 < 5;l1++)
				{
						t = mat[m][l1];
						mat[m][l1] = mat[n][l1];
						mat[n][l1] = t;
				}
				return 1;
		}
	}
	public static int Main()
	{
		int n;
		int m;
		int l1;
		int l2;

		for (l1 = 0;l1 < 5;l1++)
		{
			for (l2 = 0;l2 < 5;l2++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					mat[l1][l2] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (check(n, m) == 0)
		{
			System.out.print("error\n");
		}
		else
		{
			for (l1 = 0;l1 < 5;l1++)
			{
					for (l2 = 0;l2 < 4;l2++)
					{
						System.out.printf("%d ",mat[l1][l2]);
					}
					System.out.printf("%d\n",mat[l1][4]);
			}
		}

		return 0;
	}

}

