package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m; //m??????? a?an-1 b?an-2 x?an k???  n??n??
		int x;
		int a = 1;
		int b = 1;
		int k1;
		int k2;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k1 = 1;k1 <= m;k1 = ++k1)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = 1;
			b = 1;
			if (n == 1)
			{
				System.out.print(1);
				System.out.print("\n");
			}
			if (n == 2)
			{
				System.out.print(1);
				System.out.print("\n");
			}
			if (n >= 3)
			{
				for (k2 = 3;k2 <= n;++k2)
				{
					x = a + b;
				b = a;
				a = x;
				}
			System.out.print(x);
			System.out.print("\n");
			}
		}
		return 0;
	}
}

