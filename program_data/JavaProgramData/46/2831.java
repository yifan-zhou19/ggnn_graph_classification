package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[200][200];
		int[][] b = new int[200][200];
		int i;
		int j;
		int k;
		int l;
		int s;
		int m;
		int n;
		for (i = 0;i < 200;i++)
		{
			for (j = 0;j < 200;j++)
			{
				b[i][j] = 0;
			}
		}
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
					a[i][j] = Integer.parseInt(tempVar3);
				}
				b[i][j] = 1;
			}
		}
		i = 1;
		j = 1;
		s = 1;
		for (l = 0;l < m * n;l++)
		{
			b[i][j] = 0;
			System.out.printf("%d\n",a[i][j]);
			if (s == 1)
			{
				if (b[i][j + 1] == 1)
				{
					j = j + 1;
				}
				else if (b[i][j + 1] == 0)
				{
					i = i + 1;
					s = 2;
				}
			}
			else if (s == 2)
			{
				if (b[i + 1][j] == 1)
				{
					i = i + 1;
				}
				else
				{
					j = j - 1;
					s = 3;
				}
			}
			else if (s == 3)
			{
				if (b[i][j - 1] == 1)
				{
					j = j - 1;
				}
				else
				{
					i = i - 1;
					s = 4;
				}
			}
			else if (s == 4)
			{
				if (b[i - 1][j] == 1)
				{
					i = i - 1;
				}
				else
				{
					j = j + 1;
					s = 1;
				}
			}
		}
		return 0;
	}


}

