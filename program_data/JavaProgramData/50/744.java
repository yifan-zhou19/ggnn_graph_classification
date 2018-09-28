package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int x = 1;x <= 12;x++)
	{
	if (x == 1)
	{
	a = (13 + n - 1) % 7;
	if (a == 5)
	{
		System.out.print("1\n");
	}
	}
	else if (x == 2)
	{
	a = (31 + 13 + n - 1) % 7;
	if (a == 5)
	{
		System.out.print("2\n");
	}
	}
	else if (x == 3)
	{
	a = (31 + 28 + 13 + n - 1) % 7;
	if (a == 5)
	{
		System.out.print("3\n");
	}
	}
	else if (x == 4)
	{
	a = (31 * 2 + 28 + 13 + n - 1) % 7;
	if (a == 5)
	{
		System.out.print("4\n");
	}
	}
	else if (x == 5)
	{
		a = (31 * 2 + 28 + 30 + 13 + n - 1) % 7;
	if (a == 5)
	{
		System.out.print("5\n");
	}
	}
	else if (x == 6)
	{
	a = (31 * 3 + 28 + 30 + 13 + n - 1) % 7;
	if (a == 5)
	{
		System.out.print("6\n");
	}
	}
	else if (x == 7)
	{
	a = (31 * 3 + 28 + 30 * 2 + 13 + n - 1) % 7;
	if (a == 5)
	{
		System.out.print("7\n");
	}
	}
	else if (x == 8)
	{
	a = (31 * 4 + 28 + 30 * 2 + 13 + n - 1) % 7;
	if (a == 5)
	{
		System.out.print("8\n");
	}
	}
	else if (x == 9)
	{
	a = (31 * 5 + 28 + 30 * 2 + 13 + n - 1) % 7;
	if (a == 5)
	{
		System.out.print("9\n");
	}
	}
	else if (x == 10)
	{
	a = (31 * 5 + 28 + 30 * 3 + 13 + n - 1) % 7;
	if (a == 5)
	{
		System.out.print("10\n");
	}
	}
	else if (x == 11)
	{
	a = (31 * 6 + 28 + 30 * 3 + 13 + n - 1) % 7;
	if (a == 5)
	{
		System.out.print("11\n");
	}
	}
	else if (x == 12)
	{
	a = (31 * 6 + 28 + 30 * 4 + 13 + n - 1) % 7;
	if (a == 5)
	{
		System.out.print("12\n");
	}
	}
	}
	return 0;
	}
}

