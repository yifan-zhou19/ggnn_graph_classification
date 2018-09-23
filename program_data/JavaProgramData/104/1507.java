package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int x;
		int y;
		int p;
		int q;
		int m;
		int n;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 11;i++)
		{
			if (Math.pow(2.0,i) > x)
			{
				p = i;
				m = x - Math.pow(2.0,i - 1) + 1;
				break;
			}
		}
		for (i = 0;i < 11;i++)
		{
			if (Math.pow(2.0,i) > y)
			{
				q = i;
				n = y - Math.pow(2.0,i - 1) + 1;
				break;
			}
		}
		for (;;)
		{
			if (p == q)
			{
				if (m == n)
				{
					System.out.print(Math.pow(2.0,p - 1) + m - 1);
					return 0;
				}
				else
				{
					for (;;)
					{
						p--;
						q--;
						if (m % 2 == 0)
						{
							m = m / 2;
						}
						else if (m % 2 == 1)
						{
							m = m / 2 + 1;
						}
						if (n % 2 == 0)
						{
							n = n / 2;
						}
						else if (n % 2 == 1)
						{
							n = n / 2 + 1;
						}
						if (m == n)
						{
							break;
						}
					}
				}
			}
			else if (p > q)
			{
				p--;
				if (m % 2 == 0)
				{
					m = m / 2;
				}
				else if (m % 2 == 1)
				{
					m = m / 2 + 1;
				}
			}
			else
			{
				q--;
				if (n % 2 == 0)
				{
					n = n / 2;
				}
				else if (n % 2 == 1)
				{
					n = n / 2 + 1;
				}
			}
		}
		return 0;
	}





}

