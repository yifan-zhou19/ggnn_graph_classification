package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		g = 0;
		for (c = 0;c < b;c++)
		{
			for (d = 0;d < b;d++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[c][d] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (e = 0;e < b;e++)
		{
			for (f = 0;f < b;f++)
			{
				if (a[e][f] == 0)
				{
					g = g + 1;
				}
			}
		}
		h = (g / 4 - 1) * (g / 4 - 1);
		System.out.printf("%d",h);
	}
}

