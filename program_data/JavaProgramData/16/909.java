package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n / 10 == 0)
		{
			System.out.print(n);
			System.out.print("\n");
		}
		else if (n / 100 == 0)
		{
			System.out.print(n % 10);
			System.out.print(n / 10);
			System.out.print("\n");
		}
		else if (n / 1000 == 0)
		{
			System.out.print(n % 10);
			System.out.print(n % 100 / 10);
			System.out.print(n / 100);
			System.out.print("\n");
		}
		else if (n / 10000 == 0)
		{
			System.out.print(n % 10);
			System.out.print(n % 100 / 10);
			System.out.print(n % 1000 / 100);
			System.out.print(n / 1000);
			System.out.print("\n");
		}
		else if (n == 10000)
		{
			System.out.print(1);
			System.out.print("\n");
		}
		return 0;
	}
}

