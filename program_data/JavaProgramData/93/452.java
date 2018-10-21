package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		i = Integer.parseInt(tempVar);
	}
	if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0)
	{
		System.out.print("3 5 7");
	}
	else
	{
	if (i % 15 == 0)
	{
		System.out.print("3 5");
	}
	else
	{
	if (i % 21 == 0)
	{
		System.out.print("3 7");
	}
	else
	{
	if (i % 35 == 0)
	{
		System.out.print("5 7");
	}
	else
	{
	if (i % 3 == 0)
	{
		System.out.print("3");
	}
	else
	{
	if (i % 5 == 0)
	{
		System.out.print("5");
	}
	else
	{
	if (i % 7 == 0)
	{
		System.out.print("7");
	}
	else
	{
		System.out.print("n");
	}
	}
	}
	}
	}
	}
	}
	return 0;
	}

}

