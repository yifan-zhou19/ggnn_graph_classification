package <missing>;

public class GlobalMembers
{
	/*
	 *???? ???.cpp
	 *  ????: 2010-11-24
	 *    ??????
	 */

	public static int Main()
	{
		double a;
		double b;
		double ca;
		double cb;
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (ca = 0;;ca++)
		{
			if (a < Math.pow(2.0,ca + 1.0))
			{
				break;
			}
		}
		for (cb = 0;;cb++)
		{
			if (b < Math.pow(2.0,cb + 1.0))
			{
				break;
			}
		}
		if (ca >= cb)
		{
			for (int i = cb;i < ca;i++)
			{
				if ((int)a % 2 == 0)
				{
					a = a / 2;
				}
				else
				{
					a = (a - 1) / 2;
				}
			}

			for (int i = cb;i >= 0;i--)
			{
				if (a == b)
				{
						System.out.print(a);
					break;
				}
				else
				{
					if ((int)a % 2 == 0)
					{
					a = a / 2;
					}
				else
				{
					a = (a - 1) / 2;
				}
				if ((int)b % 2 == 0)
				{
					b = b / 2;
				}
				else
				{
					b = (b - 1) / 2;
				}

				}
			}
		}
		else
		{
			for (int i = ca;i < cb;i++)
			{
			if ((int)b % 2 == 0)
			{
				b = b / 2;
			}
			else
			{
				b = (b - 1) / 2;
			}
			}

		for (int i = ca;i >= 0;i--)
		{
			if (a == b)
			{
					System.out.print(a);
				break;
			}
			else
			{
				if ((int)a % 2 == 0)
				{
				a = a / 2;
				}
			else
			{
				a = (a - 1) / 2;
			}
			if ((int)b % 2 == 0)
			{
				b = b / 2;
			}
			else
			{
				b = (b - 1) / 2;
			}

			}
		}
		}
		return 0;
	}

}

