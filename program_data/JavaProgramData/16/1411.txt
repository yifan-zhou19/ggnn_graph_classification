package <missing>;

public class GlobalMembers
{
	public static void f(int n)
	{
		System.out.print(n % 10);
		n = n / 10;
		if (n != 0)
		{
			f(n);
		}
	}


	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f(n);
		return 0;
	}
}

