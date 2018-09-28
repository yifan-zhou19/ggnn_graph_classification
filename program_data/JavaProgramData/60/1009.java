package <missing>;

public class GlobalMembers
{
	public static int isprime(int n)
	{
		int i;
		if (n == 3)
		{
			return 1;
		}
		for (i = 3;i < n;i += 2)
		{
			if (n % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static void Main()
	{
		int n;
		int i;
		int last_isprime = 0;
		int this_isprime;
		int empty = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n;i += 2)
		{
			this_isprime = isprime(i);
			if (last_isprime != 0 && this_isprime != 0)
			{
				System.out.printf("%d %d\n",i - 2,i);
				empty = 0;
			}
			last_isprime = this_isprime;
		}
		if (empty != 0)
		{
			System.out.print("empty\n");
		}
	}

}

