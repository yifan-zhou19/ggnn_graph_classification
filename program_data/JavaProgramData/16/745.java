package <missing>;

public class GlobalMembers
{
	public static void p(int num)
	{
	while (num != 0)
	{
	System.out.print(num % 10);
	num /= 10;
	}
	}
	public static int Main()
	{
	int l;
	l = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (l != 0)
	{
	p(l);
	}
	else
	{
	System.out.print(0);
	}
	return 0;
	}
}

