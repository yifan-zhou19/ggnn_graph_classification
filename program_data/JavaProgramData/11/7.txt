package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct date
	//	{
	//		int year;
	//		int month;
	//		int day;
	//		int days;
	//	}
	//	date1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			date1.year = tempVar;
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			date1.month = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			date1.day = tempVar3;
		}
		int[] b = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		date1.days = 0;
		int i;
		if (date1.month > 1)
		{
			for (i = 0;i <= date1.month - 2;i++)
			{
				date1.days = date1.days + b[i];
			}
			date1.days = date1.days + date1.day;
		}
		else
		{
			date1.days = date1.day;
		}
		System.out.printf("%d",date1.days);
	}
}

