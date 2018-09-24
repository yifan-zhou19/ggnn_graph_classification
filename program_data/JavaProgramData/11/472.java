package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int year;
		int math;
		int day;
		int date;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			math = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
		  if (math == 1)
		  {
			   date = day;
		  }
		  if (math == 2)
		  {
			date = 31 + day;
		  }
		  if (math == 3)
		  {
			date = 31 + 29 + day;
		  }
		  if (math == 4)
		  {
			date = 31 + 29 + 31 + day;
		  }
		  if (math == 5)
		  {
			date = 31 + 29 + 31 + 30 + day;
		  }
		  if (math == 6)
		  {
			date = 31 + 29 + 31 + 30 + 31 + day;
		  }
		  if (math == 7)
		  {
			date = 31 + 29 + 31 + 30 + 31 + 30 + day;
		  }
		  if (math == 8)
		  {
			date = 31 + 29 + 31 + 30 + 31 + 30 + 31 + day;
		  }
		  if (math == 9)
		  {
			date = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + day;
		  }
		  if (math == 10)
		  {
			date = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
		  }
		  if (math == 11)
		  {
			date = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
		  }
		  if (math == 12)
		  {
			date = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
		  }
		}
		if (year % 4 != 0 || (year % 100 == 0) && year % 400 != 0)
		{
		  if (math == 1)
		  {
			   date = day;
		  }
		  if (math == 2)
		  {
			date = 31 + day;
		  }
		  if (math == 3)
		  {
			date = 31 + 28 + day;
		  }
		  if (math == 4)
		  {
			date = 31 + 28 + 31 + day;
		  }
		  if (math == 5)
		  {
			date = 31 + 28 + 31 + 30 + day;
		  }
		  if (math == 6)
		  {
			date = 31 + 28 + 31 + 30 + 31 + day;
		  }
		  if (math == 7)
		  {
			date = 31 + 28 + 31 + 30 + 31 + 30 + day;
		  }
		  if (math == 8)
		  {
			date = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
		  }
		  if (math == 9)
		  {
			date = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
		  }
		  if (math == 10)
		  {
			date = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
		  }
		  if (math == 11)
		  {
			date = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
		  }
		  if (math == 12)
		  {
			date = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
		  }
		}




		System.out.printf("%d",date);
	}
}

