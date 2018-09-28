package <missing>;

public class GlobalMembers
{
	public static int days(int year,int month)
	{
		int i;
		int day = 0;
		for (i = 1;i < month;i++)
		{

			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			{
				day += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				day += 30;
			}
			else if (i == 2 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0))
			{
				day += 29;
			}
			else
			{
				day += 28;
			}
		}
		return day;
	}
	public static int Main()
	{
		int[] year = new int[200];
		int[] month1 = new int[200];
		int[] month2 = new int[200];
		int[] day1 = new int[200];
		int[] day2 = new int[200];
		int n;
		int i;
		int day;
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
				year[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				month1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				month2[i] = Integer.parseInt(tempVar4);
			}
			day1[i] = days(year[i], month1[i]);
			day2[i] = days(year[i], month2[i]);

		}
		for (i = 0;i < n;i++)
		{
			if ((day1[i] - day2[i]) % 7 == 0)
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

