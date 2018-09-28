package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int k;
		int day;
		int i;
		int a;
		int b;
		int c = 0;
		int j;
		int s;
		int t;
		int month;
		int y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		a = year % 400;
		if (a == 0)
		{
			a = 400;
		}
		if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0))
		{
			j = 1;
		}
		else
		{
			j = 0;
		}

		for (i = 0;i < a;i++)
		{
			if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0))
			{
				c++;
			}
		}
		for (month = 0;month < k;month++)
		{
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			{
				b = 31;
			}
			else if (month == 4 || month == 6 || month == 9 || month == 11)
			{
				b = 30;
			}
			else if (month == 2 && j == 1)
			{
				b = 29;
			}
			else if (month == 2 && j == 0)
			{
				b = 28;
			}
			else
			{
				b = 0;
			}
			y += b;

		}

		s = (a - c) * 365 + (c - 1) * 366 + y + day;
		t = s % 7;
		if (t == 0)
		{
			System.out.print("Sun.");
		}
		else if (t == 1)
		{
			System.out.print("Mon.");
		}
		else if (t == 2)
		{
			System.out.print("Tue.");
		}
		else if (t == 3)
		{
			System.out.print("Wed.");
		}
		else if (t == 4)
		{
			System.out.print("Thu.");
		}
		else if (t == 5)
		{
			System.out.print("Fri.");
		}
		else
		{
			System.out.print("Sat.");
		}
		return 0;
	}





}

