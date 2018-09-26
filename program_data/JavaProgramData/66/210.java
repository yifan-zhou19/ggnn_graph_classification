package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int a;
		int year;
		int month;
		int day;
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
		a = (year - 1) % 400;
		int total1 = 0;
		int total2 = 0;
		int total3 = 0;
		int total = 0;
		for (i = 1;i <= a;i++)
		{
			total1 = (total1 + 1) % 7;
			if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
			{
				total1 = total1 + 1;
			}
		}
		int[] mth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = 1;i < month;i++)
		{
			total2 = total2 + mth[i - 1];
		}
		if ((year % 4 == 0 && year % 100 != 0) || ((year % 400 == 0) && (month > 2)))
		{
			total2 = total2 + 1;
		}
		total3 = day;
		total = total1 + total2 + total3;
		switch (total % 7)
		{
		case 1:
			System.out.print("Mon.\n");
			break;
		case 2:
			System.out.print("Tue.\n");
			break;
		case 3:
			System.out.print("Wed.\n");
			break;
		case 4:
			System.out.print("Thu.\n");
			break;
		case 5:
			System.out.print("Fri.\n");
			break;
		case 6:
			System.out.print("Sat.\n");
			break;
		case 0:
			System.out.print("Sun.\n");
			break;
		}
	}


}

