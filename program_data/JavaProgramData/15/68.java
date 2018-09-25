package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int M;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		M = N;

		//int n;
		//scanf ("%d",&n);
		int[][] k = new int[50][50];
		int i;
		int j;
		int y = 0;
		int sum = 0;
		for (i = 0;i < N;i++)
		{
			for (j = 0;j < M;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					k[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}

		for (i = 0;i < N;i++)
		{
			for (j = 0;j < M;j++)
			{
				if (k[i][j] == 0)
				{
					sum++;
				}

			}
		}
		y = (sum / 4 - 1) * (sum / 4 - 1);
		System.out.printf("%d",y);
		return 0;

	}
}

