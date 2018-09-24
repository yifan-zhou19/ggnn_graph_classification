package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int x1;
		int y1;
		int x2;
		int y2;
		int s = 0;
		int a;
		int t;
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
					if (s == 0)
					{
						x1 = i;
						y1 = j;
						s = 1;
					}
					x2 = i;
					y2 = j;
				}
			}
		}
		a = (x2 - x1 - 1) * (y2 - y1 - 1);
		if (a < 0)
		{
			a = -a;
		}
		System.out.printf("%d",a);
		return 0;
	}
}

