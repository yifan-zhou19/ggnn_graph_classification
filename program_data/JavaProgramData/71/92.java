package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int a;
		int b;
		int p;
		int m;
		int s;
		int i;
		int t;
		int l;
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 1;l <= k;l++)
		{
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a < b)
			{
				p = a;
				a = b;
				b = p;
			}
			m = 0;
			i = 0;
			t = a - b;
			s = b - 1;
			do
			{
				s = s + 1;
				if (s == 1)
				{
					m = m + 31;
				}
				if (s == 2)
				{
					if (y % 100 != 0)
					{
						if (y % 4 != 0)
						{
							m = m + 28;
						}
						else
						{
							m = m + 29;
						}
					}
					else
					{
						if (y % 400 != 0)
						{
							m = m + 28;
						}
						else
						{
							m = m + 29;
						}
					}
				}
				if (s == 3)
				{
					m = m + 31;
				}
				if (s == 4)
				{
					m = m + 30;
				}
				if (s == 5)
				{
					m = m + 31;
				}
				if (s == 6)
				{
					m = m + 30;
				}
				if (s == 7)
				{
					m = m + 31;
				}
				if (s == 8)
				{
					m = m + 31;
				}
				if (s == 9)
				{
					m = m + 30;
				}
				if (s == 10)
				{
					m = m + 31;
				}
				if (s == 11)
				{
					m = m + 30;
				}
				if (s == 12)
				{
					m = m + 31;
				}
				i = i + 1;
			}while (i < t);
			if (m % 7 != 0)
			{
				System.out.print("NO");
				System.out.print("\n");
			}
			else
			{
				System.out.print("YES");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

