package <missing>;

public class GlobalMembers
{
	public static int GetMonthDays(int year, int month)
	{
		int day;
		if (month == 4 || month == 6 || month == 9 || month == 11)
		{
			 day = 30;
		}
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
			 day = 31;
		}
		if (month == 2)
		{
		  if (CheckLeap(year) == 1)
		  {
			 day = 29; //???29?
		  }
		  if (CheckLeap(year) == 0)
		  {
			day = 28; //????28?
		  }
		}
		return day;
	}
	public static int CheckLeap(int year)
	{
		int jugde = 0; //???
		if (year % 100 != 0)
		{
		  if (year % 4 == 0)
		  {
			jugde = 1;
		  }
		} //????100?????4??????
		if (year % 100 == 0)
		{
		   if (year % 400 == 0)
		   {
			 jugde = 1;
		   }
		} //???100???????400???????
		return jugde; //?????
	}
	public static int Main()
	{
		  int year;
		  int month;
		  int day = 1;
		  int s = 0;
		  int i;
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
		  for (i = 1;i < month;i++)
		  {
			 s += GetMonthDays(year, i);
		  }
		  s += day;
		  System.out.printf("%d",s);
	}
}

