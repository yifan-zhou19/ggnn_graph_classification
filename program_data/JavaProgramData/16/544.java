package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int mod;

		if (n == 0)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		else
		{

			while (n != 0)
			{
				mod = n % 10;
				System.out.print(mod);
				n /= 10;
			}
		}

		System.out.print("\n");

		return 0;
	}
}

