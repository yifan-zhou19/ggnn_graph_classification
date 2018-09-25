package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = 3 * (n % 3 == 0) + 5 * (n % 5 == 0) + 7 * (n % 7 == 0);
		if (s == 0)
		{
			System.out.print('n');
		}
		if (s == 3)
		{
			System.out.print(3);
		}
		if (s == 5)
		{
			System.out.print(5);
		}
		if (s == 7)
		{
			System.out.print(7);
		}
		if (s == 8)
		{
			System.out.print("3 5");
		}
		if (s == 10)
		{
			System.out.print("3 7");
		}
		if (s == 12)
		{
			System.out.print("5 7");
		}
		if (s == 15)
		{
			System.out.print("3 5 7");
		}
		return 0;
	}

}

