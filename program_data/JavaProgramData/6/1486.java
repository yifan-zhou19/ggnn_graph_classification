package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (int z = 0;z < k;z++)
		{
			int[][] num = new int[100][100];
			int m;
			int n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			for (int j = 0;j < m;j++)
			{
				for (int i = 0;i < n;i++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						num[j][i] = Integer.parseInt(tempVar4);
					}

				}
			}
			int sum = 0;
			//???????????????????????????
			for (int i = 0;i < m;i++)
			{
				sum = sum + num[i][0] + num[i][n - 1];

			}
			for (int i = 0;i < n;i++)
			{
				sum = sum + num[0][i] + num[m - 1][i];
			}
			sum = sum - num[0][0] - num[0][n - 1] - num[m - 1][0] - num[m - 1][n - 1];
			if (z != 0)
			{
				System.out.print("\n");

			}
			System.out.printf("%d",sum);

		}
		return 0;
	}

}

