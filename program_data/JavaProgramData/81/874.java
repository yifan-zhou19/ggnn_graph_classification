package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int[][] sz = new int[5][5];
		int[] s = new int[5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
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
		if (m <= 4 && n <= 4 && m >= 0 && n >= 0)
		{
			k = 1;
				for (j = 0;j < 5;j++)
				{
					s[j] = sz[m][j];
					sz[m][j] = sz[n][j];
					sz[n][j] = s[j];
				}
		}
		else
		{
			k = 0;
		}
		if (k == 0)
		{
			System.out.print("error");
		}
		else if (k == 1)
		{
			for (i = 0;i < 5;i++)
			{
				System.out.printf("%d",sz[i][0]);
				for (j = 1;j < 5;j++)
				{
					System.out.printf(" %d",sz[i][j]);
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}

