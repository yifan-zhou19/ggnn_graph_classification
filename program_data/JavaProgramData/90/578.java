package <missing>;

public class GlobalMembers
{
	public static int f(int m, int n)
	{
	if (n == 1 || m == 0)
	{
	return 1;
	}
	if (n > m)
	{
	return f(m, m);
	}
	return f(m, n - 1) + f(m - n, n);
	}

	public static void Main(String[] args)
	{
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (int i = 1;i <= k;i++)
	{
		int m;
		int n;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.out.print(f(m, n));
	System.out.print("\n");
	}
	System.in.read();
	System.in.read();
	}

}

