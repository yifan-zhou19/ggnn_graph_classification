package <missing>;

public class GlobalMembers
{
	public static int prime(int k)
	{
		int p = 1;
	for (int i = 2;i <= Math.sqrt(k);i++)
	{
	if (k % i == 0)
	{
		p = 0;
		break;
	}
	}
	return p;
	}
	public static int Main()
	{
	int n;
	int f = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 5;i <= n;i++)
	{
	if (prime(i) != 0 && prime(i - 2) != 0)
	{
		System.out.printf("%d %d\n",i - 2,i);
		f = 0;
	}
	}
	if (f != 0)
	{
		System.out.print("empty");
	}
	}
}

