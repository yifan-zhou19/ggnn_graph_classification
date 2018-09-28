package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int t = 0;
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int t1 = 0;
		int t2 = 0;
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
		for (i = y1;i < y2;i++)
		{
			for (j = 1;j < 13;j++)
			{
				if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
				{
					t = t + 31;
				}
				else if (j == 4 || j == 6 || j == 9 || j == 11)
				{
					t = t + 30;
				}
				else if (j == 2)
				{
					if (i % 400 == 0 || i % 4 == 0 && i % 100 != 0)
					{
						t = t + 29;
					}
					else
					{
						t = t + 28;
					}
				}
			}
		}
		for (j = 1;j < m1;j++)
		{
			if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
			{
					t1 = t1 + 31;
			}
				else if (j == 4 || j == 6 || j == 9 || j == 11)
				{
					t1 = t1 + 30;
				}
				else if (j == 2)
				{
					if (y1 % 400 == 0 || y1 % 4 == 0 && y1 % 100 != 0)
					{
						t1 = t1 + 29;
					}
					else
					{
						t1 = t1 + 28;
					}
				}
		}
		t1 = t1 + d1;
		for (j = 1;j < m2;j++)
		{
				 if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
				 {
					t2 = t2 + 31;
				 }
				else if (j == 4 || j == 6 || j == 9 || j == 11)
				{
					t2 = t2 + 30;
				}
				else if (j == 2)
				{
					if (y2 % 400 == 0 || y2 % 4 == 0 && y2 % 100 != 0)
					{
						t2 = t2 + 29;
					}
					else
					{
						t2 = t2 + 28;
					}
				}
		}
		t2 = t2 + d2;
		t = t - t1 + t2;
		System.out.printf("%d\n",t);
	}




}

