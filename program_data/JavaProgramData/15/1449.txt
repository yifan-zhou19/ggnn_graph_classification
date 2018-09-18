package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int[][] n = new int[1000][1000];
		int i;
		int p;
		int x1;
		int y1;
		int x2;
		int y2;
		int s;
		i = 0;
		p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i < a;i++)
		{
			for (p = 0;p < a;p++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					(n[i][p]) = Integer.parseInt(tempVar2);
				}

			}
		}
		if ((n[0][0] == 0) && (n[1][0] == 0) && (n[0][1]) == 0)
		{
				x1 = 0;
				y1 = 0;
		}
		if ((n[a - 1][a - 1] == 0 && (n[a - 2][a - 1] == 0) && (n[a - 1][a - 2]) == 0))
		{
			x2 = a - 1;
				y2 = a - 1;

		}
			for (i = 1;i < a - 1;i++)
			{
			for (p = 1;p < a - 1;p++)
			{
				if ((n[i][p] == 0) && (n[i + 1][p] == 0) && (n[i][p + 1]) == 0)
				{
					x1 = i;
				y1 = p;
				}
				if ((n[i][p] == 0) && (n[i - 1][p] == 0) && (n[i][p - 1]) == 0)
				{
					x2 = i;
				y2 = p;
				}
			}
			}
			s = (x2 - x1 - 1) * (y2 - y1 - 1);
			System.out.printf("%d",s);
			return 0;
	}
}

