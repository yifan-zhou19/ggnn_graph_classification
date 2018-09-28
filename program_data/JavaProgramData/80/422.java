package <missing>;

public class GlobalMembers
{
	public static int run(int year)
	{
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			return 1;
		}
		return 0;
	}
	public static int Main()
	{
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		int i;
		int sum = 0;
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		sy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ey = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		em = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ed = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = sy;i < ey;i++)
		{
			if (run(i) == 1)
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
		}
		for (i = 1;i < sm;i++)
		{
			sum -= m[i];
			if (i == 2 && run(sy) == 1)
			{
				sum--;
			}
		}
		sum -= sd;
		for (i = 1;i < em;i++)
		{
			sum += m[i];
			if (i == 2 && run(ey) == 1)
			{
				sum++;
			}
		}
		sum += ed;
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

