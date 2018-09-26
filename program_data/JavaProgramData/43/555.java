package <missing>;

public class GlobalMembers
{
	public static int prime(int n)
	{
	int i;
	double k = Math.sqrt((double)n);
	for (i = 2;i <= k;i++)
	{
	if (n % i == 0)
	{
		break;
	}
	}
	if (i > k)
	{
		return 1;
	}
	else
	{
		return 0;
	}
	}
	public static int Main()
	{
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	int i;
	for (i = 3;i <= m / 2;i += 2)
	{
	if (prime(i) != 0 && prime(m - i) != 0)
	{
		System.out.printf("%d %d\n",i,m - i);
		continue;
	}
	}
	return 0;
	}
}

