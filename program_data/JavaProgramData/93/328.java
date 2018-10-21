package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n % 3 == 0)
	{
	System.out.print("3");
	i++;
	}

	if (n % 5 == 0 && i > 0)
	{
	System.out.print(" 5");
	i++;
	}
	else if (n % 5 == 0)
	{
	System.out.print("5");
	i++;
	}
	if (n % 7 == 0 && i > 0)
	{
	System.out.print(" 7");
	i++;
	}
	else if (n % 7 == 0)
	{
	System.out.print("7");
	i++;
	}

	if (i == 0)
	{
	System.out.print("n");
	}
	return 0;

	}

}

