package <missing>;

public class GlobalMembers
{
	public static int prime(int k)
	{
	int p = (int)Math.sqrt(k);
	int t;
	for (t = 3;t <= p;t += 2)
	{
	if (k % t == 0)
	{
		break;
	}
	}
	if (t > p)
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
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n <= 200000)
	{
	for (int i = 3;i <= n / 2;i += 2)
	{
	if (prime(i) != 0)
	{
	if (prime(n - i) != 0)
	{
	System.out.printf("%d %d\n",i,n - i);
	}
	}
	}
	}
	else
	{
		System.out.printf("%d",n);
	}
	}

}

