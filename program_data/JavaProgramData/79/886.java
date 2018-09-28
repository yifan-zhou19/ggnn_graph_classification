package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int i;
	int a;
	while (true)
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n == 0)
	{
		break;
	}
	else
	{
		a = 0;
	if (n > 1)
	{
	for (i = 2;i <= n;i++)
	{
	a = (a + m) % i;
	}
	}
	System.out.print((a + 1));
	System.out.print("\n");
	}
	}
	return 0;
	}

}

