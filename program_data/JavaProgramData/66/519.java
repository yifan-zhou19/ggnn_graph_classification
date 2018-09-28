package <missing>;

public class GlobalMembers
{
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
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
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
	public static int Main()
	{
		int y;
		int m;
		int d;
		int k;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}

		j = y - 1;

		k = DiJiTian(y, m, d) + j + j / 400 + j / 4 - j / 100;
		m = (k % 7);
		if (m == 0)
		{
			System.out.print("Sun.\n");
		}
		else if (m == 1)
		{
			System.out.print("Mon.\n");
		}
		else if (m == 2)
		{
			System.out.print("Tue.\n");
		}
		else if (m == 3)
		{
			System.out.print("Wed.\n");
		}
		else if (m == 4)
		{
			System.out.print("Thu.\n");
		}
		else if (m == 5)
		{
			System.out.print("Fri.\n");
		}
		else
		{
			System.out.print("Sat.\n");
		}


		return 0;
	}

}

