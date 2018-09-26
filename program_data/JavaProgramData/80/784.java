package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sy = 0;
		int sm = 0;
		int sd = 0;
		int ey = 0;
		int em = 0;
		int ed = 0;
		int sum1 = 0;
		int sum2 = 0;
		int i = 0;
		int m1 = 0;
		int m2 = 0;
		int c = 0;
		int t = 0;
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
		String tempVar4 = ConsoleInput.scanfRead(" ");
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
		for (i = 1;i < sm;i++)
		{
			switch (i)
			{
			 case 1:
		   case 3:
		   case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				m1 = m1 + 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				m1 = m1 + 30;
				break;
			case 2:
				if ((sy % 4 == 0 && sy % 100 != 0) || (sy % 400 == 0))
				{
						m1 = m1 + 29;
				}
					else
					{
						m1 = m1 + 28;
					}

			}

		}
			t = (sy - 1) / 4 - (sy - 1) / 100 + (sy - 1) / 400;
		sum1 = (sy - 1) * 365 + t + m1 + sd;
		 for (i = 0;i < em;i++)
		 {
			switch (i)
			{
			 case 1:
		   case 3:
		   case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				m2 = m2 + 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				m2 = m2 + 30;
				break;
			case 2:
				if ((ey % 4 == 0 && ey % 100 != 0) || (ey % 400 == 0))
				{
						m2 = m2 + 29;
				}
					else
					{
						m2 = m2 + 28;
					}

			}

		 }
			t = (ey - 1) / 4 - (ey - 1) / 100 + (ey - 1) / 400;
			sum2 = (ey - 1) * 365 + t + m2 + ed;
			c = sum2 - sum1;
			System.out.printf("%d",c);

					return (0);
	}
}

