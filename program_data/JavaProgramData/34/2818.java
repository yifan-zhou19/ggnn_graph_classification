package <missing>;

public class GlobalMembers
{
	public static void com(int n)
	{
		if (n == 1)
		{
			System.out.print("End");
			System.out.print("\n");
			return;
		}
		if (n % 2 == 0)
		{
			System.out.print(n);
			System.out.print("/2=");
			System.out.print(n / 2);
			System.out.print("\n");
			return com(n / 2);
		}
		else
		{
			System.out.print(n);
			System.out.print("*3+1=");
			System.out.print(n * 3 + 1);
			System.out.print("\n");
			return com(n * 3 + 1);
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		com(n);
		return 0;
	}

}

