package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int year;
	 int month;
	 int day;
	 int i;
	 int s;
	 int k;
	 int total;
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
	  i = 0;
	  do
	  {
		s = 400 * i;
		i = i + 1;
	  } while (s < year);
		s = s - 400 + 1;
	 for (i = 0,k = s;k <= year - 1;k++)
	 {
		if ((k % 4 == 0 && k % 100 != 0) || (k % 400 == 0))
		{
		 i = i + 1;
		}
	 }
		 s = 365 * (year - s) + i;
		 total = 0;
		for (i = 1;i < month;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				total += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				total += 30;
			}
			else if (i == 2)
			{
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				{
					total += 29;
				}
				else
				{
					total += 28;
				}
			}
		}
		  s = s + total + day;
		  s = s % 7;
		  switch (s)
		  {
			case 1:
				 System.out.print("Mon.");
				 break;
		   case 2:
				System.out.print("Tue.");
				break;
		  case 3:
			   System.out.print("Wed.");
			   break;
		  case 4:
			   System.out.print("Thu.");
			   break;
		  case 5:
				System.out.print("Fri.");
				break;
		  case 6:
			   System.out.print("Sat.");
			   break;
		 case 0:
			 System.out.print("Sun.");
			 break;
		  }
	 return 0;
	}
}

