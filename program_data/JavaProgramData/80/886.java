package <missing>;

public class GlobalMembers
{
	public static int yearbegin(int y, int m, int d)
	{
		int sumday = 0;
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		{
			for (int i = 1;i < m;i++)
			{
				sumday = sumday + rm[i];
			}
		}
		else
		{
			for (int i = 1;i < m;i++)
			{
				sumday = sumday + pm[i];
			}
		}
		sumday = sumday + d;
		return sumday;
	}
	public static int[] pm = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int[] rm = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int Main()
	{
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		sy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ey = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		em = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ed = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = 0;

		for (int i = sy + 1;i <= ey - 1;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				sum = sum + 366;
			}
			else
			{
				sum = sum + 365;
			}
		}

		int syb = yearbegin(sy, sm, sd);
		int eyb = yearbegin(ey, em, ed);

		if (sy != ey)
		{
		if ((sy % 4 == 0 && sy % 100 != 0) || (sy % 400 == 0))
		{
		 syb = 366 - syb;
		}
		else
		{
			syb = 365 - syb;
		}

		sum = sum + syb + eyb;
		}

		else
		{
			sum = eyb - syb;
		}

		System.out.print(sum);


		return 0;
	}

}

