package <missing>;

public class GlobalMembers
{
	public static int runnian(int y)
	{
		int result;
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		return result;
	}
	public static int dijitian(int year,int month,int day)
	{
		int i;
		int days = 0;
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		a[2] = 28 + runnian(year);
		for (i = 1;i < month;i++)
		{
			days = days + a[i];
		}
		days = days + day;
		return days;
	}
	public static void Main(String[] args)
	{
		int runnian = int y;
		int dijitian = new int(int year,int month,int day);
		int i;
		int sum = 0;
		int final;
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
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
		String tempVar4 = ConsoleInput.scanfRead(" ");
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

		for (i = y1;i < y2;i++)
		{
			sum = sum + 365 + runnian(i);
		}
		final = sum + dijitian(y2, m2, d2) - dijitian(y1, m1, d1);
		System.out.printf("%d",final);
	}
}

