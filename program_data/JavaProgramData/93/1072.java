package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
	int k;
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (k % 3 == 0 && k % 5 == 0 && k % 7 == 0) //?????????
	{
		System.out.print("3");
		System.out.print(" ");
		System.out.print("5");
		System.out.print(" ");
		System.out.print("7");
	}
	else if (k % 3 == 0 && k % 5 != 0 && k % 7 != 0)
	{
		System.out.print("3");
	}
	else if (k % 3 != 0 && k % 5 == 0 && k % 7 != 0)
	{
		System.out.print("5");
	}
	else if (k % 3 != 0 && k % 5 != 0 && k % 7 == 0)
	{
		System.out.print("7");
	}
	else if (k % 3 != 0 && k % 5 != 0 && k % 7 != 0)
	{
		System.out.print("n");
	}

	else if (k % 3 == 0)
	{
		if (k % 5 == 0)
		{
			System.out.print("3");
			System.out.print(" ");
			System.out.print("5");
		}
		else
		{
			System.out.print("3");
			System.out.print(" ");
			System.out.print("7");
		}
	}
	else
	{
		System.out.print("5");
		System.out.print(" ");
		System.out.print("7");
	}
	return 0; //??????
	}

}

