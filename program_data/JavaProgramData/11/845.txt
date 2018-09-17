package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int res = 0;
		int i;
		int[] y = new int[12];
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
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
		{
			y[1] = 29;
		}
		else
		{
			y[1] = 28;
		}
		y[0] = 31;
		y[2] = 31;
		y[4] = 31;
		y[7] = 31;
		y[6] = 31;
		y[9] = 31;
		y[3] = 30;
		y[5] = 30;
		y[8] = 30;
		y[10] = 30;
		for (i = 0;i < month - 1;i++)
		{
			res += y[i];
		}
		res += day;
		System.out.printf("%d",res);
	}
}

