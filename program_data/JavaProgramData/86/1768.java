package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] num = new int[n];
		int[] sum = new int[n];
		int[][] sz = new int[n][1000];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
			if (num[i] != 0)
			{
				for (int j = 0;j < num[i];j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						sz[i][j] = Integer.parseInt(tempVar3);
					}
				}
				if (sz[i][num[i] - 1] + 3 * num[i] <= 60)
				{
					sum[i] = 60 - 3 * num[i];
				}
				else if (sz[i][num[i] - 1] + 3 * (num[i] - 1) <= 60)
				{
					sum[i] = sz[i][num[i] - 1];
				}
				else if (sz[i][num[i] - 2] + 3 * (num[i] - 1) <= 60)
				{
					sum[i] = 60 - 3 * (num[i] - 1);
				}
				else if (sz[i][num[i] - 2] + 3 * (num[i] - 2) <= 60)
				{
					sum[i] = sz[i][num[i] - 2];

				}
				else if (sz[i][num[i] - 3] + 3 * (num[i] - 2) <= 60)
				{
					sum[i] = 60 - 3 * (num[i] - 2);
				}
				else if (sz[i][num[i] - 3] + 3 * (num[i] - 3) <= 60)
				{
					sum[i] = sz[i][num[i] - 3];

				}
			}
			else
			{
				sum[i] = 60;
			}
			System.out.printf("%d\n",sum[i]);
		}
	}
}

