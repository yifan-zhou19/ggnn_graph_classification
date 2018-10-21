package <missing>;

public class GlobalMembers
{
	public static int yd(int x)
	{
		x = (x - 1) % 2000;
		int yd;
		int i;
		int n = 0;
		for (i = 1;i <= x;i++)
		{
			if ((i % 400 == 0) || (i % 4 == 0 && i % 100 != 0))
			{
				n = n + 1;
			}
		}
		yd = x % 7 + n % 7;
		return yd;
	}

	public static int md(int x,int y)
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int i;
		int md = 0;
		if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0))
		{
			for (i = 0;i <= x - 2;i++)
			{
				md = md + b[i];
			}
		}
		else
		{
			for (i = 0;i <= x - 2;i++)
			{
				md = md + a[i];
			}
		}
		return md;
	}

	public static void Main()
	{
		int year;
		int month;
		int day;
		int days;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		days = yd(year) + md(month, year) % 7 + day;
		int a;
		a = days % 7;
		switch (a)
		{
			case 1:
				System.out.print("Mon.\n");
				break;
			case 2:
				System.out.print("Tue.\n");
				break;
			case 3:
				System.out.print("Wed.\n");
				break;
			case 4:
				System.out.print("Thu.\n");
				break;
			case 5:
				System.out.print("Fri.\n");
				break;
			case 6:
				System.out.print("Sat.\n");
				break;
			case 0:
				System.out.print("Sun.\n");
				break;
		}
	}

}

