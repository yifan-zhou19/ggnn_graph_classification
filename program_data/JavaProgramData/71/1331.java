package <missing>;

public class GlobalMembers
{
	public static int lon(int y,int m1,int m2)
	{
		int i;
		int e;
		if (m1 > m2)
		{
			e = m1;
			m1 = m2;
			m2 = e;
		}
		int res = 0;
		for (i = m1;i < m2;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				res += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				res += 30;
			}
			else if (i == 2 && (y % 100 != 0 && y % 4 == 0 || y % 400 == 0))
			{
				res += 29;
			}
			else if (i == 2 && (y % 4 != 0 || (y % 100 == 0 && y % 400 != 0)))
			{
				res += 28;
			}
		}
		return res;
	}
	public static int Main()
	{
		int n;
		int y;
		int m1;
		int m2;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead("" "");
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead("" "");
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			if (lon(y, m1, m2) % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
	}



}

