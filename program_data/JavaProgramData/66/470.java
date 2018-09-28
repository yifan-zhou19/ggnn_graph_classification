package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int y;
	   int m;
	   int d;
	   int i;
	   int k = 0;
	   int Day;
	   int sum;
	   int sum1;
	   int sum2 = 0;

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   y = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   d = Integer.parseInt(tempVar3);
	   }
		sum1 = (y - 1) + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;
			   for (i = 1;i < m;i++)
			   {
			  if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			  {
				  sum2 += 31;
			  }
				else if (i == 4 || i == 6 || i == 9 || i == 11)
				{
						sum2 += 30;
				}
			  else
			  {
				  if ((y % 100 == 0 && y % 400 == 0) || (y % 100 != 0 && y % 4 == 0))
				  {
					  sum2 += 29;
				  }
					else
					{
					   sum2 += 28;
					}
			  }
			   }
			sum2 += d;
			sum = sum1 + sum2;
			Day = sum % 7;
		switch (Day)
		{
			case 0:
				System.out.print("Sun.");
				break;
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
		   default:
			   System.out.print("Sat.");
		}
	   return 0;
	}

}

