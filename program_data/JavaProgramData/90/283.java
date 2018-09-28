package <missing>;

public class GlobalMembers
{
	public static int fang(int m, int n)
	{
	int sum;
	if (n == 1 || m == 1 || m == 0) //????
	{
	sum = 1;
	}
	else if (m < 0)
	{
	sum = 0;
	}
	else
	{
		sum = fang(m, n - 1) + fang(m - n, n); //???
	}
	return sum;
	}
	public static int Main()
	{
	int p;
	int i;
	int m;
	int n;
	p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= p;i++)
	{
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.out.print(fang(m, n));
	System.out.print("\n");
	}
	return 0;
	}
}

