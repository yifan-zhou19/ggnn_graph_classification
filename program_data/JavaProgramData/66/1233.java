package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int i;
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

		d += (y - 1) + (y - 1) / 4 + (y - 1) / 400 - (y - 1) / 100;
		for (i = 1;i < m;i++)
		{
		if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
		{
		d += 31;
		}
	  if (i == 4 || i == 6 || i == 9 || i == 11)
	  {
		  d += 30;
	  }
		if (i == 2)
		{
				 if (y % 400 == 0 || y % 4 == 0 && y % 100 != 0)
				 {
					 d += 29;
				 }
		else
		{
			d += 28;
		}
		}
		}
						  if (d % 7 == 0)
						  {
									 System.out.print("Sun.");
						  }
			if (d % 7 == 1)
			{
									 System.out.print("Mon.");
			}
	 if (d % 7 == 2)
	 {
									 System.out.print("Tue.");
	 }
	  if (d % 7 == 3)
	  {
									 System.out.print("Wed.");
	  }
	   if (d % 7 == 4)
	   {
									 System.out.print("Thu.");
	   }
		if (d % 7 == 5)
		{
									 System.out.print("Fri.");
		}
		 if (d % 7 == 6)
		 {
									 System.out.print("Sat.");
		 }

	return 0;
	}
}

