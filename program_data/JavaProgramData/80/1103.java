package <missing>;

public class GlobalMembers
{
	public static int runnian(int year)
	{
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			return 366;
		}
		else
		{
			return 365;
		}
	}

	public static int dijitian(int year,int month,int date)
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int sum = 0;
		if (runnian(year) == 366)
		{
			a[1] = 29;
		}
		for (i = 0;i < month - 1;i++)
		{
			sum += a[i];
		}
		sum += date;

		return sum;
	}

	public static int Main()
	{
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
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
		String tempVar4 = ConsoleInput.scanfRead();
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
		int sa;
		int sb;
		sa = dijitian(sy, sm, sd);
		sb = dijitian(ey, em, ed);
		int i;
		int days = 0;
		for (i = sy;i < ey;i++)
		{
			days += runnian(i);
		}
		days = days - sa + sb;
		System.out.printf("%d\n",days);
		return 0;
	}

}

