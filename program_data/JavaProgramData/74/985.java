package <missing>;

public class GlobalMembers
{
	public static int isreverse(int num)
	{
		int num_r = 0;
		int __num = num;
		while (num != 0)
		{
			num_r = num_r * 10 + num % 10;
			num /= 10;
		}
		if (num_r == __num)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void getprime(int[] prime)
	{
		prime[0] = 0;
		prime[1] = 0;
		int i;
		int j;
		for (i = 2; i < LIMIT; i++)
		{
			prime[i] = 1;
		}
		for (i = 2; i < LIMIT; i++)
		{
			if (prime[i] != 0)
			{
				for (j = i * i; j < LIMIT; j += i)
				{
					prime[j] = 0;
				}
			}
		}
	}
	public static void Main()
	{
		int i;
		int flag = 1;
		int[] prime = new int[LIMIT];
		getprime(prime);
	//	for (i=0; i<LIMIT; i++)
	//	{
	//		if (prime[i])
	//			printf("%d ", i);
	//	}
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (prime[i] != 0 && isreverse(i) != 0 && flag != 0)
			{
				System.out.printf("%d",i);
				flag = 0;
			}
			else if (prime[i] != 0 && isreverse(i) != 0)
			{
				System.out.printf(",%d",i);
			}
		}
		if (flag == 1)
		{
			System.out.print("no");
		}

	}
}

