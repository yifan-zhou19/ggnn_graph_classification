package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int year;
	  int month;
	  int day;
	  int k = 0;
	  int[] monthday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
	  if (month == 1)
	  {
		  k = k + day;
	  }
	  else if (month == 2)
	  {
		  k = k + 31 + day;
	  }
	  else if (month == 3)
	  {
		  k = k + 31 + 28 + day;
	  }
	  else if (month == 4)
	  {
		  k = k + 31 + 28 + 31 + day;
	  }
	  else if (month == 5)
	  {
		  k = k + 31 + 28 + 31 + 30 + day;
	  }
	  else if (month == 6)
	  {
		  k = k + 31 + 28 + 31 + 30 + 31 + day;
	  }
	  else if (month == 7)
	  {
		  k = k + 31 + 28 + 31 + 30 + 31 + 30 + day;
	  }
	  else if (month == 8)
	  {
		  k = k + 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
	  }
	  else if (month == 9)
	  {
		  k = k + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
	  }
	  else if (month == 10)
	  {
		  k = k + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
	  }
	  else if (month == 11)
	  {
		  k = k + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
	  }
	  else if (month == 12)
	  {
		  k = k + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
	  }
	  if ((((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) && (month > 2))
	  {
		  k = k + 1;
	  }
	  System.out.printf("%d",k);
	  return 0;
	}
}

