package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int a;
		int b;
		int p;
		int q;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 6; i <= n; i = i + 2)
		{
			m = 3;
			while (m < i)
			{
				q = 0;
				for (p = 3; p <= Math.sqrt(m); p = p + 2)
				{
					if (m % p == 0)
					{
						q = 1;
						break;
					}
				}
				if (q == 0)
				{
					a = m;
					b = i - m;
					for (p = 3; p <= Math.sqrt(b); p = p + 2)
					{
						if (b % p == 0)
						{
							q = 1;
							break;
						}
					}
					if (q == 0)
					{
						System.out.print(i);
						System.out.print('=');
						System.out.print(a);
						System.out.print('+');
						System.out.print(b);
						System.out.print("\n");
						break;
					}
					else
					{
						m = m + 2;
					}
				}
				else
				{
					m = m + 2;
				}
			}
		}
		return 0;
	}
}

