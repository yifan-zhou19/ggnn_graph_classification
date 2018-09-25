package <missing>;

public class GlobalMembers
{
	public static int f1(int n)
	{
		int i;
		int m;
		for (i = 1,m = 0;i < n;i++)
		{
			if (i == 1)
			{
			m = m + 31;
			}
			if (i == 2)
			{
			m = m + 28;
			}
			if (i == 3)
			{
			m = m + 31;
			}
			if (i == 4)
			{
			m = m + 30;
			}
			if (i == 5)
			{
			m = m + 31;
			}
			if (i == 6)
			{
			m = m + 30;
			}
			if (i == 7)
			{
			m = m + 31;
			}
			if (i == 8)
			{
			m = m + 31;
			}
			if (i == 9)
			{
			m = m + 30;
			}
			if (i == 10)
			{
			m = m + 31;
			}
			if (i == 11)
			{
			m = m + 30;
			}
			if (i == 12)
			{
			m = m + 31;
			}
		}
		return m;
	}
	public static int f2(int n)
	{
		int m;
		int i;
		for (i = 1,m = 0;i < n;i++)
		{
			if (i == 1)
			{
			m = m + 31;
			}
			if (i == 2)
			{
			m = m + 29;
			}
			if (i == 3)
			{
			m = m + 31;
			}
			if (i == 4)
			{
			m = m + 30;
			}
			if (i == 5)
			{
			m = m + 31;
			}
			if (i == 6)
			{
			m = m + 30;
			}
			if (i == 7)
			{
			m = m + 31;
			}
			if (i == 8)
			{
			m = m + 31;
			}
			if (i == 9)
			{
			m = m + 30;
			}
			if (i == 10)
			{
			m = m + 31;
			}
			if (i == 11)
			{
			m = m + 30;
			}
			if (i == 12)
			{
			m = m + 31;
			}
		}
		return m;
	}
	public static int Main()
	{
		int y;
		int mon;
		int d;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			mon = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if (y % 4 != 0 || (y % 100 == 0 && y % 400 != 0))
		{
			a = f1(mon) + d;
			System.out.printf("%d",a);
		}
		else
		{
			a = f2(mon) + d;
			System.out.printf("%d",a);
		}
		System.in.read();
		System.in.read();
	}
}

