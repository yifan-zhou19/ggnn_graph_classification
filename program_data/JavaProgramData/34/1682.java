package <missing>;

public class GlobalMembers
{
	public static void f(int x)
	{
		if (x == 1)
		{
			System.out.print("End");
			return;
		}
		if (x % 2 == 0) //???????
		{
			System.out.print(x);
			System.out.print("/2=");
			System.out.print(x / 2);
			System.out.print("\n");
			System.out.print("\n");
			f(x / 2);
		}
		else
		{
			System.out.print(x);
			System.out.print("*3+1=");
			System.out.print(x * 3 + 1);
			System.out.print("\n");
			System.out.print("\n");
			f(x * 3 + 1);
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

