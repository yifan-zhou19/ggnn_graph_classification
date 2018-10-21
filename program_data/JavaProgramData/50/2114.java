package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int days_within_a_year = new int(int a,int b);
		int week11;
		int week;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			week11 = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 12;i++)
		{
			week = (days_within_a_year(i + 1, 13) + week11) % 7;
			if (week == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
		return 0;

	}
	public static int days_within_a_year(int a,int b)
	{
		int n;
		int d;
		switch (a)
		{
			case 1:
				n = 0;
				break;
			case 2:
				n = 31;
				break;
			case 3:
				n = 31 + 28;
				break;
			case 4:
				n = 31 + 28 + 31;
				break;
			case 5:
				n = 31 + 28 + 31 + 30;
				break;
			case 6:
				n = 31 + 28 + 31 + 30 + 31;
				break;
			case 7:
				n = 31 + 28 + 31 + 30 + 31 + 30;
				break;
			case 8:
				n = 31 + 28 + 31 + 30 + 31 + 30 + 31;
				break;
			case 9:
				n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
				break;
			case 10:
				n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
				break;
			case 11:
				n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
				break;
			case 12:
				n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
				break;
		}
		d = n + b - 1;
		return (d);
	}
}

