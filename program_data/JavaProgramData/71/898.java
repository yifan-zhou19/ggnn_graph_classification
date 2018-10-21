package <missing>;

public class GlobalMembers
{
	public static int[] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int Main()
	{
	int M;
	int y;
	int m1;
	int m2;
	int i;
	int s;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		M = Integer.parseInt(tempVar);
	}
	while (M > 0)
	{
		M--;
		s = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m2 = Integer.parseInt(tempVar4);
		}
		if (m1 == m2)
		{
			System.out.print("YES\n");
			continue;
		}
		if (m1 > m2)
		{
			i = m1;
			m1 = m2;
			m2 = i;
		}
		if ((1 == m1 && 2 != m2) || 2 == m1)
		{
			if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0))
			{
				s = 1;
			}
		}
		for (i = m1;i < m2;i++)
		{
			s += mon[i];
		}
		if (s % 7 == 0)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
	}
	return 0;
	}
}

