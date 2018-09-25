package <missing>;

public class GlobalMembers
{
	//****************************
	//* ?????3 5 7????  *
	//* by song liwei            *
	//****************************
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (k % 3 == 0 && k % 5 == 0 && k % 7 == 0)
		{
			System.out.print("3");
			System.out.print(" ");
			System.out.print("5");
			System.out.print(" ");
			System.out.print("7");
			System.out.print("\n");
		}
		else if (k % 3 == 0 && k % 5 == 0 && k % 7 != 0)
		{
			System.out.print("3");
			System.out.print(" ");
			System.out.print("5");
			System.out.print("\n");
		}
		else if (k % 3 == 0 && k % 5 != 0 && k % 7 == 0)
		{
			System.out.print("3");
			System.out.print(" ");
			System.out.print("7");
			System.out.print("\n");
		}
		else if (k % 3 != 0 && k % 5 == 0 && k % 7 == 0)
		{
			System.out.print("5");
			System.out.print(" ");
			System.out.print("7");
			System.out.print("\n");
		}
		else if (k % 3 == 0 && k % 5 != 0 && k % 7 != 0)
		{
			System.out.print("3");
			System.out.print("\n");
		}
		else if (k % 3 != 0 && k % 5 == 0 && k % 7 != 0)
		{
			System.out.print("5");
			System.out.print("\n");
		}
		else if (k % 3 != 0 && k % 5 != 0 && k % 7 == 0)
		{
			System.out.print("7");
			System.out.print("\n");
		}
		else
		{
			System.out.print("n");
			System.out.print("\n");
		}
			return 0;
	}
}

