package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[][] a = new int[100][100];
		int m;
		int[][] b = new int[100][30];
		int s;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= 99;j++)
			{
				a[i][j] = 1;
			}
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i][j] = Integer.parseInt(tempVar3);
				}
			}

			for (j = 1;j <= m;j++)
			{
				s = 0;
				for (k = 1;k <= 79;k++)
				{
					s = s + a[i][k];
					if (s == b[i][j])
					{
						a[i][k + 1] = 0;
						a[i][k + 2] = 0;
						a[i][k + 3] = 0;
						break;
					}
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			s = 0;
			for (j = 1;j <= 60;j++)
			{
				s = s + a[i][j];
			}
			System.out.printf("%d\n",s);
		}
		return 0;
	}
}

