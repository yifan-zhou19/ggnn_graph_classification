package <missing>;

public class GlobalMembers
{
	public static void f(int x)
	{
		int s;
		if (x == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else
		{
			if (x % 2 == 1)
			{
				s = x * 3 + 1;
				System.out.print(x);
				System.out.print("*3+1=");
				System.out.print(s);
				System.out.print("\n");
				f(s);
			}
			if (x % 2 == 0)
			{
				s = x / 2;
				System.out.print(x);
				System.out.print("/2=");
				System.out.print(s);
				System.out.print("\n");
				f(s);
			}
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

