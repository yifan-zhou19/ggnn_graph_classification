package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int day;
		  int month;
		  int year;
		  int sum;
		  int leap;
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
		  switch (month)
		  {
					   case 1:
						   sum = 0;
						   break;
					   case 2:
						   sum = 31;
						   break;
					   case 3:
						   sum = 59;
						   break;
					   case 4:
						   sum = 90;
						   break;
					   case 5:
						   sum = 120;
						   break;
					   case 6:
						   sum = 151;
						   break;
					   case 7:
						   sum = 181;
						   break;
					   case 8:
						   sum = 212;
						   break;
					   case 9:
						   sum = 243;
						   break;
					   case 10:
						   sum = 273;
						   break;
					   case 11:
						   sum = 304;
						   break;
					   case 12:
						   sum = 334;
						   break;
					   default:
						   System.out.print("data error\n");
						   break;
		  }
		  sum = sum + day;
		  if (year % 400 == 0 || (year & 4 == 0 && year % 100 != 0))
		  {
		  leap = 1;
		  }
		  else
		  {
		  leap = 0;
		  }
		  if (leap == 1 && month > 2)
		  {
		  sum = sum + 1;
		  }
		  System.out.printf("%d\n",sum);
		  System.in.read();
		  System.in.read();
	}

}

