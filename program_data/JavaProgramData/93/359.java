package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num = 0; //???????num

		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (num % 3 == 0 && num % 5 == 0 && num % 7 == 0) //??num???3,5,7???????
		{
			System.out.print("3");
			System.out.print(" ");
			System.out.print("5");
			System.out.print(" ");
			System.out.print("7");
			System.out.print("\n");
		}
		else if (num % 3 == 0 && num % 5 == 0 && num % 7 != 0)
		{
			System.out.print("3");
			System.out.print(" ");
			System.out.print("5");
			System.out.print("\n");
		}
		else if (num % 3 == 0 && num % 5 != 0 && num % 7 == 0)
		{
			System.out.print("3");
			System.out.print(" ");
			System.out.print("7");
			System.out.print("\n");
		}
		else if (num % 3 != 0 && num % 5 == 0 && num % 7 == 0)
		{
			System.out.print("5");
			System.out.print(" ");
			System.out.print("7");
			System.out.print("\n");
		}
		else if (num % 3 == 0 && num % 5 != 0 && num % 7 != 0)
		{
			System.out.print("3");
			System.out.print("\n");
		}
		else if (num % 3 != 0 && num % 5 == 0 && num % 7 != 0)
		{
			System.out.print("5");
			System.out.print("\n");
		}
		else if (num % 3 != 0 && num % 5 != 0 && num % 7 == 0)
		{
			System.out.print("7");
			System.out.print("\n");
		}
		else if (num % 3 != 0 && num % 5 != 0 && num % 7 != 0)
		{
			System.out.print("n");
			System.out.print("\n");
		}
		return 0;


	}
}

