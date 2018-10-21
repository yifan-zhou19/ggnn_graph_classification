package <missing>;

public class GlobalMembers
{
	public static int prime(int n)
	{
		int i;
		int flag = 0;
		if (n % 2 != 0)
		{
			for (i = 3;i <= Math.sqrt((double)n); i += 2)
			{
				if (n % i == 0)
				{
					flag = 1;
					break;
				}
			}
			if (flag != 0)
			{
				return 0;
			}
			else
			{
				return 1;
			}
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3;i <= n / 2;i += 2)
		{
			if (prime(i) != 0 && prime(n - i) != 0)
			{
				System.out.print(i);
				System.out.print(' ');
				System.out.print(n - i);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

