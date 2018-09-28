package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		int h;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 6;i <= n;i += 2)
		{
			for (j = 3;j <= i / 2;j += 2)
			{
				for (k = 2;k <= Math.sqrt(j);++k)
				{
					if (j % k == 0)
					{
						break;
					}
				}
				for (h = 2;h <= Math.sqrt(i - j);++h)
				{
					if ((i - j) % h == 0)
					{
						break;
					}
				}
				if (h > Math.sqrt(i - j) && k > Math.sqrt(j))
				{
					System.out.print(i);
					System.out.print("=");
					System.out.print(j);
					System.out.print("+");
					System.out.print(i - j);
					System.out.print("\n");
					break;
				}
			}
		}
	}
}

