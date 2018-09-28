package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //???????????
		int i = 0;
		int[] b = {3, 5, 7};
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a % 3 == 0 && a % 5 == 0 && a % 7 == 0)
		{
			System.out.print("3");
			System.out.print(" ");
			System.out.print("5");
			System.out.print(" ");
			System.out.print("7");
		}
		else if (a % 3 == 0 && a % 7 == 0 && a % 5 != 0)
		{
			System.out.print("3");
			System.out.print(" ");
			System.out.print("7");
		}
		else if (a % 3 != 0 && a % 5 == 0 && a % 7 == 0)
		{
			System.out.print("5");
			System.out.print(" ");
			System.out.print("7");
		}
		else if (a % 3 == 0 && a % 5 == 0 && a % 7 != 0)
		{
			System.out.print("3");
			System.out.print(" ");
			System.out.print("5");
		}
		else if (a % 3 == 0 && a % 5 != 0 && a % 7 != 0)
		{
			System.out.print("3");
		}
		else if (a % 3 != 0 && a % 5 == 0 && a % 7 != 0)
		{
			System.out.print("5");
		}
		else if (a % 3 != 0 && a % 5 != 0 && a % 7 == 0)
		{
			System.out.print("7");
		}
		else if (a % 3 != 0 && a % 5 != 0 && a % 7 != 0) //?????3,5,7?????
		{
			System.out.print("n");
		}
		return 0; //?????
	}
}

