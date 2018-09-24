package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int[][] d = new int[8][8];
		int e;
		int f = 0;
		int h;
		int i;
		int j;
		char l = 'c';
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (c = 0;c < a;c++)
		{
			for (e = 0;e < b;e++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					d[c][e] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (c = 0;c < a;c++)
		{
			l = 'c';
			for (e = 0;e < b;e++)
			{
				l = 'c';
				for (h = 0;h < b;h++)
				{
					if (d[c][h] > d[c][e])
					{
						l = 'b';
						break;
					}
				}
				for (h = 0;h < a;h++)
				{
					if (d[h][e] < d[c][e])
					{
						l = 'b';
						break;
					}
				}
				if (l == 'c')
				{
					f++;
					i = c;
					j = e;
					break;
				}
			}
			if (f == 1)
			{
				break;
			}
		}
		if (f == 1)
		{
			System.out.printf("%d+%d",i,j);
		}
		else
		{
			System.out.print("No");
		}
		return 0;
	}

}

