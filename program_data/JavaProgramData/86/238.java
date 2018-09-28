package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] m = new int[20];
		int j;
		int[][] x = new int[20][20];
		int[] sum = new int[20];
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
				m[i] = Integer.parseInt(tempVar2);
			}
			if (m[i] > 0)
			{
				for (j = 0;j < m[i];j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						x[i][j] = Integer.parseInt(tempVar3);
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (m[i] == 0)
			{
				sum[i] = 60;
			}
			else
			{
				if (x[i][m[i] - 1] + 3 * m[i] < 60)
				{
					sum[i] = 60 - 3 * m[i];
				}
				else
				{
					for (j = 0;j < m[i];j++)
					{
						if (x[i][j] + 3 * j > 60)
						{
							sum[i] = 60 - 3 * j;
						break;
						}
						if (x[i][j] + 3 * j <= 60 && x[i][j] + 3 * j + 3 >= 60)
						{
							sum[i] = x[i][j];
						break;
						}
					}
				}
			}
			System.out.printf("%d\n",sum[i]);
		}
		return 0;
	}
}

