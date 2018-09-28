package <missing>;

public class GlobalMembers
{
	public static int sum;
	public static int Main()
	{
		int m;
		int b;
		int c;
		int i;
		int j;
		sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
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
		if (b != 1)
		{
		   for (j = 1;j < b;j++)
		   {
			   if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
			   {
				   sum += 31;
			   }
			   else if (j == 2)
			   {
				   if ((m % 4 == 0 && m % 100 != 0) || m % 400 == 0)
				   {
					   sum += 29;
				   }
				   else
				   {
					   sum += 28;
				   }
			   }
			   else if (j == 4 || j == 6 || j == 9 || j == 11)
			   {
				   sum += 30;
			   }
		   }
		   sum += c;
		}
		else
		{
			sum += c;
		}
		sum += (m - 1) + (m - 1) / 4 - (m - 1) / 100 + (m - 1) / 400;
		if (sum % 7 == 1)
		{
			System.out.print("Mon.");
		}
		if (sum % 7 == 2)
		{
			System.out.print("Tue.");
		}
		if (sum % 7 == 3)
		{
			System.out.print("Wed.");
		}
		if (sum % 7 == 4)
		{
			System.out.print("Thu.");
		}
		if (sum % 7 == 5)
		{
			System.out.print("Fri.");
		}
		if (sum % 7 == 6)
		{
			System.out.print("Sat.");
		}
		if (sum % 7 == 0)
		{
			System.out.print("Sun.");
		}
		   return 0;
	}


}

