package <missing>;

public class GlobalMembers
{
	public static void process(int n)
	{
		int m;
		if (n == 1)
		{
			System.out.print("End");
			System.out.print("\n");
			return;
		}
		if (n % 2 == 0)
		{
			m = n / 2;
			System.out.print(n);
			System.out.print('/');
			System.out.print(2);
			System.out.print('=');
			System.out.print(m);
			System.out.print("\n");
		}
		else
		{
			m = n * 3 + 1;
			System.out.print(n);
			System.out.print("*3+1=");
			System.out.print(m);
			System.out.print("\n");
		}
		process(m);
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		process(n);
		return 0;
	}

}

