package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n; //n??????????

		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));

		if ((int)(n / 3) == (n / 3) && (int)(n / 5) == (n / 5) && (int)(n / 7) == (n / 7))
		{
			System.out.print("3 5 7");
			System.out.print("\n");
		}

		else if ((int)(n / 3) == (n / 3) && (int)(n / 5) == (n / 5) && (int)(n / 7) != (n / 7))
		{
			System.out.print("3 5");
			System.out.print("\n");
		}

		else if ((int)(n / 3) == (n / 3) && (int)(n / 5) != (n / 5) && (int)(n / 7) == (n / 7))
		{
			System.out.print("3 7");
			System.out.print("\n");
		}

		else if ((int)(n / 3) != (n / 3) && (int)(n / 5) == (n / 5) && (int)(n / 7) == (n / 7))
		{
			System.out.print("5 7");
			System.out.print("\n");
		}

		else if ((int)(n / 3) != (n / 3) && (int)(n / 5) != (n / 5) && (int)(n / 7) == (n / 7))
		{
			System.out.print("7");
			System.out.print("\n");
		}

		else if ((int)(n / 3) != (n / 3) && (int)(n / 5) == (n / 5) && (int)(n / 7) != (n / 7))
		{
			System.out.print("5");
			System.out.print("\n");
		}

		else if ((int)(n / 3) == (n / 3) && (int)(n / 5) != (n = 5) && (int)(n / 7) != (n = 7))
		{
			System.out.print("3");
			System.out.print("\n");
		}

		else if ((int)(n / 3) != (n / 3) && (int)(n / 5) != (n / 5) && (int)(n / 7) != (n / 7))
		{
			System.out.print("n");
			System.out.print("\n");
		}
		return 0;
	}


}

