package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int rnfeb = int year;
		int n;
		int year;
		int month1;
		int month2;
		int e;
		int i;
		int j;
		int day;
		int num = 0;
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
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					month1 = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					month2 = Integer.parseInt(tempVar4);
				}
				if (month1 < month2)
				{
					e = month1;
					month1 = month2;
					month2 = e;
				}
				num = 0;
				for (j = month2;j < month1;j++)
				{
					if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
					{
						day = 31;
					}
					else if (j == 4 || j == 6 || j == 9 || j == 11)
					{
						day = 30;
					}
					else if (j == 2)
					{
						day = rnfeb(year);
					}
					num += day;
				}
				if (num % 7 == 0)
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
	public static int rnfeb(int year)
	{
		int z;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			z = 29;
		}
		else
		{
			z = 28;
		}
		return (z);
	}
}

