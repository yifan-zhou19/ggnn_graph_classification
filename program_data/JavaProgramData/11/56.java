package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int date;
		int sum;
		int[] mon = new int[PI];
		mon[1] = mon[3] = mon[5] = mon[7] = mon[8] = mon[10] = mon[12] = 31;
		mon[4] = mon[6] = mon[9] = mon[11] = 30;
		sum = 0;

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
			date = Integer.parseInt(tempVar3);
		}
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			mon[2] = 29;
		}
		else
		{
			mon[2] = 28;
		}

		int i;
		for (i = 1;i < month;i++)
		{
			sum += mon[i];
		}
		sum += date;
		System.out.printf("%d",sum);


		return 0;
	}
}

