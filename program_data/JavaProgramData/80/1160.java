package <missing>;

public class GlobalMembers
{
	public static int rr(int year)
	{
	  if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	  {
			  return 1;
	  }
			  else
			  {
				  return 0;
			  }
	}
	public static int Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int p = 0;
		int x = 0;
		int y = 0;
		int a = 0;
		int b = 0;
		int i;
		int[] aa = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = y1 + 1;i < y2;i++)
		{
		  p = p + 365 + rr(i);
		}
		for (x = 1;x < m1;x++)
		{
			 if (x == 2)
			 {
		   a = a + aa[x] + rr(y1);
			 }
		   else
		   {
			   a = a + aa[x];
		   }
		}
		  a = a + d1;
		for (x = 1;x < m2;x++)
		{
			 if (x == 2)
			 {
		   b = b + aa[x] + rr(y2);
			 }
		   else
		   {
			   b = b + aa[x];
		   }
		}
		  b = b + d2;
		  System.out.print((365 + rr(y1)) * (y1 != y2) + p + b - a);
			 return 0;
	}


}

