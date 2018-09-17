package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int[] monthday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
		int i;
		int j;
		int sum = 0;
		for (i = 1;i < month;i++)
		{
		j = i - 1;
		sum = sum + monthday[j];
		}
		sum = sum + day;
		int a;
		a = year % 4;
		if (month > 2 && (a == 0 && year % 100 != 0 || year % 400 == 0))
		{
			sum = sum + 1;
		}
		System.out.printf("%d",sum);
		return 0;
	}

}

