package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int i;
		int days = 0;
		int n;
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
		n = (year - 1) % 400 + 1;
		for (i = 1;i < n;i++)
		{
			 if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
			 {
			  days += 2;
			 }
			 else
			 {
			 days++;
			 }
		}
		for (i = 1;i < month;i++)
		{
			 if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			 {
			 days += 3;
			 }
			 else if (i == 4 || i == 6 || i == 9 || i == 11)
			 {
			 days += 2;
			 }
			 else if (i == 2)
			 {
				  if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
				  {
				  days += 1;
				  }
				  else
				  {
				  days += 0;
				  }
			 }
		}
		days += day;
		   switch (days % 7)
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
			case 0:
			 System.out.print("Sun.");
		   }
			 return 0;
	}

}

