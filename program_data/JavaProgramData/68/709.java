package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int m1;
		int m2;
		int k;
		int j;
		int i;
		int h;
		int a;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (m = 6 ; m <= n ; m = m + 2)
		{
			a = 0;

			for (m1 = 3 ; m1 <= m / 2 ; m1 = m1 + 2)
			{
				if (a == 0)
				{
					k = Math.sqrt(m1);

					//??m1?????
					for (i = 3 ; i <= k ; i = i + 2)
					{
						if (m1 % i == 0)
						{
							break;
						}
					}

					if (i >= k + 1)
					{
						//?m1??????m-m1?????
						m2 = m - m1;
						j = Math.sqrt(m2);

						for (h = 3 ; h <= j ; h = h + 2)
						{
							if (m2 % h == 0)
							{
								break;
							}
						}

						if (h >= j + 1)
						{
							System.out.print(m);
							System.out.print('=');
							System.out.print(m1);
							System.out.print('+');
							System.out.print(m2);
							System.out.print("\n");
							a = 1;
						}
					}
				}
			}
		}

		return 0;
	}
}

