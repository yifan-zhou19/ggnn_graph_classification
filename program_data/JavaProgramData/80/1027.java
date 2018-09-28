package <missing>;

public class GlobalMembers
{
	public static int yue(int m,int n)
	{
		if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12)
		{
			return 31;
		}
		else if (n == 4 || n == 6 || n == 9 || n == 11)
		{
			return 30;
		}
		else if ((m % 4 == 0 && m % 100 != 0) || (m % 400 == 0) && n == 2)
		{
			return 29;
		}
		else
		{
			return 28;
		}
	}
	public static int nian(int m)
	{
		if ((m % 4 == 0 && m % 100 != 0) || (m % 400 == 0))
		{
			return 366;
		}
		else
		{
			return 365;
		}
	}
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
		System.out.print("\n");
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		e = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = 0;
		int t = 0;
		if (a == d)
		{
			for (int i = b;i < e;i++)
			{
				sum = sum + yue(a, i);
			}
			System.out.print(sum + f - c);
		}
		else
		{
			for (int i = a;i < d;i++)
			{
				sum = sum + nian(i);
			}
			if (b == e)
			{
				System.out.print(sum + f - c);
			}
			else if (e > b)
			{
				for (int s = b;s < e;s++)
				{
					sum = sum + yue(d, s);
				}
				System.out.print(sum + f - c);
			}
			else
			{
				for (int s = e;s < b;s++)
				{
					t = t + yue(d, s);
				}
				System.out.print(sum - (t + c - f));
			}
		}
		return 0;
	}


}

