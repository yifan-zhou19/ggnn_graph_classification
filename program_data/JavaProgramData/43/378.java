package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int p;
		int q;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (m == 6)
		{
			System.out.print(3);
			System.out.print(" ");
			System.out.print(3);
			System.out.print("\n");
		}
		if (m == 8)
		{
			System.out.print(3);
			System.out.print(" ");
			System.out.print(5);
			System.out.print("\n");
		}
		if (m == 10)
		{
			System.out.print(3);
			System.out.print(" ");
			System.out.print(7);
			System.out.print('\n');
			System.out.print(5);
			System.out.print(" ");
			System.out.print(5);
			System.out.print("\n");
		}
		if (m == 12)
		{
			System.out.print(5);
			System.out.print(" ");
			System.out.print(7);
			System.out.print("\n");
		}
		if (m >= 14)
		{
			for (i = 3; i <= m / 2; i = i + 2)
			{
				if ((i == 3) || (i == 5) || (i == 7))
				{
					j = m - i;
					for (q = 3; q <= Math.sqrt(j); q = q + 2)
					{
						if (j % q == 0)
						{
							break;
						}
						else if ((j % q != 0) && (q <= Math.sqrt(j)) && (q + 2 > Math.sqrt(j)))
						{
							System.out.print(i);
							System.out.print(" ");
							System.out.print(j);
							System.out.print("\n");
						}
					}
				}
				for (p = 3; p <= Math.sqrt(i); p = p + 2)
				{
					if (i % p == 0)
					{
						break;
					}
					else if ((i % p != 0) && (p <= Math.sqrt(i)) && (p + 2 > Math.sqrt(i)))
					{
						j = m - i;
						for (q = 3; q <= Math.sqrt(j); q = q + 2)
						{
							if (j % q == 0)
							{
								break;
							}
							else if ((j % q != 0) && (q <= Math.sqrt(j)) && (q + 2 > Math.sqrt(j)))
							{
								System.out.print(i);
								System.out.print(" ");
								System.out.print(j);
								System.out.print("\n");
							}
						}
					}
				}
			}
		}
		return 0;
	}
}

