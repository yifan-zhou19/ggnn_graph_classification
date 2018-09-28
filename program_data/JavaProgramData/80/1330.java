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
		int n1 = 0;
		int n2;
		int n3;
		int num;
		int ly = 0;
		int i;
		int a = 0;
		int b = 0;

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
		String tempVar4 = ConsoleInput.scanfRead("\n");
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
		if (y2 - y1 > 0)
		{
			for (i = y1;i < y2;i++)
			{
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
				{
					ly++;
				}
				n1 = (y2 - y1) * 365 + ly;
			}
		}


		if (m1 > 1)
		{
			for (i = 1;i < m1;i++)
			{
				if (i == 2)
				{
					if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
					{
						a += 29;
					}
					else
					{
						a += 28;
					}
				}
				else if (i == 4 || i == 6 || i == 9 || i == 11)
				{
					a += 30;
				}
				else
				{
					a += 31;
				}
			}
		}
		// a?m1????
		if (m2 > 1)
		{
			for (i = 1;i < m2;i++)
			{
				if (i == 2)
				{
					if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
					{
						b += 29;
					}
					else
					{
						b += 28;
					}
				}
				else if (i == 4 || i == 6 || i == 9 || i == 11)
				{
					b += 30;
				}
				else
				{
					b += 31;
				}
			}
		}

		n2 = b - a;

		n3 = d2 - d1;

		num = n1 + n2 + n3;

		System.out.printf("%d\n", num);

		return 0;
	}

}

