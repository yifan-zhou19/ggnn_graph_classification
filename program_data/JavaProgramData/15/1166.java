package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		int i;
		int j;
		int x1;
		int y1;
		int x2;
		int y2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		x1 = -1;
		y1 = -1;
		x2 = -1;
		y2 = -1;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					t = Integer.parseInt(tempVar2);
				}
				if (t == 0)
				{
					if (x1 == -1 && y1 == -1)
					{
						x1 = j;
						y1 = i;
					}
					x2 = j;
					y2 = i;
				}
			}
		}
		if (x1 == x2 || y1 == y2)
		{
			System.out.print("0");
		}
		else
		{
			System.out.printf("%d", (x2 - x1 - 1) * (y2 - y1 - 1));
		}
		return 0;
	}
}

