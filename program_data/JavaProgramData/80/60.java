package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 0;
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int i;
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
		String tempVar4 = ConsoleInput.scanfRead("\n");
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

		if (y1 == y2)
		{
			 if (m1 == m2)
			 {
				 n = d2 - d1;
			 }
			 else
			 {
			for (i = m1 + 1;i < m2;i++)
			{
			  if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			  {
				n += 31;
			  }
			  else if (i == 2)
			  {
				if ((y1 % 4 == 0 && y1 % 100 != 0) || y1 % 400 == 0)
				{
				n += 29;
				}
				else
				{
					n += 28;
				}
			  }
			  else
			  {
				  n += 30;
			  }
			}
			for (i = d1 + 1;i <= 30;i++)
			{
				n++;
			}
			for (i = 1;i <= d2;i++)
			{
			   n++;
			}
			 }
		}
		else
		{
		  for (i = y1 + 1;i < y2;i++)
		  {
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
			{
				n += 366;
			}
			else
			{
				n += 365;
			}
		  }
		  for (i = m1 + 1;i <= 12;i++)
		  {
			   if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			   {
				n += 31;
			   }
			else if (i == 2)
			{
				if ((y1 % 4 == 0 && y1 % 100 != 0) || y1 % 400 == 0)
				{
				n += 29;
				}
				else
				{
					n += 28;
				}
			}
			else
			{
				n += 30;
			}
		  }
		  if (m1 == 1 || m1 == 3 || m1 == 5 || m1 == 7 || m1 == 8 || m1 == 10 || m1 == 12)
		  {
			for (i = d1 + 1;i <= 31;i++)
			{
				n++;
			}
		  }
			else if (m1 == 2)
			{
				if ((y1 % 4 == 0 && y1 % 100 != 0) || y1 % 400 == 0)
				{
				for (i = d1 + 1;i <= 29;i++)
				{
				n++;
				}
				}
				else
				{
					for (i = d1 + 1;i <= 28;i++)
					{
				n++;
					}
				}
			}
			else
			{
				for (i = d1 + 1;i <= 30;i++)
				{
				n++;
				}
			}

		  for (i = 1;i < m2;i++)
		  {
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				n += 31;
			}
			else if (i == 2)
			{
				if ((y2 % 4 == 0 && y2 % 100 != 0) || y2 % 400 == 0)
				{
				n += 29;
				}
				else
				{
					n += 28;
				}
			}
			else
			{
				n += 30;
			}
		  }
		  for (i = 1;i <= d2;i++)
		  {
			n++;
		  }
		}
		System.out.printf("%d",n);
	}

}

