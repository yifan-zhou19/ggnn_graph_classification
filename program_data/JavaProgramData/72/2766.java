package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[][] hei = new int[m][n]; //??
		int[][] top = new int[m][n]; //?????

		int i;
		int j;
		for (i = 0;i < m;i = i + 1) //????
		{
			for (j = 0;j < n;j = j + 1)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(hei[i][j]) = Integer.parseInt(tempVar3);
				}
				top[i][j] = 1;
			}
		}

		for (i = 0;i < m;i = i + 1) //???????
		{
			for (j = 0;j < n;j = j + 1)
			{
				if (i - 1 >= 0 && hei[i - 1][j] > hei[i][j])
				{
					top[i][j] = 0;
				}
				else if (i + 1 <= m - 1 && hei[i + 1][j]> hei[i][j])
				{
					top[i][j] = 0;
				}
				else if (j + 1 <= n - 1 && hei[i][j + 1]> hei[i][j])
				{
					top[i][j] = 0;
				}
				else if (j - 1 >= 0 && hei[i][j - 1] > hei[i][j])
				{
					top[i][j] = 0;
				}
			}
		}

		for (i = 0;i < m;i = i + 1) //???????????
		{
			for (j = 0;j < n;j = j + 1)
			{
				if (top[i][j] == 1)
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
		}

		return (0);

	}
}

