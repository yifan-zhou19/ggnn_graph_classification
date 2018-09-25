package <missing>;

public class GlobalMembers
{
	public static int[] T = new int[1000];
	public static int[] Q = new int[1000];
	public static int n;
	public static int search()
	{
		int i;
		int j;
		int temp;
		int[][] Inco = new int[1000][1000];

		for (i = 0;i <= n - 2;i++)
		{
			for (j = i + 1;j <= n - 1;j++)
			{
				if (T[i] < T[j])
				{
					temp = T[i];
					T[i] = T[j];
					T[j] = temp;
				}
				if (Q[i] < Q[j])
				{
					temp = Q[i];
					Q[i] = Q[j];
					Q[j] = temp;
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			if (Q[i] < T[0])
			{
				Inco[i][0] = 1;
			}
			else if (Q[i] == T[0])
			{
				Inco[i][0] = 0;
			}
			else
			{
				Inco[i][0] = -1;
			}
		}
		for (i = n - 2;i >= 0;i--)
		{
			for (j = 1;i + j < n;j++)
			{
				if (Q[i + j] < T[0 + j])
				{
					Inco[i][j] = Inco[i][j - 1] + 1;
				}
				else if (Q[i + j] > T[0 + j])
				{
					Inco[i][j] = Inco[i + 1][j - 1] - 1;
				}
				else
				{
					if (Inco[i + 1][j - 1] - 1 > Inco[i][j - 1] + 0)
					{
					   Inco[i][j] = Inco[i + 1][j - 1] - 1;
					}
					else
					{
						Inco[i][j] = Inco[i][j - 1] + 0;
					}
				}
			}
		}
		return Inco[0][n - 1];
	}

	public static int Main()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					T[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					Q[i] = Integer.parseInt(tempVar3);
				}
			}
			System.out.printf("%d\n",search() * 200);

			for (i = 0;i < 100;i++)
			{
				T[i] = 0;
				Q[i] = 0;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
		}
		return 0;
	}
}

