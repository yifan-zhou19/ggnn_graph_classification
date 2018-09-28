package <missing>;

public class GlobalMembers
{
	public static int prime(int num)
	{
		int i;
		for (i = 2;i * i <= num;i++)
		{
			if (num % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int n;
		int i;
		int small;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print("6=3+3");
		for (i = 8;i <= n;i = i + 2)
		{
			for (small = 2;2 * small <= i;small++)
			{
				if (prime(small) == 1 && prime(i - small) == 1)
				{
					System.out.print("\n");
					System.out.print(i);
					System.out.print('=');
					System.out.print(small);
					System.out.print('+');
					System.out.print(i - small);
					break;
				}
			}
		}
		return 0;
	}
}

