package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] s = new int[100][15];
		int[] t = new int[15];
		int[] sum = new int[100];
		int i;
		int j;
		int n;
		int m;
		int k;
		 for (i = 0;;i++)
		 {
			for (j = 0;;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					s[i][j] = Integer.parseInt(tempVar);
				}
				if (s[i][j] == 0)
				{
					t[i] = j;
					break;
				}
				else if (s[i][0] == -1)
				{
					break;
				}
			}
			if (s[i][0] == -1)
			{
				break;
			}
		 }
		for (n = 0;n < i;n++)
		{
			sum[n] = 0;
			for (m = 0;m < t[n] - 1;m++)
			{
				for (k = m + 1;k < t[n];k++)
				{
					if (s[n][m] == 2 * s[n][k] || s[n][k] == 2 * s[n][m])
					{
						sum[n]++;

					}
				}
			}
		}
		for (n = 0;n < i;n++)
		{
			System.out.printf("%d\n",sum[n]);
		}
	}



}

