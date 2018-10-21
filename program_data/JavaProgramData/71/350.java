package <missing>;

public class GlobalMembers
{
	public static int runnian(int n)
	{
		if (n % 400 == 0)
		{
			return 1;
		}
		else if (n % 100 == 0)
		{
			return 0;
		}
		else if (n % 4 == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int day(int m)
	{
		int num;
		if (m == 1)
		{
			num = 0;
		}
		else if (m == 2)
		{
			num = 31;
		}
		else if (m == 3)
		{
			num = 59;
		}
		else if (m == 4)
		{
			num = 90;
		}
		else if (m == 5)
		{
			num = 120;
		}
		else if (m == 6)
		{
			num = 151;
		}
		else if (m == 7)
		{
			num = 181;
		}
		else if (m == 8)
		{
			num = 212;
		}
		else if (m == 9)
		{
			num = 243;
		}
		else if (m == 10)
		{
			num = 273;
		}
		else if (m == 11)
		{
			num = 304;
		}
		else if (m == 12)
		{
			num = 334;
		}
		return num;
	}
	public static int Main()
	{
		int n;
		int y;
		int m1;
		int m2;
		int i;
		int e;
		int da;
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
			if (m1 > m2)
			{
				e = m1;
				m1 = m2;
				m2 = e;
			}
			if ((m1 == 1 || m1 == 2) && (m2 != 1 && m2 != 2) && runnian(y) == 1)
			{
				da = day(m2) - day(m1) + 1;
			}
			else
			{
				da = day(m2) - day(m1);
			}
		if (da % 7 == 0)
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

