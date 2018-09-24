package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int year;
		  int month;
		  int day;
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
		  if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		  {
			   switch (month)
			   {
					  case 1:
						  day = day;
						  break;
					  case 2:
						  day = day + 31;
						  break;
					  case 3:
						  day = day + 60;
						  break;
					  case 4:
						  day = day + 91;
						  break;
					  case 5:
						  day = day + 121;
						  break;
					  case 6:
						  day = day + 152;
						  break;
					  case 7:
						  day = day + 182;
						  break;
					  case 8:
						  day = day + 213;
						  break;
					  case 9:
						  day = day + 244;
						  break;
					  case 10:
						  day = day + 274;
						  break;
					  case 11:
						  day = day + 305;
						  break;
					  case 12:
						  day = day + 335;
						  break;
			   }
		  }
		  else
		  {
			  switch (month)
			  {
					  case 1:
						  day = day;
						  break;
					  case 2:
						  day = day + 31;
						  break;
					  case 3:
						  day = day + 59;
						  break;
					  case 4:
						  day = day + 90;
						  break;
					  case 5:
						  day = day + 120;
						  break;
					  case 6:
						  day = day + 151;
						  break;
					  case 7:
						  day = day + 181;
						  break;
					  case 8:
						  day = day + 212;
						  break;
					  case 9:
						  day = day + 243;
						  break;
					  case 10:
						  day = day + 273;
						  break;
					  case 11:
						  day = day + 304;
						  break;
					  case 12:
						  day = day + 334;
						  break;
			  }
		  }
		  System.out.printf("%d",day);
		  System.in.read();
		  System.in.read();
	}

}

