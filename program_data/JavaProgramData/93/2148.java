package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int r = 0;

		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		if (a % 3 == 0)
		{
		r = r + 3;
		}

		if (a % 5 == 0)
		{
		r = r + 5;
		}

		if (a % 7 == 0)
		{
		r = r + 7;
		}

		if (r == 3 | r == 5 | r == 7)
		{
		System.out.print(r);
		System.out.print("\n");
		}

		if (r == 8)
		{
		System.out.print("3 5");
		System.out.print("\n");
		}

		if (r == 10)
		{
		System.out.print("3 7");
		System.out.print("\n");
		}

		if (r == 12)
		{
		System.out.print("5 7");
		System.out.print("\n");
		}

		if (r == 15)
		{
		System.out.print("3 5 7");
		System.out.print("\n");
		}

		if ((a % 3) * (a % 5) * (a % 7) != 0)
		{
		System.out.print("n");
		System.out.print("\n");
		}



		return 0;
	}

}

