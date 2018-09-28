package <missing>;

public class GlobalMembers
{
	public static int[] Day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static int sum = 0;
	public static int Main()
	{
	  int year;
	  int month;
	  int day;
	  year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  month = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 if (year <= 2000)
	 {
		 for (int i = 1;i <= year - 1;i++)
		 {

		  if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0))
		  {
			  sum += 2;
		  }
		  else
		  {
			  sum += 1;
		  }
		 }
	 }
	 else
	 {
		 for (int k = 1;k <= year % 2000 - 1;k++)
		 {

		  if (k % 400 == 0 || (k % 4 == 0 && k % 100 != 0))
		  {
			  sum += 2;
		  }
		  else
		  {
			  sum += 1;
		  }
		 }

	 }
	  if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
	  {
		  Day[2]++;
	  }
	  for (int j = 1;j <= month - 1;j++)
	  {
		  sum += Day[j];
	  }
	  sum += day - 1;
	  switch (sum % 7)
	  {
	  case 0:
		  System.out.print("Mon.");
		  break;
	  case 1:
		  System.out.print("Tue.");
		  break;
	  case 2:
		  System.out.print("Wed.");
		  break;
	  case 3:
		  System.out.print("Thu.");
		  break;
	  case 4:
		  System.out.print("Fri.");
		  break;
	  case 5:
		  System.out.print("Sat.");
		  break;
	  case 6:
		  System.out.print("Sun.");
		  break;
	  default:
		  return 0;
	  }
	  return 0;
	}
}

