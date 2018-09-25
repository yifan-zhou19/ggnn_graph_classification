package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] shuzu = new int[len][len];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (int i = 1;i < m + 1;i++)
		{
			for (int r = 1;r < n + 1;r++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				shuzu[i][r] = Integer.parseInt(tempVar3);
			}
			}
		}

		for (int q = 1;q < m + 1;q++)
		{

			 shuzu[q][0] = 0;
			 shuzu[q][n + 1] = 0;
		}
		for (int e = 1;e < n + 1;e++)
		{
				 shuzu[0][e] = 0;
				 shuzu[m + 1][e] = 0;
		}

		for (int p = 1;p < m + 1;p++)
		{
			for (int w = 1;w < n + 1;w++)
			{
				if (shuzu[p][w] >= shuzu[p][w - 1] != 0 && shuzu[p][w] >= shuzu[p][w + 1])
				{

					if (shuzu[p][w] >= shuzu[p + 1][w] != 0 && shuzu[p][w] >= shuzu[p - 1][w])
					{
				   System.out.printf("%d %d\n",p - 1,w - 1);
					}
				}

			}

		}

		return 0;
	}
}

