package <missing>;

public class GlobalMembers
{
	public static void Guess(int n)
	{
		if (n == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else if (n % 2 != 0)
		{
			int result = n * 3 + 1;
			System.out.print(n);
			System.out.print("*3+1=");
			System.out.print(result);
			System.out.print("\n");
			Guess(result);
		}
		else
		{
			int result = n / 2;
			System.out.print(n);
			System.out.print("/2=");
			System.out.print(result);
			System.out.print("\n");
			Guess(result);
		}
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		Guess(n);
	}

}

