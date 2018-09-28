package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int first;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (6 - n > 0)
	{
		first = 6 - n;
	}
	else
	{
		first = 13 - n;
	}

	if ((13 - first) % 7 == 0)
	{
		System.out.print("1\n");
	}
	if ((13 + 31 - first) % 7 == 0)
	{
		System.out.print("2\n");
	}
	if ((13 + 31 + 28 - first) % 7 == 0)
	{
		System.out.print("3\n");
	}
	if ((13 + 31 + 28 + 31 - first) % 7 == 0)
	{
		System.out.print("4\n");
	}
	if ((13 + 31 + 28 + 31 + 30 - first) % 7 == 0)
	{
		System.out.print("5\n");
	}
	if ((13 + 31 + 28 + 31 + 30 + 31 - first) % 7 == 0)
	{
		System.out.print("6\n");
	}
	if ((13 + 31 + 28 + 31 + 30 + 31 + 30 - first) % 7 == 0)
	{
		System.out.print("7\n");
	}
	if ((13 + 31 + 28 + 31 + 30 + 31 + 30 + 31 - first) % 7 == 0)
	{
		System.out.print("8\n");
	}
	if ((13 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 - first) % 7 == 0)
	{
		System.out.print("9\n");
	}
	if ((13 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 - first) % 7 == 0)
	{
		System.out.print("10\n");
	}
	if ((13 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 - first) % 7 == 0)
	{
		System.out.print("11\n");
	}
	if ((13 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 - first) % 7 == 0)
	{
		System.out.print("12\n");
	}


	return 0;
	}
}

