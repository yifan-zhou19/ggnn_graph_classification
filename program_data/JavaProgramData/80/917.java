package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n1;
		int y1;
		int r1;
		int n2;
		int y2;
		int r2;
		int i;
		int d0;
		int d1;
		int d2;
		int d3;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			r1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			n2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			y2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			r2 = Integer.parseInt(tempVar6);
		}
		for (i = n1,d0 = 0;i < n2;i++)
		{
		   if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
		   {
			   d0 = d0 + 366;
		   }
		   else
		   {
			   d0 = d0 + 365;
		   }
		}
		d1 = (y1 - 1) * 30;
		{
			if (y1 == 1 || y1 == 3)
			{
				d1 = d1;
			}
			else
			{
			if (y1 == 2 || y1 == 4 || y1 == 5)
			{
				d1 = d1 + 1;
			}
			else
			{
				if (y1 == 6 || y1 == 7)
				{
					d1 = d1 + 2;
				}
				else
				{
					if (y1 == 8)
					{
						d1 = d1 + 3;
					}
					else
					{
						if (y1 == 9 || y1 == 10)
						{
							d1 = d1 + 4;
						}
						else
						{
							d1 = d1 + 5;
						}
					}
				}
			}
			}
		}
		{
		if ((n1 % 4 == 0 && n1 % 100 != 0) || n1 % 400 == 0)
		{
			d1 = d1;
		}
		else
		{
			if (y1 > 2)
			{
				d1 = d1 - 1;
			}
		}
	}
		d2 = (y2 - 1) * 30;
		{
			if (y2 == 1 || y2 == 3)
			{
				d2 = d2;
			}
			else
			{
			if (y2 == 2 || y2 == 4 || y2 == 5)
			{
				d2 = d2 + 1;
			}
			else
			{
				if (y2 == 6 || y2 == 7)
				{
					d2 = d2 + 2;
				}
				else
				{
					if (y2 == 8)
					{
						d2 = d2 + 3;
					}
					else
					{
						if (y2 == 9 || y2 == 10)
						{
							d2 = d2 + 4;
						}
						else
						{
							d2 = d2 + 5;
						}
					}
				}
			}
			}
		}
		{
		if ((n2 % 4 == 0 && n2 % 100 != 0) || n2 % 400 == 0)
		{
		d2 = d2;
		}
		else
		{
			if (y2 > 2)
			{
				d2 = d2 - 1;
			}
		}
	}
		d3 = r2 - r1;
		d = d0 - d1 + d2 + d3;
		System.out.printf("%d\n",d);
		return 0;
	}

}

