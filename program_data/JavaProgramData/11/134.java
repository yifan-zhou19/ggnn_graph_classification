package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] d = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int year;
		int month;
		int day;
		int i;
		int days = 0;
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
		for (i = 1;i < month;i++)
		{
			days = days + d[i - 1];
		}
		days = days + day;
		if ((year % 4 == 0 || year % 400 == 0) && month > 2)
		{
			days = days++;
		}
		System.out.printf("%d",days);
	}


}

