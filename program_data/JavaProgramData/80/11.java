package <missing>;

public class GlobalMembers
{
	public static int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


	public static int yadd(int y)
	{
	 if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
	 {
		 return 1;
	 }
	 else
	 {
		 return 0;
	 }
	}
	public static int madd(int y, int m)
	{
	 if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
	 {
		 if (m == 2)
		 {
			 return 1;
		 }
	 }
	 return 0;
	}
	public static int ydays(int y1, int y2)
	{
		int ans = 0;
		while (y1 != y2)
		{
			ans += yadd(y1) + 365;
			y1++;
		}
		return ans;
	}
	public static int mdays(int y, int m, int d)
	{
		int ans = 0;
		int i;
		int j;
		// month
		i = 1;
		while (i < m)
		{
			ans += month[i] + madd(y, i);
			i++;
		}
		ans += d;
		return ans;
	}
	public static int Main()
	{
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int ans;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			d2 = Integer.parseInt(tempVar6);
		}
		ans = ydays(y1, y2) - mdays(y1, m1, d1) + mdays(y2, m2, d2);
		System.out.printf("%d", ans);
		return 0;
	}
}

