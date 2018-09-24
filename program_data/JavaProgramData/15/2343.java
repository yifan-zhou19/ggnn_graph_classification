package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int x1;
		int x2;
		int y1;
		int y2;
		int n;
		int t;
		int area;
		int statue = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					t = Integer.parseInt(tempVar2);
				}
				if (t == 0)
				{
					if (statue == 0)
					{
						x1 = i;
						y1 = j;
						statue++;
					}
					x2 = i;
					y2 = j;
				}
			}
		}
		area = (x2 - x1 - 1) * (y2 - y1 - 1);
		System.out.printf("%d",area);
	}
}

