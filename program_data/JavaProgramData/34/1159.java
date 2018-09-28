package <missing>;

public class GlobalMembers
{
	public static int guess(int x)
	{
		if (x == 1)
		{
			System.out.print("End");
			return 0;
		}
		else if (x % 2 == 0)
		{
			int b = x / 2;
			System.out.print(x);
			System.out.print("/2=");
			System.out.print(b);
			System.out.print("\n");
			return guess(b);
		}
		else
		{
			int b = x * 3 + 1;
			System.out.print(x);
			System.out.print("*3+1=");
			System.out.print(b);
			System.out.print("\n");
			return guess(b);
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (guess(n) == 0)
		{
		return 0;
		}
	}
}

