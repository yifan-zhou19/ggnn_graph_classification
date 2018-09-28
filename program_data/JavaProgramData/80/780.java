package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year1;
		int year2;
		int month1;
		int month2;
		int day1;
		int day2;
		int s = 0;
		int s1 = 0;
		int s2 = 0;
		int i;
		int j;
		int k;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			year2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			month2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			day2 = Integer.parseInt(tempVar6);
		}
		for (i = year1;i <= year2;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				s = s + 366;
			}
			else
			{
				s = s + 365;
			}
		}
		if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0))
		{
			for (j = month1 - 1;j <= 11;j++)
			{
				if (j == month1 - 1)
				{
					s1 = s1 + b[j] - day1;
				}
				else
				{
					s1 = s1 + b[j];
				}
			}
		s = s - (366 - s1);
		}
		else
		{
			for (j = month1 - 1;j <= 11;j++)
			{
				if (j == month1 - 1)
				{
					s1 = s1 + a[j] - day1;
				}
				else
				{
					s1 = s1 + a[j];
				}
			}
		s = s - (365 - s1);
		}
		if ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0))
		{
			for (k = month2 - 1;k >= 0;k--)
			{
				if (k == month2 - 1)
				{
				s2 = s2 + day2;
				}
				else
				{
				s2 = s2 + b[k];
				}
			}
			s = s - (366 - s2);
		}
		else
		{
			for (k = month2 - 1;k >= 0;k--)
			{
				if (k == month2 - 1)
				{
					s2 = s2 + day2;
				}
				else
				{
				s2 = s2 + a[k];
				}
			}
			s = s - (365 - s2);
		}
		System.out.printf("%d",s);
		return 0;
	}











}

