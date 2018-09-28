package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int fun = new int(int x,int y);
		int value = new int(int x,int y);
		int n;
		int year;
		int month1;
		int month2;
		int i;
		int a;
		int b;
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
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				month1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				month2 = Integer.parseInt(tempVar4);
			}
			a = fun(year, month1);
			b = fun(year, month2);
			if ((value(a, b)) % 7 == 0)
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

	public static int fun(int x,int y)
	{
		int k = 0;
		int days;
		if ((x % 4 == 0 && x % 100 != 0) || x % 400 == 0)
		{
			k = 1;
		}
		if (y == 1)
		{
			days = 0;
		}
		if (y == 2)
		{
			days = 31;
		}
		if (y == 3)
		{
			days = 31 + 28 + k;
		}
		if (y == 4)
		{
			days = 31 + 28 + 31 + k;
		}
		if (y == 5)
		{
			days = 31 + 28 + 31 + 30 + k;
		}
		if (y == 6)
		{
			days = 31 + 28 + 31 + 30 + 31 + k;
		}
		if (y == 7)
		{
			days = 31 + 28 + 31 + 30 + 31 + 30 + k;
		}
		if (y == 8)
		{
			days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + k;
		}
		if (y == 9)
		{
			days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + k;
		}
		if (y == 10)
		{
			days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + k;
		}
		if (y == 11)
		{
			days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + k;
		}
		if (y == 12)
		{
			days = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + k;
		}
		return (days);
	}

	public static int value(int x,int y)
	{
		int c;
		if (x > y)
		{
			c = x - y;
		}
		else
		{
			c = y - x;
		}
		return (c);
	}
}

