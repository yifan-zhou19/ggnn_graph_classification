package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (n-- != 0)
	{
	int a = 0;
	int b = 1;
	int c;
	int num;
	int re = 0;
	num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	num--;
	while (num-- != 0)
	{
	c = b;
	b = a + b;
	a = c;
	}
	System.out.print(b);
	System.out.print("\n");
	}
	return 0;
	}
}

