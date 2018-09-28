package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   int a;
		   int b;
		   int c;
		   int i;
		   int sum;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a = Integer.parseInt(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   b = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   c = Integer.parseInt(tempVar3);
		   }
		   sum = (a - 1) * (365 % 7);
		   sum += (a - 1) / 4 - (a - 1) / 100 + (a - 1) / 400;
		   for (i = 1;i < b;i++)
		   {
				   if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
				   {
						   sum += 31;
				   }
				   else if (i == 4 || i == 6 || i == 9 || i == 11)
				   {
						   sum += 30;
				   }
				   else if (i = 2)
				   {
						   if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
						   {
								   sum += 29;
						   }
						   else
						   {
								   sum += 28;
						   }
				   }
		   }
		   for (i = 1;i <= c;i++)
		   {
				   sum++;
		   }
		   if (sum % 7 == 0)
		   {
			   System.out.print("Sun.");
		   }
		   else if (sum % 7 == 1)
		   {
			   System.out.print("Mon.");
		   }
		   else if (sum % 7 == 2)
		   {
			   System.out.print("Tue.");
		   }
		   else if (sum % 7 == 3)
		   {
			   System.out.print("Wed.");
		   }
		   else if (sum % 7 == 4)
		   {
			   System.out.print("Thu.");
		   }
		   else if (sum % 7 == 5)
		   {
			   System.out.print("Fri.");
		   }
		   else if (sum % 7 == 6)
		   {
			   System.out.print("Sat.");
		   }
		   return 0;
	}
}

