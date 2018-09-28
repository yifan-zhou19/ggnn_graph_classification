package <missing>;

public class GlobalMembers
{
	public static void Try(int n)
	{
		if (n == 1)
		{
			System.out.print("End");
		}
		else
		{
		if (n % 2 == 0)
		{
			System.out.print(n);
			System.out.print("/2=");
			System.out.print(n / 2);
			System.out.print("\n");
			Try(n / 2);
		}
		else
		{
			System.out.print(n);
			System.out.print("*3");
			System.out.print("+1=");
			System.out.print(3 * n + 1);
			System.out.print("\n");
			Try(3 * n + 1);
		}
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		Try(n);
		return 0;
	}
}

