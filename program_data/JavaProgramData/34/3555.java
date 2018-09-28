package <missing>;

public class GlobalMembers
{
	public static void slove(int n)
	{
		if (n != 1)
		{
		if (n % 2 != 0)
		{
			System.out.print(n);
			System.out.print("*3+1=");
			System.out.print(n * 3 + 1);
			System.out.print("\n");
			slove(n * 3 + 1);
		}
		if (n % 2 == 0)
		{
			System.out.print(n);
			System.out.print("/2=");
			System.out.print(n / 2);
			System.out.print("\n");
			slove(n / 2);
		}
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		slove(n);
		System.out.print("End");
		System.out.print("\n");
		return 0;
	}
}

