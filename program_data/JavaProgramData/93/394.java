package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num = 0; //??????NUM
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (num % 105 == 0)
		{
			System.out.print("3 5 7");
		}
		if (num % 15 == 0 && num % 7 != 0)
		{
			System.out.print("3 5");
		}
		if (num % 21 == 0 && num % 5 != 0)
		{
			System.out.print("3 7");
		}
		if (num % 35 == 0 && num % 3 != 0)
		{
			System.out.print("5 7");
		}
		if (num % 3 == 0 && num % 5 != 0 && num % 7 != 0)
		{
			System.out.print("3");
		}
		if (num % 3 != 0 && num % 5 == 0 && num % 7 != 0)
		{
			System.out.print("5");
		}
		if (num % 3 != 0 && num % 5 != 0 && num % 7 == 0)
		{
			System.out.print("7");
		}
		if (num % 3 != 0 && num % 5 != 0 && num % 7 != 0)
		{
			System.out.print("n");
		}
		return 0;
	}

}

