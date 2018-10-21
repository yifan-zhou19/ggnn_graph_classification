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
		int days = 0;
		int i;
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
		if (y1 < y2)
		{
		for (i = y1 + 1;i < y2;i++)
		{
							 if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
							 {
							 days = days + 366;
							 }
							 else
							 {
							 days = days + 365;
							 }
		}
		for (i = m1 + 1;i < 13;i++)
		{
							 if (i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
							 {
							 days = days + 31;
							 }
							 else if (i == 4 || i == 6 || i == 9 || i == 11)
							 {
							 days = days + 30;
							 }
							 else if ((y1 % 4 == 0 && y1 % 100 != 0) || y1 % 400 == 0)
							 {
							 days = days + 29;
							 }
							 else
							 {
							 days = days + 28;
							 }
		}
		for (i = 1;i < m2;i++)
		{
						  if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
						  {
						  days = days + 31;
						  }
						  else if (i == 4 || i == 6 || i == 9 || i == 11)
						  {
						  days = days + 30;
						  }
						  else if ((y2 % 4 == 0 && y2 % 100 != 0) || y2 % 400 == 0)
						  {
						  days = days + 29;
						  }
						  else
						  {
						  days = days + 28;
						  }
		}
		if (m1 == 1 || m1 == 3 || m1 == 5 || m1 == 7 || m1 == 8 || m1 == 10 || m1 == 12)
		{
		days = days + 31 - d1;
		}
		else if (m1 == 4 || m1 == 6 || m1 == 9 || m1 == 11)
		{
		days = days + 30 - d1;
		}
		else if ((y1 % 4 == 0 && y1 % 100 != 0) || y1 % 400 == 0)
		{
		days = days + 29 - d1;
		}
		else
		{
		days = days + 28 - d1;
		}
		days = days + d2;
		}
		else if (m1 < m2)
		{
					   for (i = m1 + 1;i < m2;i++)
					   {
											 if (i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
											 {
											 days = days + 31;
											 }
											 else if (i == 4 || i == 6 || i == 9 || i == 11)
											 {
											 days = days + 30;
											 }
											 else if ((y1 % 4 == 0 && y1 % 100 != 0) || y1 % 400 == 0)
											 {
											 days = days + 29;
											 }
											 else
											 {
											 days = days + 28;
											 }
					   }
					   if (m1 == 1 || m1 == 3 || m1 == 5 || m1 == 7 || m1 == 8 || m1 == 10 || m1 == 12)
					   {
					   days = days + 31 - d1;
					   }
					   else if (m1 == 4 || m1 == 6 || m1 == 9 || m1 == 11)
					   {
					   days = days + 30 - d1;
					   }
					   else if ((y1 % 4 == 0 && y1 % 100 != 0) || y1 % 400 == 0)
					   {
					   days = days + 29 - d1;
					   }
					   else
					   {
					   days = days + 28 - d1;
					   }
					   days = days + d2;
		}
		else
		{
		days = d2 - d1;
		}
		System.out.printf("%d",days);
		return 0;
	}


}

