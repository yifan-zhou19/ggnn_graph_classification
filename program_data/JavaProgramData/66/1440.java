package <missing>;

public class GlobalMembers
{
	public static int runnian(int a)
	{
	  int b;
	  if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0 && a % 3200 != 0))
	  {
	   b = 1;
	  }
	  else
	  {
	   b = 0;
	  }
	  return b;
	}

	public static int rizi(int y,int m,int d)
	{
	   int p;
	   int i;
	   int s = 0;
	   char n;
	   int[] mm = new int[13];
	   mm[1] = 31;
	   mm[2] = 28;
	   mm[3] = 31;
	   mm[4] = 30;
	   mm[5] = 31;
	   mm[6] = 30;
	   mm[7] = 31;
	   mm[8] = 31;
	   mm[9] = 30;
	   mm[10] = 31;
	   mm[11] = 30;
	   mm[12] = 31;
	   p = runnian(y);
	   if (m <= 2)
	   {
		   s = (m - 1) * 31 + d;
	   }
	   else
	   {
		   for (i = 1;i < m;i++)
		   {
			   s = s + mm[i];
		   }
		   s = s + d;
		   if (p == 1)
		   {
			   s++;
		   }
	   }
	   return s;
	}

	public static int Main()
	{
		int y1 = 1;
		int y2;
		int m1 = 1;
		int m2;
		int d1 = 1;
		int d2;
		int i;
		int s = 0;
		int p;
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = y2 % 400;
		if (y2 == 0)
		{
		  y2 = 400;
		}
		s = rizi(y2, m2, d2) - rizi(y1, m1, d1);
		for (i = y1 + 1;i <= y2;i++)
		{
		   s = s + 365;
		   p = runnian(i);
		   if (i != y2)
		   {
			if (p == 1)
			{
			   s++;
			}
		   }
		   s = s % 7;
		}
		switch (s)
		{
			   case 0:
				   System.out.print("Mon.");
				   break;
			   case 1:
				   System.out.print("Tue.");
				   break;
			   case 2:
				   System.out.print("Wed.");
				   break;
			   case 3:
				   System.out.print("Thu.");
				   break;
			   case 4:
				   System.out.print("Fri.");
				   break;
			   case 5:
				   System.out.print("Sat.");
				   break;
			   case 6:
				   System.out.print("Sun.");
				   break;
			   default:
				   System.out.print(s);
		}
		System.out.print("\n");
		return 0;
	}



}

