package <missing>;

public class GlobalMembers
{
	public static int isRunNian(int year)
	{
		int result;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		  return result;
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] year = new int[200];
		int[] month1 = new int[200];
		int[] month2 = new int[200];
		int[] chaju = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int i;
		int e;
		int k;
		for (i = 0;i < n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 year[i] = Integer.parseInt(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 month1[i] = Integer.parseInt(tempVar3);
						 }
						 String tempVar4 = ConsoleInput.scanfRead();
						 if (tempVar4 != null)
						 {
							 month2[i] = Integer.parseInt(tempVar4);
						 }
						 if (month1[i] > month2[i])
						 {
												 e = month1[i];
												 month1[i] = month2[i];
												 month2[i] = e;
						 }

						 if (isRunNian(year[i]) != 0)
						 {
										  for (k = month1[i];k < month2[i];k++)
										  {
																		   if (k == 1 || k == 3 || k == 5 || k == 7 || k == 8 || k == 10 || k == 12)
																		   {
																														  chaju[i] += 31;
																		   }
																		   else if (k == 2)
																		   {
																					chaju[i] += 29;
																		   }
																		   else if (k == 4 || k == 6 || k == 9 || k == 11)
																		   {
																									   chaju[i] += 30;
																		   }
										  }
						 }
																									   else
																									   {
										   for (k = month1[i];k < month2[i];k++)
										   {
																		   if (k == 1 || k == 3 || k == 5 || k == 7 || k == 8 || k == 10 || k == 12)
																		   {
																														  chaju[i] += 31;
																		   }
																		   else if (k == 2)
																		   {
																					chaju[i] += 28;
																		   }
																		   else if (k == 4 || k == 6 || k == 9 || k == 11)
																		   {
																									   chaju[i] += 30;
																		   }
										   }
																									   }
						 if (chaju[i] % 7 == 0)
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

