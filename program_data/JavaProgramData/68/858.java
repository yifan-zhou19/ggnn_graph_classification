package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int flag = int t;
			int i;
			int j;
			int n;
			int sign = 0;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 6;i <= n;i += 2,sign = 0)
			{
				for (j = 3;j <= n / 2 && sign == 0;j += 2)
				{
					if (flag(j) != 0)
					{
						if (flag(i - j) != 0)
						{
								System.out.print(i);
								System.out.print('=');
								System.out.print(j);
								System.out.print('+');
								System.out.print(i - j);
								System.out.print("\n");
							sign = 1;
						}
					}
				}
			}

	}

	public static int flag(int t)
	{
		int i;
		int sign = 0;
		if (t == 3 || t == 5)
		{
			return 1;
		}
		else
		{
			for (i = 3;i <= Math.sqrt(t) && sign == 0;i += 2)
			{
				if ((t % i) == 0)
				{
						return 0;
					sign = 1;
				}
			}
		}


		if (sign == 0)
		{
			return 1;
		}
	}

}

