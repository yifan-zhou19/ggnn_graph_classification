package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int y;
		int n;
		int s;
		int j;
		int h;
		int a;
		int k;
		int b;
		int[][] sz = new int[100][100];
		int[] jieguo = new int[100];
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < a;j++)
			{
				for (k = 0;k < b;k++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						sz[j][k] = Integer.parseInt(tempVar4);
					}
				}
			}
			sum = 0;
			for (h = 0;h < b;h++)
			{
				sum = sum + sz[0][h] + sz[a - 1][h];
			}
			for (s = 0;s < a;s++)
			{
				sum = sum + sz[s][0] + sz[s][b - 1];
			}
			sum = sum - sz[0][0] - sz[0][b - 1] - sz[a - 1][0] - sz[a - 1][b - 1];
			jieguo[i] = sum;
		}
		for (y = 0;y < n;y++)
		{
			System.out.printf("%d\n",jieguo[y]);
		}
		return 0;
	}

}

