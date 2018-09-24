package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int[] dm = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int day = 0;
		int month = 0;
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
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
		{
			dm[1] = 29;
		}
		int i;
		int m = 0;
		int d = 0;
		for (i = 0;i < month - 1;i++)
		{
			d += dm[i];
		}
			d += day;
		System.out.printf("%d",d);
		return 0;
	}

}

