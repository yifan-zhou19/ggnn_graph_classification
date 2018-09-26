package <missing>;

public class GlobalMembers
{
	public static int apple(int m, int n)
	{
	if (m < 1 || n < 1)
	{
	return 0;
	}
	if (n == 1)
	{
	return 1;
	}
	else
	{
	return maxapple(m, n) + minapple(m, n);
	}
	}
	public static int maxapple(int m,int n)
	{
	if (m == n)
	{
	return 1;
	}
	if (n == 1)
	{
	return 1;
	}
	else
	{
		return apple(m - n, n);
	}
	}
	public static int minapple(int m,int n)
	{
	if (n == 2)
	{
	return 1;
	}
	if (n == 1)
	{
	return 0;
	}
	else
	{
	return apple(m, n - 1);
	}
	}
	public static int Main()
	{
	int i;
	int k;
	int m;
	int n;
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= k - 1;i++)
	{
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.out.print(apple(m, n));
	System.out.print("\n");
	}
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.out.print(apple(m, n));
	}

}

