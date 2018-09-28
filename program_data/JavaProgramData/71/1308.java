package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int year;
		int mon1;
		int mon2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				mon1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				mon2 = Integer.parseInt(tempVar4);
			}
			if ((year % 100 != 0 && year % 4 == 0) || (year % 100 == 0 && year % 400 == 0))
			{
				if (mon1 > mon2)
				{
					int t;
					t = mon1;
					mon1 = mon2;
					mon2 = t;
				}
				int days = 0;
				int j;
				int m;
				m = mon1;
				for (j = 0;j < mon2 - mon1;j++)
				{
					if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10)
					{
						days = days + 31;
					}
					else if (m == 2)
					{
						days = days + 29;
					}
					else
					{
						days = days + 30;
					}
					m = m + 1;
				}
				if (days % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
			else
			{
	if (mon1 > mon2)
	{
					int t;
					t = mon1;
					mon1 = mon2;
					mon2 = t;
	}
				int days = 0;
				int j;
				int m;
				m = mon1;
				for (j = 0;j < mon2 - mon1;j++)
				{
					if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10)
					{
						days = days + 31;
					}
					else if (m == 2)
					{
						days = days + 28;
					}
					else
					{
						days = days + 30;
					}
					m = m + 1;
				}
				if (days % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
		}
			return 0;
	}




}

