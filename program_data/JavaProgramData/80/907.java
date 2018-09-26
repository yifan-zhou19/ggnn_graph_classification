package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] year = new int[2];
		int[] month = new int[2];
		int[] day = new int[2];
		int i;
		int s = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month[0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day[0] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			year[1] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			month[1] = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			day[1] = Integer.parseInt(tempVar6);
		}
		if (year[1] - year[0] != 0)
		{
			for (i = year[0];i <= year[1];i++)
			{
			if (i == year[0])
			{
				for (j = month[0];j <= 12;j++)
				{
					if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
					{
						s = s + 31;
					}
					else if (j == 2)
					{
						if ((i % 4 == 0 & i % 100 != 0) || i % 400 == 0)
						{
						s = s + 29;
						}
						else
						{
						s = s + 28;
						}
					}
					else
					{
						s = s + 30;
					}
				}
			}
			if (i > year[0] && i < year[1])
			{
				if ((i % 4 == 0 & i % 100 != 0) || i % 400 == 0)
				{
				s = s + 366;
				}
				else
				{
				s = s + 365;
				}
			}
			if (i == year[1])
			{
				for (j = 1;j < month[1];j++)
				{
					if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
					{
						s = s + 31;
					}
					else if (j == 2)
					{
						if ((i % 4 == 0 & i % 100 != 0) || i % 400 == 0)
						{
						s = s + 29;
						}
						else
						{
						s = s + 28;
						}
					}
					else
					{
						s = s + 30;
					}
				}
			}
			}
		}
		else
		{
			for (j = month[0];j < month[1];j++)
			{
				if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
				{
						s = s + 31;
				}
					else if (j == 2)
					{
						if ((year[0] % 4 == 0 & i % 100 != 0) || year[0] % 400 == 0)
						{
						s = s + 29;
						}
						else
						{
						s = s + 28;
						}
					}
					else
					{
						s = s + 30;
					}
			}
		}
		s = s - day[0] + day[1];
		System.out.printf("%d",s);
		return 0;
	}
}

