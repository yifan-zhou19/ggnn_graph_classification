package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] raul = new int[100][100];
		int m;
		int n;
		int i;
		int j;
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
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					raul[i][j] = Integer.parseInt(tempVar3);
				}
			}

		}
		for (i = 1;i <= m;i++)
		{
			raul[i][0] = 0;
		}
		for (j = 1;j <= n;j++)
		{
			raul[0][j] = 0;
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (raul[i][j] >= raul[i + 1][j] != 0 && raul[i][j] >= raul[i - 1][j] != 0 && raul[i][j] >= raul[i][j - 1] != 0 && raul[i][j] >= raul[i][j + 1])
				{
						System.out.printf("%d %d\n",i - 1,j - 1);
				}
			}
		}
	}


}

