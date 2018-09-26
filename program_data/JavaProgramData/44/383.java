package <missing>;

public class GlobalMembers
{
	public static long reverse(int n)
	{
	int flag = 0;
	if (n < 0)
	{
	flag = 1,n = -n;
	}
	int a = 1;
	int t = 0;
	int n1 = 0;
	while (10 * a <= n)
	{
	a *= 10,t++;
	}
	for (int i = 0;i <= t;i++)
	{
	n1 += n / a * (int)Math.pow((double)10,i),n %= a,a /= 10;
	}
	if (flag == 1)
	{
	n1 = -n1;
	}
	return n1;
	}

	public static int Main()
	{
			int n;
	for (int i = 1;i <= 6;i++)
	{
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.out.print(reverse(n));
	System.out.print("\n");
	}
			return 0;
	}
}

