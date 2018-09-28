package <missing>;

public class GlobalMembers
{
	//
	// ????1.cpp
	// ???????????
	// ?????? 1200012943
	// ??:2012.10.26
	//
	public static int Main()
	{
		int m;
		int n;
		int a;
		int b;
		int r;
		int i;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = m / 2;
		for (a = 3; a <= n; a = a + 2)
		{
			r = Math.ceil(Math.sqrt(a)); //?a????
			for (i = 2; i <= r; i++)
			{
				if ((a % i) == 0)
				{
					break; //??????
				}
			}
				if (i == r + 1)
				{
					b = m - a;
					r = Math.ceil(Math.sqrt(b)); //?b????
					for (i = 2; i <= r; i++)
					{
						if ((b % i) == 0)
						{
							break; //??????
						}
					}
						if (i == r + 1)
						{
							System.out.print(a);
							System.out.print(' ');
							System.out.print(b);
							System.out.print("\n");
						}
				}
		}
		return 0;
	}
}

