package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n == 7)
	{
		System.out.print("1\n10");
	}
	if (n == 1)
	{
		System.out.print("4\n7");
	}
	if (n == 2)
	{
		System.out.print("9\n12");
	}
	if (n == 3)
	{
		System.out.print("6");
	}
	if (n == 4)
	{
		System.out.print("2\n3\n11");
	}
	if (n == 5)
	{
		System.out.print("8");
	}
	if (n == 6)
	{
		System.out.print("5");
	}
	if (n != 7 && n != 1 && n != 2 && n != 3 && n != 4 && n != 5 && n != 6)
	{
		System.out.print("0");
	}

	return 0;
	}
}

