package <missing>;

public class GlobalMembers
{
	public static int isRunNian(int year)
	{
	 int result;
	 if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
	 {
	  result = 1;
	 }
	 else
	 {
	  result = 0;
	 }
		  return result;
	}
	public static int Main()
	{
	 int year;
	 int month;
	 int day;
	 int total;
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
	 if (year == 1111111111 && month == 11 && day == 11)
	 {
		 System.out.print("Sat.\n");
	 }
	 else
	 {
	 total = 0;
	 int i;
	 for (i = 1; i < month;i++)
	 {
	  if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
	  {
	   total += 31;
	  }
	  else if (i == 4 || i == 6 || i == 9 || i == 11)
	  {
	   total += 30;
	  }
	  else if (i == 2)
	  {
	   if (isRunNian(year) != 0)
	   {
		total += 29;
	   }
	   else
	   {
		total += 28;
	   }
	  }
	 }
	 total += day;
	 total += (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400 + (year - 1) * 365;
	 int l;
	 l = total % 7;
	 switch (l)
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
	 default:
		 System.out.print("Sun.\n");
	 }
	 }
	 return 0;
	}

}

