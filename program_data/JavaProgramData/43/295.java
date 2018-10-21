package <missing>;

public class GlobalMembers
{
	public static int isprime(int p)
	{
		int i;
		int isprime = 1;
		if (p % 2 == 0)
		{
			if (p == 2)
			{
			return isprime;
			}
		isprime = 0;
		return isprime;
		}

		for (i = 3;i < p;i = i + 2)
		{
			if (p % i == 0)
			{
			isprime = 0;
			break;
			}
		}
		return isprime;

	}
	public static int Main()
	{
		int m;
		int a;
		int b;
		int prime1;
		int prime2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (a = 3;a <= m / 2;a = a + 2)
		{
			b = m - a;
			prime1 = isprime(a);
			prime2 = isprime(b);
			if (prime1 != 0 && prime2 != 0)
			{
				System.out.printf("%d %d\n",a,b);
			}


		}

		return 0;
	}
}

