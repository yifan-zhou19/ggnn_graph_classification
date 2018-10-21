package <missing>;

public class GlobalMembers
{
	public static int i;
	public static void f(int n)
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 1)
		{
			System.out.print(a);
			System.out.print(" ");
		}
		else
		{
			f(n - 1);
			System.out.print(a);
			if (n != i)
			{
				System.out.print(" ");
			}
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = n;
		f(n);
		return 0;
	}
}

