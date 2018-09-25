package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] s2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int flag;
		int sum = 0;
		int i;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = y1 + 1;i < y2;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
		}
		if (y1 < y2)
		{
			flag = 0;
			if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
			{
				flag = 1;
			}
			for (i = m1 - 1;i < 12;i++)
			{
				if (flag != 0)
				{
					sum += s2[i];
				}
				else
				{
					sum += s1[i];
				}
			}
			sum -= d1;

			flag = 0;
			if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
			{
				flag = 1;
			}

			for (i = 0;i < m2 - 1;i++)
			{
				if (flag != 0)
				{
					sum += s2[i];
				}
				else
				{
					sum += s1[i];
				}
			}
			sum += d2;
		}
		else
		{
			flag = 0;
			if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
			{
				flag = 1;
			}
			for (i = m1 - 1;i < m2 - 1;i++)
			{
				if (flag != 0)
				{
					sum += s2[i];
				}
				else
				{
					sum += s1[i];
				}
			}
			sum = sum - d1 + d2;
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;


	}
}

