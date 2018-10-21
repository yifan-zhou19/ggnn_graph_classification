package <missing>;

public class GlobalMembers
{
	public static int[] mon1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int[] mon2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static int cal(int y,int m,int d)
	{
		int num = 0;
		int i;
		while (y > 400)
		{
			y -= 400;
			num += 146097;
		}
		if (y == 400)
		{
			num += 145731;
			for (i = 0;i < m - 1;i++)
			{
				num += mon2[i];
			}
			num += d;
		}
		else
		{
			while (y > 100)
			{
				y -= 100;
				num += 36524;
			}
			if (y == 100)
			{
				num += 36159;
				for (i = 0;i < m - 1;i++)
				{
					num += mon1[i];
				}
				num += d;
			}
			else
			{
				while (y > 4)
				{
					y -= 4;
					num += 1461;
				}
				if (y == 4)
				{
					num += 365 * 3;
					for (i = 0;i < m - 1;i++)
					{
						num += mon2[i];
					}
					num += d;
				}
				else
				{
					num += 365 * (y - 1);
					for (i = 0;i < m - 1;i++)
					{
						num += mon1[i];
					}
					num += d;
				}
			}
		}
		return num;
	}





	public static int Main()
	{
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(cal(y2, m2, d2) - cal(y1, m1, d1));
		System.out.print("\n");
		return 0;
	}

}

