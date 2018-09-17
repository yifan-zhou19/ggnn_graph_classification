package <missing>;

public class GlobalMembers
{
	public static int leap(int year)
	{
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static void Main()
	{
		int year;
		int month;
		int day;
		int leap1;
		int answer = 0;
		int i;
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		leap1 = leap(year);
		if (leap1 == 1)
		{
			for (i = 1;i < month;i++)
			{
				answer += b[i];
			}
			answer += day;
		}
		else
		{
			for (i = 1;i < month;i++)
			{
				answer += a[i];
			}
			answer += day;
		}
		System.out.printf("%d",answer);
	}
}

