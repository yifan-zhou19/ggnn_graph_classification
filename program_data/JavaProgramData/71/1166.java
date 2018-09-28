package <missing>;

public class GlobalMembers
{
	public static int getday(int year, int month)
	{
		int total;
		int i;

		total = 0;
		for (i = 1; i < month; i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				total = total + 31;
			}
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				total = total + 30;
			}
			if (i == 2)
			{
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
				{
					total = total + 29;
				}
				else
				{
					total = total + 28;
				}
			}
		}
		total = total + 1;

		return total;
	}

	public static int Main()
	{
		int n;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a;
		a = new int[n];
		for (j = 0;j < n;j++)
		{
			a[j] = 0;
		}

		for (j = 0;j < n;j++)
		{

		int year1;
		int month1;
		int month2;
		int total1;
		int total2;
		int days;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			year1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			month1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			month2 = Integer.parseInt(tempVar4);
		}
		total1 = getday(year1, month1);
		total2 = getday(year1, month2);

		days = total2 - total1;

		if (days % 7 == 0)
		{
			a[j] = 1;
		}
		else
		{
			a[j] = 0;
		}
		}

		for (j = 0;j < n;j++)
		{
			if (a[j] == 1)
			{
				System.out.print("YES\n");
			}
			else if (a[j] == 0)
			{
				System.out.print("NO\n");
			}
		}


		return 0;
	}

}

