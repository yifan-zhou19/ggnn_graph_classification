package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int a;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}

	if (!(a % 3) && !(a % 5) && !(a % 7))
	{
		System.out.print("3 5 7\n");
	}

	else if (!(a % 3) && !(a % 5))
	{
		System.out.print("3 5\n");
	}

	else if (!(a % 3) && !(a % 7))
	{
		System.out.print("3 7\n");
	}

	else if (!(a % 5) && !(a % 7))
	{
		System.out.print("5 7\n");
	}

	else if (!(a % 3) && !(a % 7))
	{
		System.out.print("3 7\n");
	}

	else if (!(a % 3))
	{
		System.out.print("3\n");
	}

	else if (!(a % 5))
	{
		System.out.print("5\n");
	}

	else if (!(a % 7))
	{
		System.out.print("7\n");
	}

	else
	{
		System.out.print("n\n");
	}
	}


}

