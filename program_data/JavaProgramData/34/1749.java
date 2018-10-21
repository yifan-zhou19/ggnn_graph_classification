package <missing>;

public class GlobalMembers
{
	public static void jiaogu(int N)
	{
		if (N == 1)
		{
			System.out.print("End");
			System.out.print("\n");
			return;
		}
		if (N % 2 != 0)
		{
			System.out.print(N);
			System.out.print("*");
			System.out.print(3);
			System.out.print("+");
			System.out.print(1);
			System.out.print("=");
			System.out.print(3 * N + 1);
			System.out.print("\n");
			return jiaogu(3 * N + 1);
		}
		if (N % 2 == 0)
		{
			System.out.print(N);
			System.out.print("/");
			System.out.print(2);
			System.out.print("=");
			System.out.print(N / 2);
			System.out.print("\n");
			return jiaogu(N / 2);
		}
	}
	public static int Main()
	{
		int N = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		jiaogu(N);
		return 0;
	}

}

