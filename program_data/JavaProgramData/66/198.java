package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int year;
		  int month;
		  int day;
		  int i;
		  int count = 0;
		  int x = 0;
		  int y;
		  int[] mday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
		  x = year % 7 + year / 4 - year / 100 + year / 400;

		  for (i = 1;i < month;i++)
		  {
			  x = x + mday[i - 1];
		  }
		  x = x + day - 1;

		  if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && (month <= 2))
		  {
			  x = x - 1;
		  }
		  y = x % 7;
		  switch (y)
		  {
		  case 1:
			  System.out.print("Mon.\n");
			  break;
			  case 2:
				  System.out.print("Tue.\n");
				  break;
				  case 3:
					  System.out.print("Wed.\n");
					  break;
					  case 4:
						  System.out.print("Thu.\n");
						  break;
						  case 5:
							  System.out.print("Fri.\n");
							  break;
							  case 6:
								  System.out.print("Sat.\n");
								  break;
								  case 0:
									  System.out.print("Sun.\n");
									  break;

		  }

	   return 0;
	}
}

