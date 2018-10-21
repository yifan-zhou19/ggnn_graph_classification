package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int g = 1;
		int i;
		int j;
		int l;
		int y;
		int k1;
		int k2;
		int k3;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = 2 * (n / 2);
		for (i = 6;i <= n;i = i + 2)
		{
			k1 = n / 2;
			y = i - 2;
			k2 = (int)Math.sqrt((double)y);
			for (j = 2;j <= k2;k2++)
			{
				g = 1;
				if (y % j == 0)
				{
					g = 0;
					break;
				}
			}
			if (g == 1)
			{
				System.out.print(i);
				System.out.print("=");
				System.out.print("2+");
				System.out.print(y);
			}
			else
			{
			for (l = 3;l <= k1;l = l + 2)
			{
				g = 1;
				y = i - l;
				k3 = (int)Math.sqrt((double)l) + 1;
				k2 = (int)Math.sqrt((double)y);
					for (j = 2;j <= k3;j++)
					{
				if (l % j == 0)
				{
					g = 0;
					break;
				}
					}
						for (j = 2;j <= k2;j++)
						{
				if (y % j == 0)
				{
					g = 0;
					break;
				}
						}
			if (g == 1)
			{
				System.out.print(i);
				System.out.print("=");
				System.out.print(l);
				System.out.print("+");
				System.out.print(y);
				System.out.print("\n");
				break;
			}
			}
			}
		}
		return 0;
	}


}

