package <missing>;

public class GlobalMembers
{
	public static int DiJiTian(int year, int month)
	{
		int i;
		int result;
		result = 1;
		for (i = 1;i < month;i++)
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
				if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
				{
					result += 29;
				}
				else
				{
					result += 28;
				}
			}
		}
				return result;
	}
	public static void Main(String[] args)
	{
		int n;
		int year;
		int m1;
		int m2;
		int c;
		int i;
		int j;
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
			c = Math.abs(DiJiTian(year, m1) - DiJiTian(year, m2));
			if (c % 7 == 0)
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

