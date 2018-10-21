package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] y = new int[200];
		int[] m1 = new int[200];
		int[] m2 = new int[200];
		int i;
		int j;
		int k;
		int[] day1 = new int[200];
		int[] day2 = new int[200];
		int[] cha = new int[200];
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
				y[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			day1[i] = 1;
			day2[i] = 1;
			if ((y[i] % 4 == 0 && y[i] % 100 != 0) || (y[i] % 400 == 0))
			{
				for (j = 1;j < m1[i];j++)
				{
					if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10)
					{
						day1[i] = day1[i] + 31;
					}
					else if (j == 4 || j == 6 || j == 9 || j == 11)
					{
						day1[i] = day1[i] + 30;
					}
					else if (j == 2)
					{
						day1[i] = day1[i] + 29;
					}
				}
				for (j = 1;j < m2[i];j++)
				{
					if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10)
					{
						day2[i] = day2[i] + 31;
					}
					else if (j == 4 || j == 6 || j == 9 || j == 11)
					{
						day2[i] = day2[i] + 30;
					}
					else if (j == 2)
					{
						day2[i] = day2[i] + 29;
					}
				}
			}
			else
			{
				for (j = 1;j < m1[i];j++)
				{
					if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10)
					{
						day1[i] = day1[i] + 31;
					}
					else if (j == 4 || j == 6 || j == 9 || j == 11)
					{
						day1[i] = day1[i] + 30;
					}
					else if (j == 2)
					{
						day1[i] = day1[i] + 28;
					}
				}
				for (j = 1;j < m2[i];j++)
				{
					if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10)
					{
						day2[i] = day2[i] + 31;
					}
					else if (j == 4 || j == 6 || j == 9 || j == 11)
					{
						day2[i] = day2[i] + 30;
					}
					else if (j == 2)
					{
						day2[i] = day2[i] + 28;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			cha[i] = Math.abs(day1[i] - day2[i]);
			if (cha[i] % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		return 0;
	}
}

