package <missing>;

public class GlobalMembers
{
	public static int[][] num = new int[15][20];

	public static int Main()
	{
		int i;
		int j;
		int k;
		int div = int;

		for (i = 0,j = 0;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num[i][j] = Integer.parseInt(tempVar);
			}
			if (num[i][j] == -1)
			{
				break;
			}
			if (num[i][j] == 0)
			{
				j = 0;
				i++;
				continue;
			}
			j++;
		}

		for (k = 0;k < i;k++)
		{
			System.out.printf("%d\n",div(k));
		}
		return 0;
	}

	public static int div(int n)
	{
		int i;
		int j;
		int k = 0;

		for (i = 0;num[n][i] != 0;i++)
		{
			for (j = i;num[n][j] != 0;j++)
			{
				if (num[n][i] == 2 * num[n][j] || num[n][j] == 2 * num[n][i])
				{
					k++;
				}
			}
		}
		return k;
	}

}

