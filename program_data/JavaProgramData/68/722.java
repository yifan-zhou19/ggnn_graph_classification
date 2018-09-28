package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int n1;
		int n2;
		int m;
		int k1 = 0;
		int k2 = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		{
			for (m = 6;m <= n;m += 2)
			{
			for (n1 = 3;n1 <= m / 2;n1 += 2)
			{
					for (int j = 3;(j * j) <= n1;j += 2)
					{
					if (n1 % j == 0)
					{
							k1 = 1;
							break;
					}
					}
				if (k1 != 1)
				{
					n2 = m - n1;
					for (int x = 3;(x * x) <= n2;x += 2)
					{
						if (n2 % x == 0)
						{
								k2 = 1;
								break;
						}
					}
					if (k2 != 1)
					{
						System.out.print(m);
						System.out.print("=");
						System.out.print(n1);
						System.out.print("+");
						System.out.print(n2);
						System.out.print("\n");
								break;
					}
					k2 = 0;
				}
				k1 = 0;
			}
			}
		}
		return 0;
	}


}

