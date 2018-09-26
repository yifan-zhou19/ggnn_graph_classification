package <missing>;

public class GlobalMembers
{
	public static int isRunnian(int year)
	{
		int result;
		result = 0;
		if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
		{
		result = 1;
		}
		return result;
	}
	public static int Dijitian(int year, int month, int day)
	{
		int i;
		int f;
		f = 0;
		for (i = 1;i < month;i++)
		{
							 if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
							 {
																			 f += 3;
							 }
																			else if (i == 4 || i == 6 || i == 9 || i == 11)
																			{
																				  f += 2;
																			}
																				  else if (i == 2 && isRunnian(year) != 0)
																				  {
																						  f += 1;
																				  }
																						else
																						{
																							 f += 0;
																						}
		}
																							 f += day;
																							 return f;
	}
	public static int Main()
	{
		 int year;
		 int month;
		 int day;
		 int i;
		 int s;
		 int sum;
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
		 s = (year - 1) % 400 + 1;
		 sum = 0;
		for (i = 1;i < s;i++)
		{
						  if (isRunnian(i) != 0)
						  {
						  sum += 2;
						  }
						  else
						  {
						  sum++;
						  }
		}
						  sum += Dijitian(s, month, day);
						  switch (sum % 7)
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

