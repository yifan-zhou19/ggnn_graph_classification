package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num = 0;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		if ((num % 105) == 0)
		{
			System.out.print("3 5 7");
			System.out.print("\n");
		}
		else if (!(num % 35))
		{
			System.out.print("5 7");
			System.out.print("\n");
		}
		else if (!(num % 21))
		{
			System.out.print("3 7");
			System.out.print("\n");
		}
		else if (!(num % 15))
		{
			System.out.print("3 5");
			System.out.print("\n");
		}
		else if (!(num % 7))
		{
			System.out.print('7');
			System.out.print("\n");
		}
		else if (!(num % 5))
		{
			System.out.print('5');
			System.out.print("\n");
		}
		else if (!(num % 3))
		{
			System.out.print('3');
			System.out.print("\n");
		}
		else
		{
			System.out.print('n');
			System.out.print("\n");
		}

		return 0;
	}



}

