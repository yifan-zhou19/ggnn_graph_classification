package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int sum = 0;
		int[] monthday = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
		 for (int i = 1;i < month;i++)
		 {
				sum += monthday[i - 1];
		 }
		sum += day;
		if (month > 2 && (!year % 4 == 0 && year % 100 != 0 || year % 400 != 0))
		{
				sum -= 1;
		}
		System.out.printf("%d",sum);
			return 0;
	}
}

