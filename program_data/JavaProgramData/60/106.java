package <missing>;

public class GlobalMembers
{
	public static int Prime(int n)
	{
		for (int i = 2;i <= n - 1;i++)
		{
			if (n % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}

	public static int Main()
	{
		int n;
		int a = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 2;i + 2 <= n;i++)
		{
			if (Prime(i) != 0 && Prime(i + 2) != 0)
			{
				System.out.print(i);
				System.out.print(' ');
				System.out.print(i + 2);
				System.out.print("\n");
				a = 1;
			}
		}
		if (a == 0)
		{
			System.out.print("empty");
		}


	return 0;
	}
}

