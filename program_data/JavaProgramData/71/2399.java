package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int day1 = 0;
	   int day2 = 0;
	   int D;
	   int year;
	   int month1;
	   int month2;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  year = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  month1 = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  month2 = Integer.parseInt(tempVar4);
		  }
		  if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		  {
			 for (j = 1;j < month1;j++)
			 {
				if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10)
				{
					day1 = day1 + 31;
				}
				if (j == 2)
				{
					day1 = day1 + 29;
				}
				if (j == 4 || j == 6 || j == 9 || j == 11)
				{
					day1 = day1 + 30;
				}
			 }
			 for (j = 1;j < month2;j++)
			 {
				if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10)
				{
					day2 = day2 + 31;
				}
				if (j == 2)
				{
					day2 = day2 + 29;
				}
				if (j == 4 || j == 6 || j == 9 || j == 11)
				{
					day2 = day2 + 30;
				}
			 }
		  }
		  else
		  {
			 for (j = 1;j < month1;j++)
			 {
				if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10)
				{
					day1 = day1 + 31;
				}
				if (j == 2)
				{
					day1 = day1 + 28;
				}
				if (j == 4 || j == 6 || j == 9 || j == 11)
				{
					day1 = day1 + 30;
				}
			 }
			 for (j = 1;j < month2;j++)
			 {
				if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10)
				{
					day2 = day2 + 31;
				}
				if (j == 2)
				{
					day2 = day2 + 28;
				}
				if (j == 4 || j == 6 || j == 9 || j == 11)
				{
					day2 = day2 + 30;
				}
			 }
		  }
		  D = day1 - day2;
		  if (D < 0)
		  {
			  D = 0 - D;
		  }
		  if (D % 7 == 0)
		  {
			  System.out.print("YES\n");
		  }
		  if (D % 7 != 0)
		  {
			  System.out.print("NO\n");
		  }
		  day1 = 0;
		  day2 = 0;
	   }
	   return 0;
	}



}

