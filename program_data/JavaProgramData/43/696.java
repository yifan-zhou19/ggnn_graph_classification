package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int a = 3;
		for (;a <= m / 2;a = a + 2)
		{
			double s = Math.sqrt(a);
			int i = 2;
			for (;i <= (int)s + 1;i++)
			{
				int b;
				b = a % i;
				if (b == 0)
				{
					break;
				}
			}
			if (i <= (int)s + 1)
			{
				continue;
			}
			else
			{
				int c;
				c = m - a;
				double t = Math.sqrt((double)c);
			int h = 2;
			for (;h <= (int)t + 1;h++)
			{
				int d;
				d = c % h;
				if (d == 0)
				{
					break;
				}
			}
			if (h <= (int)t + 1)
			{
				continue;
			}
			else
			{
				System.out.print(a);
				System.out.print(' ');
				System.out.print(c);
				System.out.print("\n");
			}
			}
		}

		return 0;
	}

}

