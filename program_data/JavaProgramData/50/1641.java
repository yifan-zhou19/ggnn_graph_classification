package <missing>;

public class GlobalMembers
{
	public static int month(int n)
	{
		int sum = 0;
		int i;
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				sum = sum + 0;
			}
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				sum = sum + 31;
			}
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				sum = sum + 30;
			}
			if (i == 2)
			{
				sum = sum + 28;
			}
		}
		return sum;
	}

	public static int fri(int n,int w) //n  month
	{
		int days;
		days = month(n);
		days = days + 13;
		int a;
		a = days % 7;
		if (w + a > 7)
		{
			return w + a - 7 - 1;
		}
		else
		{
			return w + a - 1;
		}
	}

	public static int Main()
	{
		int i;
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 12;i++)
		{
			int day;
			day = fri(i, w);
			if (day == 5)
			{
				System.out.printf("%d\n",i);
			}
		}
		return 0;
	}
}

