package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] p = new int[50][15];
		int[] n = new int[50];
		int line;
		int sum;
		int i;
		int k;
		int j;
		for (i = 0;;i++)
		{
			for (k = 0;;k++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					p[i][k] = Integer.parseInt(tempVar);
				}
				if (p[i][k] == 0 || p[i][k] == -1)
				{
				   n[i] = k;
				   break;
				}
			}
			if (p[i][k] == -1)
			{
				line = i;
				break;
			}
		}
		for (i = 0;i < line;i++)
		{
			sum = 0;
			for (k = 0;k < n[i];k++)
			{
				for (j = k + 1;j < n[i];j++)
				{
					if (p[i][k] == p[i][j] * 2 || p[i][j] == p[i][k] * 2)
					{
						sum = sum + 1;
					}
				}
			}
			System.out.printf("%d\n",sum);
		}

	}


}

