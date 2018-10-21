package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] sz = new int[50000][5];
		int i;
		int j;
		int min;
		int max;
		int s;
		int S;
		double q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				min = sz[i][j];
			}
			else if (sz[i][j] <= min)
			{
				min = sz[i][j];
			}
		}
		j = 1;
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				max = sz[i][j];
			}
			else if (sz[i][j] >= max)
			{
				max = sz[i][j];
			}
		}
		S = 1;
		for (q = min + 0.3;q <= max;q++)
		{
			s = 1;
			for (i = 0;i < n;i++)
			{
				if (q >= sz[i][0] != 0 && q <= sz[i][1])
				{
					s = s * 0;
					break;
				}
				else
				{
					s = s * 1;
				}
			}
			if (s == 0)
			{
				S = S * 1;
			}
			else
			{
				S = S * 0;
			}
		}
		if (S == 1 && n >= 3)
		{
			System.out.printf("%d %d",min,max);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}

}

