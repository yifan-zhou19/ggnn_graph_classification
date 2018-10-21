package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int mon;
		int day;
		int i;
		int j;
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			mon = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		w = (year - 1) % 7 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		for (i = 1;i < mon;i++)
		{
			if (i == 2)
			{
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				{
					w = w + 29;
				}
				else
				{
					w = w + 28;
				}
			}
			else if (i == 1)
			{
				w = w + 31;
			}
			else if (i == 3)
			{
				w = w + 31;
			}
			else if (i == 4)
			{
				w = w + 30;
			}
			else if (i == 5)
			{
				w = w + 31;
			}
			else if (i == 6)
			{
				w = w + 30;
			}
			else if (i == 7)
			{
				w = w + 31;
			}
			else if (i == 8)
			{
				w = w + 31;
			}
			else if (i == 9)
			{
				w = w + 30;
			}
			else if (i == 10)
			{
				w = w + 31;
			}
			else if (i == 11)
			{
				w = w + 30;
			}
			else
			{
				w = w + 31;
			}
		}
		w = w + day;
		j = w % 7;
		if (j == 0)
		{
			System.out.print("Sun.");
		}
		else if (j == 1)
		{
			System.out.print("Mon.");
		}
		else if (j == 2)
		{
			System.out.print("Tue.");
		}
		else if (j == 3)
		{
			System.out.print("Wed.");
		}
		else if (j == 4)
		{
			System.out.print("Thu.");
		}
		else if (j == 5)
		{
			System.out.print("Fri.");
		}
		else if (j == 6)
		{
			System.out.print("Sat.");
		}
		return 0;
	}

}

