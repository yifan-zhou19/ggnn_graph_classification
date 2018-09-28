package <missing>;

public class GlobalMembers
{
	public static int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int[] rdays = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int sum1(int year,int month, int day)
	{
		int i;
		int restday = day;
		for (i = 1;i < month;i++)
		{
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			{
				restday = restday + rdays[i];
			}
			else
			{
				restday = restday + days[i];
			}
		}
		return restday;
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
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sm = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sd = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			ey = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			em = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			ed = Integer.parseInt(tempVar6);
		}
		int i;
		int sum = 0;
		for (i = sy;i < ey;i++)
		{
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
			{
				sum += 366;
			}
		   else
		   {
			   sum += 365;
		   }
		}
		sum = sum + sum1(ey, em, ed) - sum1(sy, sm, sd);
		System.out.printf("%d",sum);
	}

}

