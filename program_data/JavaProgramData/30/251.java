package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int s = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (;n > 0;n--)
	{
	if (n / 10 == 7 || n % 10 == 7 || n % 7 == 0)
	{
		continue;
	}
	else
	{
		s += n * n;
	}
	}
	System.out.print(s);
	return 0;
	}
}

