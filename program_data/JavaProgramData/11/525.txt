package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int year;
	  int month;
	  int date;
	  int i = 1;
	  int sum = 0;
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
		  date = Integer.parseInt(tempVar3);
	  }


	  for (i = 1;i <= month - 1;i++)
	  {
		  if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
		  {
			sum += 31;
		  }

		  else if (i == 2)
		  {
			 if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			 {
				 sum += 29;
			 }
			 else
			 {
				 sum += 28;
			 }
		  }
		 else
		 {
			 sum += 30;
		 }

	  }

	   sum += date;
		  System.out.printf("%d",sum);

	  return 0;
	}

}

