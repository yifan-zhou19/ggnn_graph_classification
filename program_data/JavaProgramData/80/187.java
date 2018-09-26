package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		int i;
		int sum = 0;
		int a = 0;
		int[] day = {0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sy = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			sm = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			sd = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			ey = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			em = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			ed = Integer.parseInt(tempVar6);
		}
		for (i = sy + 1;i <= ey - 1;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
		}
		if ((ey % 4 == 0 && ey % 100 != 0) || (ey % 400 == 0))
		{
			for (i = 1;i < em;i++)
			{
				if (i == 2)
				{
					sum += 29;
				}
				else
				{
					sum += day[i];
				}
			}
		}
		else
		{
			for (i = 1;i < em;i++)
			{
				if (i == 2)
				{
					sum += 28;
				}
				else
				{
					sum += day[i];
				}
			}
		}
		if (ey != sy)
		{
			if ((sy % 4 == 0 && sy % 100 != 0) || (sy % 400 == 0))
			{
			   for (i = 1;i < sm;i++)
			   {
				  if (i == 2)
				  {
					  a += 29;
				  }
				  else
				  {
					  a += day[i];
				  }
			   }
				sum = sum + 366 - (a + sd);
			}
		   else
		   {
			   for (i = 1;i < sm;i++)
			   {
				  if (i == 2)
				  {
					  a += 28;
				  }
				  else
				  {
					  a += day[i];
				  }
			   }
			   sum = sum + 365 - (a + sd);
		   }
		}
		else
		{
			if ((sy % 4 == 0 && sy % 100 != 0) || (sy % 400 == 0))
			{
			   for (i = 1;i < sm;i++)
			   {
				  if (i == 2)
				  {
					  a += 29;
				  }
				  else
				  {
					  a += day[i];
				  }
			   }
				sum = sum - (a + sd);
			}
		   else
		   {
			   for (i = 1;i < sm;i++)
			   {
				  if (i == 2)
				  {
					  a += 28;
				  }
				  else
				  {
					  a += day[i];
				  }
			   }
			   sum = sum - (a + sd);
		   }
		}
		sum += ed;
		System.out.printf("%d\n",sum);
		return 0;
	}


}

