package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = 0;
		System.out.print((n % 10));
		while (n > 9)
		{
			p = (n - (n % 10)) / 10;
			n = p;
			System.out.print((n % 10));
		}
	}

}

