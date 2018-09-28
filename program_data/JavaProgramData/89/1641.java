package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[][] r = new int[M][2];
	public static int rn;
	public static int[] p = new int[M];

	public static int wk;

	public static void cal()
	{
		int i;
		int j;
		wk = -1;
		for (i = 0; i < n; i++)
		{
		p[i] = 1;
		}
		for (i = 0; i < rn; i++)
		{
		p[r[i][0]] = 0;
		}
		for (i = 0; i < n; i++)
		{
		if (p[i] == 1)
		{
			if (wk != -1)
			{
			wk = -1;
			return;
			}
			else
			{
				wk = i;
			}
		}
		}
		if (wk == -1)
		{
			return;
		}

		for (i = 0; i < n; i++)
		{
		p[i] = 1;
		}
		for (i = 0; i < rn; i++)
		{
		if (r[i][1] == wk)
		{
			p[r[i][0]] = 0;
		}
		}
		j = 0;
		for (i = 0; i < n; i++)
		{
		j += p[i];
		}
		if (j != 1)
		{
		wk == -1;
		}
	}

	public static void input()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		rn = 0;
		while (scanf("%d%d", r[rn][0], r[rn][1]) != EOF && (!(r[rn][0] == 0 && r[rn][1] == 0)))
		{
		rn++;
		}
	}

	public static void output()
	{
		if (wk == -1)
		{
		System.out.print("NOT FOUND\n");
		}
		else
		{
			System.out.printf("%d\n", wk);
		}
	}

	public static int Main()
	{
		input();
		cal();
		output();
		return 0;
	}

}

