package <missing>;

public class GlobalMembers
{
	public static int check(int x)
	{
		int q = Math.sqrt(x);
		int n = 0;
		int flag = 1;
		for (n = 2; n <= q; n++)
		{
			if (x % n == 0)
			{
				flag = 0;
				break;
			}
		}
		return (flag);
	}

	public static int Main()
	{
		int n = 0;
		int i = 0;
		int k = 0;
		int j = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 6; i <= n; i += 2)
		{
			for (j = 2; j <= i / 2; j++)
			{
				if (check(j) != 0)
				{
					k = i - j;
					if (check(k) != 0)
					{
						System.out.print(i);
						System.out.print("=");
						System.out.print(j);
						System.out.print("+");
						System.out.print(k);
						System.out.print("\n");
						j = i / 2 + 1;
					}
				}
			}
		}

		return 0;
	}


}

