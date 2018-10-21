package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int[][] s = new int[11][11];
		int[][] s1 = new int[11][11];
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
		s1[5][5] = s[5][5] = m;
		for (k = 1;k <= n;k++)
		{
			for (i = 5 - k;i <= 5 + k;i++)
			{
				for (j = 5 - k;j <= 5 + k;j++)
				{
					s[i][j] = 2 * s1[i][j] + s1[i - 1][j - 1] + s1[i - 1][j] + s1[i - 1][j + 1] + s1[i][j - 1] + s1[i][j + 1] + s1[i + 1][j - 1] + s1[i + 1][j] + s1[i + 1][j + 1];
				}
			}
			if (k != n)
			{
				for (i = 5 - k;i <= 5 + k;i++)
				{
				for (j = 5 - k;j <= 5 + k;j++)
				{
					s1[i][j] = s[i][j];
				}
				}
			}
		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				if (j == 1)
				{
					System.out.printf("%d",s[i][j]);
				}
				else
				{
					System.out.printf(" %d",s[i][j]);
				}
			}
			System.out.print("\n");
		}
	}

}

