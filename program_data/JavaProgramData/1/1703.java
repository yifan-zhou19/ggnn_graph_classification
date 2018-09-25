package <missing>;

public class GlobalMembers
{
	public static int s(int n,int m)
	{
	if (n == 1)
	{
		return 1;
	}
	int an = 0;
	for (int i = m;i > 1;i--)
	{
	if (n % i == 0)
	{
		an += s(n / i, Math.min(i,n / i));
	}
	}
	return an;
	}
	public static int Main()
	{
	int N;
	N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int x;
	for (N;N > 0;N--)
	{
	x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.out.print(s(x, x));
	System.out.print("\n");
	}
	return 0;
	}
}

