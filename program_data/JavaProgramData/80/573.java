package <missing>;

public class GlobalMembers
{
	public static int findday(int y,int m,int d)
	{
	 int leap;
	 int day;
	 if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
	 {
		 leap = 1;
	 }
	 else
	 {
		 leap = 0;
	 }
	 day = d;
	 switch (m - 1)
	 {
	  case 11:
		  day += 30;
	  case 10:
		  day += 31;
	  case 9:
		  day += 30;
	  case 8:
		  day += 31;
	  case 7:
		  day += 31;
	  case 6:
		  day += 30;
	  case 5:
		  day += 31;
	  case 4:
		  day += 30;
	  case 3:
		  day += 31;
	  case 2:
	  if (leap == 1)
	  {
		  day += 29;
	  }
	  else
	  {
		  day += 28;
	  }
	  case 1:
		  day += 31;
	 }
	 return day;
	}

	public static int Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int i;
		int p0;
		int p1;
		int c = 0;
		int p2;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			d2 = Integer.parseInt(tempVar6);
		}
		if (y1 == y2)
		{
			s = findday(y2, m2, d2) - findday(y1, m1, d1);
		}
		else
		{
		if (y1 % 4 == 0)
		{
		p0 = 366 - findday(y1, m1, d1);
		}
		else
		{
		p0 = 365 - findday(y1, m1, d1);
		}


		for (i = y1 + 1;i < y2;i++)
		{
		if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
		{
		c += 1;
		}
		}
		p1 = (y2 - y1 - 1) * 365 + c;


		p2 = findday(y2, m2, d2);
		s = p0 + p1 + p2;
		}
		System.out.printf("%u",s);
	}
}

