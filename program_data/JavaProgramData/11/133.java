package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	  int year;
	  int month;
	  int day;
	  int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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

	  if (year % 4 != 0)
	  {
		  days[1] = 28;
	  }
	  else if (year % 4 == 0 && year % 100 != 0)
	  {
		  days [1] = 29;
	  }
	  else if (year % 400 == 0)
	  {
		  days [1] = 29;
	  }
	  else if (year % 100 == 0 && year % 400 != 0)
	  {
		  days [1] = 28;
	  }
	  int i;
	  int k = 0;
	  int n;
	  for (i = 1;i < month;i++)
	  {
		  k = k + days[i];
	  }
		 n = k + day + 1;
		 System.out.printf("%d\n",n);
		 return 0;
	}
}

