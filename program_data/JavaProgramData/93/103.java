package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (N % 105 == 0)
		{
			System.out.print("3 5 7");
			System.out.print("\n");
			return 0;
		}
		if (N % 15 == 0)
		{
			System.out.print("3 5");
			System.out.print("\n");
			return 0;
		}
		if (N % 21 == 0)
		{
			System.out.print("3 7");
			System.out.print("\n");
			return 0;
		}
		if (N % 35 == 0)
		{
			System.out.print("5 7");
			System.out.print("\n");
			return 0;
		}
		if (N % 3 == 0)
		{
			System.out.print("3");
			System.out.print("\n");
			return 0;
		}
		if (N % 5 == 0)
		{
			System.out.print("5");
			System.out.print("\n");
			return 0;
		}
		if (N % 7 == 0)
		{
			System.out.print("7");
			System.out.print("\n");
			return 0;
		}
		System.out.print("n");
		System.out.print("\n");
		return 0;
	}

}

