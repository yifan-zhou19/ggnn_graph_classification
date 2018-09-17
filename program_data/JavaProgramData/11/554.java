package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}
		if (y % 4 == 0 && y % 100 != 0)
		{
			if (m == 1)
			{
				n = d;
			}
			else if (m == 2)
			{
					n = 31 + d;
			}
			else if (m <= 8)
			{
				n = (m - 1) * 30 - 1 + m / 2 + d;

			}
			else
			{
			 if (m % 2 == 0)
			 {
				n = (m - 1) * 30 - 1 + m / 2 + d;
			 }
			   else
			   {
				   n = (m - 1) * 30 + m / 2 + d;
			   }
			}
		}
		if (y % 400 == 0)
		{
		   if (m == 1)
		   {
				n = d;
		   }
		   else if (m == 2)
		   {
					   n = 31 + d;
		   }
		   else if (m <= 8)
		   {
				n = (m - 1) * 30 - 1 + m / 2 + d;

		   }
		   else
		   {
			 if (m % 2 == 0)
			 {
				n = (m - 1) * 30 - 1 + m / 2 + d;
			 }
			   else
			   {
				   n = (m - 1) * 30 + m / 2 + d;
			   }
		   }
		}
		else
		{

		   if (m == 1)
		   {
				n = d;
		   }
		   else if (m == 2)
		   {
					   n = 31 + d;
		   }
		   else if (m <= 8)
		   {
				n = (m - 1) * 30 - 2 + m / 2 + d;

		   }
		   else
		   {
			   if (m % 2 == 0)
			   {
				n = (m - 1) * 30 - 2 + m / 2 + d;
			   }
			   else
			   {
				   n = (m - 1) * 30 - 1 + m / 2 + d;
			   }
		   }
		}
		System.out.printf("%d",n);
		return 0;
	}


}

