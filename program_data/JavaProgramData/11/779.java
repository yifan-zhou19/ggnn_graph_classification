package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int year;
		  int month;
		  int day;
		  int sum;
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
		  if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0))
		  {
						switch (month)
						{
						 case 1:
							 sum = day;
							 break;
						 case 2:
							 sum = 31 + day;
							 break;
						 case 3:
							 sum = 31 + 29 + day;
							 break;
						 case 4:
							 sum = 31 + 29 + 31 + day;
							 break;
						 case 5:
							 sum = 31 + 29 + 31 + 30 + day;
							 break;
						 case 6:
							 sum = 31 + 29 + 31 + 30 + 31 + day;
							 break;
						 case 7:
							 sum = 31 + 29 + 31 + 30 + 31 + 30 + day;
							 break;
						 case 8:
							 sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + day;
							 break;
						 case 9:
							 sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + day;
							 break;
						 case 10:
							 sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
							 break;
						 case 11:
							 sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
							 break;
						 case 12:
							 sum = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
							 break;
						}
		  }
		   else
		   {
				   switch (month)
				   {
						 case 1:
							 sum = day;
							 break;
						 case 2:
							 sum = 31 + day;
							 break;
						 case 3:
							 sum = 31 + 28 + day;
							 break;
						 case 4:
							 sum = 31 + 28 + 31 + day;
							 break;
						 case 5:
							 sum = 31 + 28 + 31 + 30 + day;
							 break;
						 case 6:
							 sum = 31 + 28 + 31 + 30 + 31 + day;
							 break;
						 case 7:
							 sum = 31 + 28 + 31 + 30 + 31 + 30 + day;
							 break;
						 case 8:
							 sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
							 break;
						 case 9:
							 sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
							 break;
						 case 10:
							 sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
							 break;
						 case 11:
							 sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
							 break;
						 case 12:
							 sum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
							 break;
				   }
		   }
					System.out.printf("%d",sum);
					System.in.read();
					System.in.read();
	}

}

