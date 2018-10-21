package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int i;
		int y = 0;
		int days;
		int w;
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
			days = Integer.parseInt(tempVar3);
		}
		for (i = 1;i < month;i++)
		{
		   if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
		   {
			   day = 31;
		   }
		   else
		   {
			   if (i == 4 || i == 6 || i == 9 || i == 11)
			   {
				   day = 30;
			   }
			   else
			   {
				   if (i == 2)
				   {
				   if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				   {
					   day = 29;
				   }
				   else
				   {
					   day = 28;
				   }
				   }
			   }
		   }
		   y = y + day;
		}
		w = y + days;
		System.out.printf("%d\n",w);
		return 0;
	}

}

