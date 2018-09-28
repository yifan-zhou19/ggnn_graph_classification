package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int year;
		int m1;
		int m2;
		int i;
		int[] a = new int[13];
		int date;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			date = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) == 1)
			{
				a[1] = 31;
				a[2] = 29;
				a[3] = 31;
				a[4] = 30;
				a[5] = 31;
				a[6] = 30;
				a[7] = 31;
				a[8] = 31;
				a[9] = 30;
				a[10] = 31;
				a[11] = 30;
				a[12] = 31;


				if (m1 > m2)
				{
					for (;m2 < m1;m2++)
					{
						date = date + a[m2];
					}
				if (date % 7 == 0)
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
					for (;m1 < m2;m1++)
					{
						date = date + a[m1];
					}
				if (date % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
				}
			}
			else
			{
				a[1] = 31;
				a[2] = 28;
				a[3] = 31;
				a[4] = 30;
				a[5] = 31;
				a[6] = 30;
				a[7] = 31;
				a[8] = 31;
				a[9] = 30;
				a[10] = 31;
				a[11] = 30;
				a[12] = 31;


				if (m1 > m2)
				{
					for (;m2 < m1;m2++)
					{
						date = date + a[m2];
					}
				if (date % 7 == 0)
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
					for (;m1 < m2;m1++)
					{
						date = date + a[m1];
					}
				if (date % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
				}
			}
		}








	}






}

