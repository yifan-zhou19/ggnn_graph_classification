package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int date;
		int t;
		int y;
		int m;
		int d;
		int s;
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
		t = (year - 1) / 400;
		year = year - t * 400;
		t = (year - 1) / 4;
		y = (t * 366 + (year - 1 - t) * 365) % 7;
		if (year > 300)
		{
			y = (y - 3) % 7;
		}
		else if (year > 200)
		{
			y = (y - 2) % 7;
		}
		else if (year > 100)
		{
			y = (y - 1) % 7;
		}
		switch (month)
		{
		 case 1:
			 m = 0;
			 break;
		 case 2:
			 m = 3;
			 break;
		 case 3:
			 m = 3;
			 break;
		 case 4:
			 m = 6;
			 break;
		 case 5:
			 m = 1;
			 break;
		 case 6:
			 m = 4;
			 break;
		 case 7:
			 m = 6;
			 break;
		 case 8:
			 m = 2;
			 break;
		 case 9:
			 m = 5;
			 break;
		 case 10:
			 m = 0;
			 break;
		 case 11:
			 m = 3;
			 break;
		 case 12:
			 m = 5;
			 break;
		}
		if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && month > 2)
		{
			m = (m + 1) % 7;
		}
		d = date % 7;
		s = (m + y + d) % 7;
		switch (s)
		{
		case 0:
			System.out.print("Sun.\n");
			break;
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

		}


			return 0;
	}
}

