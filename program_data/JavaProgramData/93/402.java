package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int number;
		number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0)
		{
		System.out.print("3 5 7");
		System.out.print("\n");
		}
		if (number % 3 == 0 && number % 5 == 0 && number % 7 != 0)
		{
		System.out.print("3 5");
		System.out.print("\n");
		}

		if (number % 3 == 0 && number % 5 != 0 && number % 7 == 0)
		{
		System.out.print("3 7");
		System.out.print("\n");
		}

		if (number % 3 != 0 && number % 5 == 0 && number % 7 == 0)
		{
		System.out.print("5 7");
		System.out.print("\n");
		}

		if (number % 3 == 0 && number % 5 != 0 && number % 7 != 0)
		{
		System.out.print("3");
		System.out.print("\n");
		}

		if (number % 3 != 0 && number % 5 == 0 && number % 7 != 0)
		{
		System.out.print("5");
		System.out.print("\n");
		}

		if (number % 3 != 0 && number % 5 != 0 && number % 7 == 0)
		{
		System.out.print("7");
		System.out.print("\n");
		}

		if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0)
		{
		System.out.print("n");
		System.out.print("\n");
		}
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}

}

