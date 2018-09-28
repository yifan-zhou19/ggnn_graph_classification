package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] m1 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int j;
		int year;
		int month;
		int day;
		int day1;
		int d = 0;
		int sum = 0;
		int total;
		int xq;
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
		year = year % 2000 + 400;
		for (i = 1;i < year;i++)
		{
			if (i < 100)
			{
				if (i % 4 == 0)
				{
					sum = sum + 366;
				}
				else
				{
					sum = sum + 365;
				}
			}
			if (i >= 100)
			{
				   if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
				   {
					sum = sum + 366;
				   }
				else
				{
					sum = sum + 365;
				}
			}

		}
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			for (j = 1;j < month;j++)
			{
				d = d + m1[j];
			}

			day1 = d + day;
		}
		else
		{
			 for (j = 1;j < month;j++)

			 {
				d = d + m[j];
			 }

			day1 = d + day;
		}
		total = sum + day1;
		xq = total % 7;
		switch (xq)
		{
			case 0:
				System.out.print("Sun.");
				break;
			case 1:
				System.out.print("Mon.");
				break;
			case 2:
				System.out.print("Tue.");
				break;
			case 3:
				System.out.print("Wed.");
				break;
			case 4:
				System.out.print("Thu.");
				break;
			case 5:
				System.out.print("Fri.");
				break;
			case 6:
				System.out.print("Sat.");
				break;
		}

	}


}

