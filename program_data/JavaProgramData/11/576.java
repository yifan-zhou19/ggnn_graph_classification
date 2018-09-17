package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int mon;
		int g;
		int i;
		int e = 0;
		int day;
		int[] montha = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] monthb = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			mon = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			g = Integer.parseInt(tempVar3);
		}

		for (i = 0;i < mon;i++)
		{
			if (year % 4 == 0)
			{
				if (year % 100 == 0 && year % 400 != 0)
				{
				e = e + montha[i];

				day = e + g;
				}
			   else
			   {
				e = e + monthb[i];
				day = e + g;
			   }
			}
			if (year % 4 != 0)
			{
			  e = e + montha[i];
			  day = e + g;
			}
		}
		   System.out.printf("%d",day);
		   return 0;
	}

}

