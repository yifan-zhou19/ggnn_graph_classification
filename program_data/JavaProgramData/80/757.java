package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] Days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int y1;
		int y2;
		int m1;
		int m2;
		int d1 = 0;
		int d2 = 0;
		int e;
		int f;
		int i;
		int s = 0;
		int g;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			d2 = Integer.parseInt(tempVar6);
		}
		g = y1,h = y2;

		if ((y1 % 4 == 0) && (y1 % 100 != 0) || (y1 % 400 == 0))
		{
			days[2]++;
		}
		if ((y2 % 4 == 0) && (y2 % 100 != 0) || (y2 % 400 == 0))
		{
			Days[2]++;
		}
		e = d1;
		for (i = 1;i < m1;i++)
		{
			e = e + days[i];
		}
		f = d2;
		for (i = 1;i < m2;i++)
		{
			f = f + Days[i];
		}
		if (y2 - y1 >= 2)
		{
			while (h - g > 1)
			{
			g++;
		 if ((g % 4 == 0) && (g % 100 != 0) || (g % 400 == 0))
		 {
			 s = s + 366;
		 }
		 else
		 {
			 s = s + 365;
		 }
			}
		s = s + f;
	   if ((y1 % 4 == 0) && (y1 % 100 != 0) || (y1 % 400 == 0))
	   {
		   s = s + 366 - e;
	   }
	   else
	   {
		   s = s + 365 - e;
	   }
		}
		else if (y2 == y1)
		{
			s = f - e;
		}
		else if (y2 - y1 == 1)
		{
		  if ((y1 % 4 == 0) && (y1 % 100 != 0) || (y1 % 400 == 0))
		  {
			  s = f + 366 - e;
		  }
		  else
		  {
			  s = f + 365 - e;
		  }
		}
	   System.out.printf("%d",s);
	   return 0;
	}
}

