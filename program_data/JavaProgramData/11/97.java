package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int year;
	   int month;
	   int day;
	   int i;
	   int a = 0;
	   int b = 0;
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
	   int[] N1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	   int[] N2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	   if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	   {
		   if (day < 1 || day> N2[month])
		   {
			   System.out.print("wrong\n");
			   return -1;
		   }
		  else
		  {
			  for (i = 1;i <= month;i++)
			  {
			  a += N2[i];
			  }
		  b = a - day;
		  }
	   }
	  else
	  {
		  if (day < 1 || day> N1[month])
		  {
			   System.out.print("wrong\n");
			   return -1;
		  }
		  else
		  {
		  for (i = 1;i <= month;i++)
		  {
			  a += N1[i];
		  }
		  b = a - day;
		  }
	  }
		  System.out.printf("%d\n",b);
		  return 0;
	}



}

