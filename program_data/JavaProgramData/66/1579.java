package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int month;
		int day;
		int[] a = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  long sum = 0;
	  long year;
	  long temp;
	  long runnian;
	  year = Long.parseLong(ConsoleInput.readToWhiteSpace(true));
	  month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  temp = year - 1;
	  runnian = temp / 4 - temp / 100 + temp / 400;
	  sum = runnian * 366 + (temp - runnian) * 365;
	  if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0)
	  {
		  a[1] = 28;
	  }
	  if (month == 1)
	  {
		  sum += day;
	  }
	  else
	  {
		  for (int i = 0;i <= month - 2;i++)
		  {
		   sum += a[i];
		  }
	   sum += day;
	  }
	   sum = sum % 7;
	   switch (sum)
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
		 break;
	   }
	   return 0;
	}
}

