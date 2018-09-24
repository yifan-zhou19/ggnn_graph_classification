package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print(n);
		}
		else
		{
			while (n > 0)
			{
				System.out.print(n % 10);
				n = n / 10;
			}
		}
		System.out.print("\n");
		return 0;
	}
}

