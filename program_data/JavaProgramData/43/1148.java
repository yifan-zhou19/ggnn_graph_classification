package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int b;
		int g = 1;
		int l = 1;
		double c;
		double d;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (a = 3;a <= m / 2;a += 2)
		{
			c = Math.sqrt(a);
			for (int i = 2;i <= c;i++)
			{
				if (a % i == 0)
				{
					g = 0;
					break;
				}
			}
			if (g == 1)
			{
				b = m - a;
				d = Math.sqrt(b);
				for (int j = 2;j <= d;j++)
				{
					if (b % j == 0)
					{
						l = 0;
						break;
					}
				}
				if (l == 1)
				{
					System.out.print(a);
					System.out.print(" ");
					System.out.print(b);
					System.out.print("\n");
				}
			}
			g = 1;
			l = 1;
		}
		return 0;
	}
}

