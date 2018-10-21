package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t = 255;
		int x1 = -1;
		int y1 = -1;
		int x2 = -1;
		int y2 = -1;
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
					if (x1 < 0)
					{
						x1 = i;
						y1 = j;
					}
					if (j > y2)
					{
						y2 = j;
					}
					x2 = i;
				}
			}
		}
		System.out.printf("%d\n",(x2 - x1 - 1) * (y2 - y1 - 1));
		return 0;
	}


}

