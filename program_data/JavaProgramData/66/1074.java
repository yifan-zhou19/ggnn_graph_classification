package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int DiJiTian = new int(int year, int month, int day);
		int isRunNian = int year;
		int a;
		int b;
		int c;
		int days = 0;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		a %= 2800;
		for (i = 1;i < a;i++)
		{
			if (isRunNian(i) != 0)
			{
				days += 2;
			}
			else
			{
				days += 1;
			}
		}
		days += DiJiTian(a, b, c);
		n = (days % 7);
		if (n == 1)
		{
				System.out.print("Mon.");
		}
		else if (n == 2)
		{
				System.out.print("Tue.");
		}
		else if (n == 3)
		{
				System.out.print("Wed.");
		}
		else if (n == 4)
		{
				System.out.print("Thu.");
		}
		else if (n == 5)
		{
				System.out.print("Fri.");
		}
		else if (n == 6)
		{
				System.out.print("Sat.");
		}
		else if (n == 0)
		{
				System.out.print("Sun.");
		}
		return 0;
	}
		public static int isRunNian(int year)
		{
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
		}
		public static int DiJiTian(int year, int month, int day)
		{
		int result = 0;
		for (int i = 1; i < month; i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				result += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				result += 30;
			}
			else if (i == 2)
			{
				if (isRunNian(year) != 0)
				{
					result += 29;
				}
				else
				{
					result += 28;
				}
			}
		}
		result += day;
		return result;
		}

}

