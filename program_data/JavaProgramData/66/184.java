package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void print(int n);
		int year;
		int month;
		int day;
		int d;
		int date;
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
		if (month == 1 || month == 2)
		{
			year = year - 1;
		month = month + 12;
		}
		 d = (day + 2 * month + 3 * (month + 1) / 5 + year + year / 4 - year / 100 + year / 400);
		 date = d % 7 + 1;
		 print(date);
		 return 0;
	}

	public static void print(int n)
	{
		switch (n)
		{
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
		case 7:
			System.out.print("Sun.");
			break;

		}
	}

}

