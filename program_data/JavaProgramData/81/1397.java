package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int M[5][5], int p, int q);
		int i = 0;
		int j = 0;
		int k;
		int n;
		int m;
		int d = 0;
		int[][] M = new int[5][5];

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					M[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}

		k = f(M, n, m);
		if (k == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					System.out.printf("%d",M[i][j]);
					d += 1;
					if (d % 5 == 0)
					{
						System.out.print("\n");
					}
									else
									{
										System.out.print(" ");
									}
				}
			}
		}

		return 0;
	}

	public static int f(int[][] M, int p, int q)
	{
		int e;
		int i = 0;
		int j = 0;
		int n;
		int m;

		if (q >= 0 && p < 5 && p >= 0 && q < 5)
		{

			for (i = 0;i < 5;i++)
			{
					e = M[p][i];
					M[p][i] = M[q][i];
					M[q][i] = e;
			}
					return 1;
		}
		else
		{
			return 0;
		}
	}
}

