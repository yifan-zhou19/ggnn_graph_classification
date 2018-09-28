package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int y;
		int h;
		int i;
		int m;
		int x;
		while ((n != 0 && n != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			for (x = 3;x <= n / 2;x++)
			{
				k = (int)Math.sqrt(x);
				y = n - x;
				for (i = 2;i <= k;i++)
				{
					if ((x % i) == 0)
					{
						break;
					}
				}
					if (i == k + 1)
					{
						h = (int)Math.sqrt(y);
						for (m = 2;m <= h;m++)
						{
							if ((y % m) == 0)
							{
								break;
							}
						}
							if (m == h + 1)
							{
								System.out.print(x);
								System.out.print(" ");
								System.out.print(y);
								System.out.print("\n");
							}
					}
			}

		}
		return 0;
	}
}

