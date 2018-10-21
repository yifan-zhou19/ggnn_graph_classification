package <missing>;

public class GlobalMembers
{
	public static int prime(int n)
	{
		int i;
		int isprime = 1;
		for (i = 2;i * i <= n;i++)
		{
			if (n % i == 0)
			{
				isprime = 0;
				break;
			}
		}
		return isprime;
	}
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n / 2;i += 2)
		{
			a = prime(i);
			b = prime(n - i);
			if (a == 1 && b == 1)
			{
				System.out.printf("%d %d\n",i,n - i);
			}
		}
		System.in.read();
		System.in.read();
	}

}

