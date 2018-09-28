package <missing>;

public class GlobalMembers
{
	public static int runnian(int y)
	{
		int i = 0;
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		{
			i = 1;
		}
		return i;
	}
	public static int rizi(int y,int m,int d)
	{
		int sum;
		int i;
		sum = d;
		for (i = 1;i < m;i++)
		{
		if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
		{
				sum += 31;
		}
			else
			{
				if (i == 2)
				{
					sum = sum + 28 + runnian(y);
				}
				else
				{
					sum += 30;
				}
			}
		}
		return sum;


	}
	public static int Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int sum = 0;
		for (i = y1;i < y2;i++)
		{
			sum += 365 + runnian(i);
		}
		sum = sum + rizi(y2, m2, d2) - rizi(y1, m1, d1);
		System.out.print(sum);
		return 0;
	}


}

