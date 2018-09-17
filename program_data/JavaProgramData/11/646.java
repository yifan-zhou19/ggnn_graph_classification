package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int year;
		int month;
		int day;
		int n = 0;
		int[] dayofmonth1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] dayofmonth2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))
		{
			for (i = 0;i < month - 1;i++)
			{
				n += dayofmonth1[i];
			}
			n = n + day;
			System.out.printf("%d",n);
		}
		else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			for (i = 0;i < month - 1;i++)
			{
				n += dayofmonth2[i];
			}
			n = n + day;
			System.out.printf("%d",n);
		}
		return 0;
	}

}

