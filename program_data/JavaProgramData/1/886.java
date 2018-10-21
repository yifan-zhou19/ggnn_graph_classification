package <missing>;

public class GlobalMembers
{
	public static void Factorize(int n, int fact)
	{
		int i;
		for (i = fact; i <= Math.sqrt(n); i++)
		{
			if (n % i == 0)
			{
				Factorize(n / i, i);
			}
		}
		number++;
	}
	public static int number = 0;
	public static int Main()
	{
		int times;
		int num;
		int i;
		times = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < times; i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			Factorize(num, 2);
			System.out.print(number);
			System.out.print("\n");
			number = 0;
		}
		return 0;
	}

}

