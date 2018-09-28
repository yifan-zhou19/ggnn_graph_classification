package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h;
		int l;
		int a;
		int b;
		int c;
		int d;
		int f;
		int g;
		int i = 1;
		int j = 1;
		int[][] m = new int[8][8];
		int[] x = new int[8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		for (a = 1;a <= h;a++)
		{
			for (b = 1;b <= l;b++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					m[a][b] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (c = 1;c <= h;c++)
		{
			x[c] = 1;
			for (d = 1;d < l;d++)
			{
				if (m[c][x[c]] < m[c][d + 1])
				{
					x[c] = d + 1;
				}
			}
		}
		for (f = 1;f <= h;f++)
		{
			for (g = 1;g <= h;g++)
			{
				if (m[f][x[f]] > m[g][x[f]])
				{
					i = 0;
					break;
				}
			}
			if (i != 0)
			{
				System.out.printf("%d+%d",f - 1,x[f] - 1);
				j = 0;
				break;
			}
		}
		if (j != 0)
		{
			System.out.print("No");
		}
		return 0;
	}


}

