package <missing>;

public class GlobalMembers
{
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
	public static int Main()
	{

		int year;
		int month;
		int day = 1;
		int m1;
		int d1 = 1;
		int t1;
		int a;
		int total;
		int i = 1;
		int n;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 0;a < n;a++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			year = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			month = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m1 = Integer.parseInt(tempVar4);
		}
		total = 0;
		for (i = 1;i < month;i++)
		{ //step1
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				total += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				total += 30;
			}
			else if (i == 2)
			{
				if (isRunNian(year) != 0)
				{
					total += 29;
				}
				else
				{
					total += 28;
				}
			}
		}
		total += day;
		t1 = 0;
		for (i = 1;i < m1;i++)
		{ //step1
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				t1 += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				t1 += 30;
			}
			else if (i == 2)
			{
				if (isRunNian(year) != 0)
				{
					t1 += 29;
				}
				else
				{
					t1 += 28;
				}
			}
		}
		t1 += d1;
			s = total - t1;
			if (s % 7 == 0 || (0 - s) % 7 == 0)
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

