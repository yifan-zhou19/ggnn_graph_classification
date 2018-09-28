package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int year;
	   int month1;
	   int month2;
	   int n;
	   int i;
	   int total1;
	   int total2;
	   int j;
	   int a;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (j = 0;j < n;j++)
	   {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 year = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 month1 = Integer.parseInt(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 month2 = Integer.parseInt(tempVar4);
		 }
		 total1 = 0;
		 for (i = 1;i < month1;i++)
		 {
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
		 total1 += 31;
			}
		   else if (i == 4 || i == 6 || i == 9 || i == 11)
		   {
		total1 += 30;
		   }
		  else if (i == 2)
		  {
			  if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			  {
			total1 += 29;

			  }
			 else
			 {
				 total1 += 28;
			 }
		  }
		 }
		  total1 += 1;
		 total2 = 0;
		 for (i = 1;i < month2;i++)
		 {
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
		 total2 += 31;
			}
		   else if (i == 4 || i == 6 || i == 9 || i == 11)
		   {
		total2 += 30;
		   }
		  else if (i == 2)
		  {
			  if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			  {
			total2 += 29;

			  }
			 else
			 {
				 total2 += 28;
			 }
		  }
		 }
		  total2 += 1;
		  a = total2 - total1;
		  if (a % 7 == 0)
		  {
			System.out.print("YES\n");
		  }
		 else
		 {
			System.out.print("NO\n");
		 }
	   }
	  return 0;
	}



}

