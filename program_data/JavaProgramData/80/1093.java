package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int y1;
		  int y2;
		  int m1;
		  int m2;
		  int d1;
		  int d2;
		  int i;
		  int j;
		  int k;
		  int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		  int s1;
		  int s2;
		  int r;
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
		  r = (y2 - y1) / 4 - (y2 - y1) / 100 + (y2 - y1) / 400;
		  s1 = 365 * (y2 - y1) + r;
		  if (m2 > m1 || (m2 == m1 && d2 >= d1))
		  {
				   for (i = m1 - 1;i < m2 - 1;i++)
				   {
									   s1 = s1 + day[i];
				   }
				   s1 = s1 - d1 + d2;
				   if (((y1 % 4 == 0 && y1 % 100 != 0) || y1 % 400 == 0) && m1 <= 2)
				   {
					   s1++;
				   }
				   if ((y2 % 4 == 0 && y2 % 100 != 0) || y2 % 400 == 0)
				   {
							   if (m2 > 2)
							   {
								s1++;
							   }
				   }
		  }
		  else
		  {
				   for (i = m2 - 1;i <= m1 - 1;i++)
				   {
									   s1 = s1 - day[i];
				   }
				   s1 = s1 + d1 - d2 - 1;
				   if (((y1 % 4 == 0 && y1 % 100 != 0) || y1 % 400 == 0) && m1 <= 2)
				   {
					   s1++;
				   }
				   if ((y2 % 4 == 0 && y2 % 100 != 0) || y2 % 400 == 0)
				   {
							   if (m2 > 2)
							   {
								s1++;
							   }
				   }
		  }
		  System.out.printf("%d",s1);
	}
}

