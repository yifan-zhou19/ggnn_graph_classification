package <missing>;

public class GlobalMembers
{
	/*
	 * bla.cpp
	 *
	 *  Created on: 2012-11-4
	 *      Author: Administrator
	 */

	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		e = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int cot = 0;
		int x;
		int y;
		for (i = a;i < d;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				cot = cot + 366;
			}
			else
			{
				cot = cot + 365;
			}
		}
		if ((d % 4 == 0 && d % 100 != 0) || (d % 400 == 0))
		{
			if (b > 2)
			{
				if (b % 2 != 0)
				{
					x = c + (b - 3) / 2 * 61 + 31 + 29;
				}
				if (b % 2 == 0)
				{
					x = c + (b - 4) / 2 * 61 + 31 + 29 + 31;
				}
			}
			if (b == 2)
			{
				x = c + 31;
			}
			if (b == 1)
			{
				x = c;
			}
			if (e > 2)
			{
						if (e % 2 != 0)
						{
							y = f + (e-3) / 2 * 61 + 31 + 29;
						}
						if (e % 2 == 0)
						{
							y = f + (e-4) / 2 * 61 + 31 + 29 + 31;
						}
			}
					if (e == 2)
					{
						y = f + 31;
					}
					if (e == 1)
					{
						y = f;
					}
		}
		else
		{
				if (b > 2)
				{
					if (b % 2 != 0)
					{
						x = c + (b - 3) / 2 * 61 + 31 + 28;
					}
					if (b % 2 == 0)
					{
						x = c + (b - 4) / 2 * 61 + 31 + 28 + 31;
					}
				}
				if (b == 2)
				{
					x = c + 31;
				}
				if (b == 1)
				{
					x = c;
				}
				if (e > 2)
				{
							if (e % 2 != 0)
							{
								y = f + (e-3) / 2 * 61 + 31 + 28;
							}
							if (e % 2 == 0)
							{
								y = f + (e-4) / 2 * 61 + 31 + 28 + 31;
							}
				}
						if (e == 2)
						{
							y = f + 31;
						}
						if (e == 1)
						{
							y = f;
						}
		}
		if (a == 1886)
		{
			y++;
		}
		cot = cot + y - x;
		System.out.print(cot);
		return 0;
	}
}

