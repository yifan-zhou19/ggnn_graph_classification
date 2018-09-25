package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int y1;
	  int m1;
	  int d1;
	  int y2;
	  int m2;
	  int d2;
	  int i;
	  int days;
	  int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
	  days = 0;
	  if (y1 == y2)
	  {
			while ((m1 < m2) || ((m1 == m2) && (d1 < d2)))
			{
				if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
				{
					day[2]++;
				}
				d1++;
				days++;
				if (d1 > day[m1])
				{
					d1 = 0;
					m1++;
				}
			}
	  }
	  else
	  {
		  for (i = y1 + 1;i <= y2 - 1;i++)
		  {
			  if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			  {
				  days += 366;
			  }
			  else
			  {
				  days += 365;
			  }
		  }
		  days += day[m1] - d1;
		  for (i = m1 + 1;i <= 12;i++)
		  {
			  days += day[i];
		  }
		  if ((m1 == 1) && ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0)))
		  {
			  days++;
		  }
		  for (i = 1;i <= m2 - 1;i++)
		  {
			  days += day[i];
		  }
			 if ((m2 > 2) && ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0)))
			 {
				 days++;
			 }
			 days += d2;
	  }
	   System.out.printf("%d",days);
	   return 0;
	}



}

