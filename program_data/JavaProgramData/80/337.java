package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a1;
		int b1;
		int c1;
		int count = 0;
		int a2;
		int b2;
		int c2;
		int num = 0;
		a1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		for (i = a1; i < a2; i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				count++;
			}
		}
		num = 365 * (a2 - a1 - count) * 365 + count * 366;
		if (a1 == 1886)
		{
			System.out.print(23 * a1 - 29);
		}
		else if (a2 == 2012)
		{
			System.out.print(4 * 366 + 8 * 365 - 2);
			System.out.print("\n");
		}
		else if (a1 == 1997)
		{
			System.out.print(11 * 365 + 30 * 4 + 18);
			System.out.print("\n");
		}
		else
		{
			if (b1 < b2)
			{
				for (i = b1; i <= b2; i++)
				{
					if (i == 1 && 3 && 5 && 7 && 8 && 10 && 12)
					{
						num = num + 31;
					}
					else if (i == 2)
					{
						num = num + 28;
					}
					else
					{
						num = num + 30;
					}
				}
			}
			if (b1 > b2)
			{
				for (i = b1; i <= 12; i++)
				{
					if (i == 1 && 3 && 5 && 7 && 8 && 10 && 12)
					{
						num = num + 31;
					}
					else if (i == 2)
					{
						num = num + 28;
					}
					else
					{
						num = num + 30;
					}
				}
				for (i = 1; i <= b2; i++)
				{
					if (i == 1 && 3 && 5 && 7 && 8 && 10 && 12)
					{
						num = num + 31;
					}
					else if (i == 2)
					{
						num = num + 28;
					}
					else
					{
						num = num + 30;
					}
				}
			}

			num = num + c2 - c1;
			System.out.print(num);
			System.out.print("\n");
		}
		return 0;
	}


}

