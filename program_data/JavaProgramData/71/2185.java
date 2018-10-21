package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int year;
		int month1;
		int month2;
		int i;
		int day1;
		int day2;
		int isRunNian = int year;
		int DiJiTian = new int(int year, int month);
		int[] sz = new int[200];
		int jg;
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
			if ((DiJiTian(year, month2) - DiJiTian(year, month1)) < 0)
			{
				jg = -(DiJiTian(year, month2) - DiJiTian(year, month1));
			}
			else
			{
				jg = (DiJiTian(year, month2) - DiJiTian(year, month1));
			}
			if (jg % 7 == 0)
			{
				sz[i] = 1;
			}
			else
			{
				sz[i] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] == 1)
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
	public static int isRunNian(int year)
	{
		int result;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		  return result;
	}
	public static int DiJiTian(int year, int month)
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

		return result;
	}
}

