package <missing>;

public class GlobalMembers
{
	public static int mon;
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int day(),month[12]={31,28,31,30,31,30,31,31,30,31,30,31};

	public static int Main()
	{
		int i;
		int j;
		int n;
		int year;
		int month1;
		int month2;
		int days1;
		int days2;
		int daysbetween;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 year = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 month1 = Integer.parseInt(tempVar3);
			 }
			 String tempVar4 = ConsoleInput.scanfRead(" ");
			 if (tempVar4 != null)
			 {
				 month2 = Integer.parseInt(tempVar4);
			 }
			 if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			 {
				   month[1]++;
			 }
			 days1 = day(month1);
			 days2 = day(month2);
			 daysbetween = days1 - days2;
			 if (daysbetween % 7 == 0)
			 {
				   System.out.print("YES\n");
			 }
			 else
			 {
				   System.out.print("NO\n");
			 }
			 month[1] = 28;
		}
		return 0;
	}

	public static int day(int mon)
	{
		int k;
		int days = 0;
		for (k = 0;k < mon - 1;k++)
		{
		   days += month[k];
		}
		return days;
	}

}

