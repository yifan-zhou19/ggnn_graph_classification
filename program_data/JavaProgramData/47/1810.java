package <missing>;

public class GlobalMembers
{
	public static void daoxu(int n)
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 1)
		{
			System.out.print(a);
			System.out.print(' ');
		}
		else
		{
			daoxu(n - 1);
		System.out.print(a);
		System.out.print(' ');
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int b;
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		daoxu(n - 1);
		System.out.print(b);

		return 0;
	}


}

