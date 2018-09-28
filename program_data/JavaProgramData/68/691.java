package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int f;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 6; i <= n; i += 2)
		{
			f = 0;
			for (j = 3; j + j <= i; j += 2)
			{
				for (k = 3; k * k <= j; k += 2)
				{
					if (j % k == 0)
					{
						break;
					}
				}
				if (k * k > j)
				{
					for (k = 3; k * k <= i - j; k += 2)
					{
						if ((i - j) % k == 0)
						{
							break;
						}
					}
					if (k * k > i - j)
					{
						System.out.print(i);
						System.out.print('=');
						System.out.print(j);
						System.out.print('+');
						System.out.print(i - j);
						System.out.print("\n");
						f = 1;
					}
				}
				if (f == 1)
				{
					break;
				}
			}

		}
		return 0;
	}


}

