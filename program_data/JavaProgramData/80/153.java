package <missing>;

public class GlobalMembers
{
	public static int leap(int year)
	{
		if (year % 4 == 0)
		{
			if (year % 100 == 0)
			{
				if (year % 400 == 0)
				{
					return 1;
				}
				return 0;
			}
			return 1;
		}
		return 0;
	}
	public static int Main()
	{
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		int[][] monthday =
		{
			{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sy = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			sm = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			sd = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			ey = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			em = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			ed = Integer.parseInt(tempVar6);
		}
		int tmp;
		if ((sy > ey) || (sy == ey && sm > em) || (sy == ey && sm == em && sd > ed))
		{ //???????? ????????????
			tmp = sy;
			sy = ey;
			ey = tmp;
			tmp = sm;
			sm = em;
			em = tmp;
			tmp = sd;
			sd = ed;
			ed = tmp;
		}
		int ans = 0;
		while (sy != ey || sm != em || sd != ed)
		{
			ans++;
			sd++;
			if (sd > monthday[leap(sy)][sm])
			{
				sd = 1;
				sm++;
			}
			if (sm == 13)
			{
				sm = 1;
				sy++;
			}
		}
		System.out.printf("%d\n",ans);
			return 0;
	}
}

