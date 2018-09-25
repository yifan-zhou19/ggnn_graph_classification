package <missing>;

public class GlobalMembers
{
	public static void Main(void argc, String[] args)
	{
		int[][] loc = new int[1000][1000];
		int m;
		int n;
		int p;
		int q;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < a;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					loc[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < a;j++)
			{
				if (loc[i][j] == 0)
				{
					m = i;
					n = j;
					break;
				}
			}
			if (loc[m][n] == 0)
			{
				break;
			}
		}
		for (i = a - 1;i >= 0;i--)
		{
			for (j = a - 1;j >= 0;j--)
			{
				if (loc[i][j] == 0)
				{
					p = i;
					q = j;
					break;
				}
			}
			if (loc[p][q] == 0)
			{
				break;
			}
		}
		int s;
		s = (p - m - 1) * (q - n - 1);
		System.out.printf("%d\n",s);
	}
}

