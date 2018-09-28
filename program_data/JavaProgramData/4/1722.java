package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		int[][] s = new int[100][100];
		int i;
		int j;
		int k = 0;
		int l = 0;
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= m - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i <= m - 1;i++)
		{
			 k = 0;
			 l = i;
			 for (j = 0;;j++)
			 {
				 System.out.printf("%d\n", s[k][l]);
				 if (l == 0 || k == n - 1)
				 {
						  break;
				 }
				 k = k + 1;
				 l = l - 1;
			 }
		}
		for (i = 1;i <= n - 1;i++)
		{
			k = i;
			l = m - 1;
			for (j = 0;;j++)
			{
				System.out.printf("%d\n", s[k][l]);
				if (k == n - 1 || l == 0)
				{
						   break;
				}
				k = k + 1;
				l = l - 1;
			}
		}

		return 0;
	}

}

