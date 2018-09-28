package <missing>;

public class GlobalMembers
{
	public static int febonaqi(int a)
	{
	if (a == 1)
	{
		return 1;
	}
	else if (a == 2)
	{
		return 1;
	}
	else
	{
		return febonaqi(a - 1) + febonaqi(a - 2);
	}
	}
	public static int Main()
	{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (n > 0)
	{
	int s;
	s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.out.print(febonaqi(s));
	System.out.print("\n");
	n--;
	}
	return 0;
	}
}

