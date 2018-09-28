package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int w;
		int x;
		int k;
		int s;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3;i <= m / 2;i += 2)
		{
			j = m - i;
			w = Math.sqrt(i);
			x = Math.sqrt(j);
			for (k = 2;k <= i - 1;k++)
			{
				if (i % k == 0)
				{
					break;
				}
				if (k >= i - 1)
				{
					for (s = 2;s <= j - 1;s++)
					{
						if (j % s == 0)
						{
							break;
						}
						if (s >= j - 1)
						{
							System.out.print(i);
							System.out.print(' ');
							System.out.print(j);
							System.out.print("\n");
						}
					}
				}
			}
		}
		return 0;
	}

}

