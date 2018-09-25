package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int number;
		int[] divisors = {3, 5, 7};
		int flag;

		number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		flag = 0;

		for (int i = 0; i < 3; i++)
		{
			if (number % divisors[i] == 0)
			{
				if (flag == 1)
				{
					System.out.print(' ');
				}
				System.out.print(divisors[i]);
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print('n');
		}

		System.out.print("\n");

		return 0;
	}
}

