package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int nian;
		int yue;
		int ri;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			nian = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			yue = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			ri = Integer.parseInt(tempVar3);
		}
		int d;
		int i;
		int sum = 0;
		int ytian;
		for (i = 1;i < yue;i++)
		{
		   if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
		   {
			  ytian = 31;
		   }
		   if (i == 4 || i == 6 || i == 9 || i == 11)
		   {
			  ytian = 30;
		   }
		   if (i == 2)
		   {
			  if (nian % 400 != 0 && nian % 4 == 0 || nian % 400 == 0)
			  {
				  ytian = 29;
			  }
			  else
			  {
				  ytian = 28;
			  }
		   }
		   sum = sum + ytian;
		}
		sum = sum + ri;
		d = ((nian - 1) + (nian - 1) / 4 - (nian - 1) / 100 + (nian - 1) / 400 + sum) % 7;
		if (d == 1)
		{
			System.out.print("Mon.");
		}
		if (d == 2)
		{
			System.out.print("Tue.");
		}
		if (d == 3)
		{
			System.out.print("Wed.");
		}
		if (d == 4)
		{
			System.out.print("Thu.");
		}
		if (d == 5)
		{
			System.out.print("Fri.");
		}
		if (d == 6)
		{
			System.out.print("Sat.");
		}
		if (d == 0)
		{
			System.out.print("Sun.");
		}
		return 0;
	}


}

