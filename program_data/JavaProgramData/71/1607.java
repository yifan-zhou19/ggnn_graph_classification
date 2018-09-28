package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int y;
		int m;
		int n;
		int i;
		int e;
		int k;
		int day = 0;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= t;k++)
		{
			{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}
		}
		if (m > n)
		{
			e = m;
		m = n;
		n = e;
		}
			for (i = m;i < n;i++)
			{
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
				{
					day = day + 31;
				}
				if (i == 4 || i == 6 || i == 9 || i == 11)
				{
					day = day + 30;
				}
				if (i == 2 && (y % 400 == 0 || ((y % 4 == 0) && (y % 100 != 0))))
				{
					day = day + 29;
				}
				if (i == 2 && (y % 4 != 0 || (y % 100 == 0 && (y % 400 != 0))))
				{
					day = day + 28;
				}

			}


			if (day % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
			day = 0;
		}
	}

}

