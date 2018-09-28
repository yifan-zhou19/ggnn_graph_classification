package <missing>;

public class GlobalMembers
{
	public static void f(int n)
	{
		if (n % 2 != 0)
		{
			System.out.print(n);
			System.out.print('*');
			System.out.print(3);
			System.out.print('+');
			System.out.print(1);
			System.out.print('=');
			System.out.print(n * 3 + 1);
			System.out.print("\n");
			n = n * 3 + 1;
		}
		else
		{
			System.out.print(n);
			System.out.print('/');
			System.out.print(2);
			System.out.print('=');
			System.out.print(n / 2);
			System.out.print("\n");
			n = n / 2;
		}
		if (n == 1)
		{
			System.out.print("End");
		}
		else
		{
			f(n);
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 1)
		{
			System.out.print("End");
		}
		else
		{
			f(n);
		}
	}
}

