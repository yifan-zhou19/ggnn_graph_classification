package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 10;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n < 10)
		{
			System.out.print(n);
			System.out.print("\n");
		}
		else
		{
			if (n == 10)
			{
			System.out.print(01);
			System.out.print("\n");
			}
			else
			{
					while (n > 0)
					{
					System.out.print(n % i);
					n = n / i;

					}
			}
		}
		return 0;
	}

}

