package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int mon;
		int day;
		int a;
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
			if (mon == 1)
			{
				a = day;
			}
			else if (mon == 2)
			{
				a = 31 + day;
			}
			else if (mon == 3)
			{
				a = 59 + day;
			}
			else if (mon == 4)
			{
				a = 90 + day;
			}
			else if (mon == 5)
			{
				a = 120 + day;
			}
			else if (mon == 6)
			{
				a = 151 + day;
			}
			else if (mon == 7)
			{
				a = 181 + day;
			}
			else if (mon == 8)
			{
				a = 212 + day;
			}
			else if (mon == 9)
			{
				a = 243 + day;
			}
			else if (mon == 10)
			{
				a = 273 + day;
			}
			else if (mon == 11)
			{
				a = 304 + day;
			}
			else
			{
				a = 334 + day;
			}
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			{
				if (mon >= 3)
				{
					a = a + 1;
				}
			}
			System.out.printf("%d\n",a);
			return 0;
	}

}

