package <missing>;

public class GlobalMembers
{
	public static int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


	public static int isleapyear(int year)
	{
	  return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}

	public static int Main()
	{
	  int year;
	  int month;
	  int day;
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
		  day = Integer.parseInt(tempVar3);
	  }


	  int n = 0;
	  int i;
	  for (i = 1; i < month; i++)
	  {
		n += days[i];
	  }

	  n += day;

	  if (month > 2 && isleapyear(year) != 0)
	  {
		n++;
	  }

	  System.out.printf("%d", n);
	}


}

