package <missing>;

public class GlobalMembers
{
	public static int isprime(int n)
	{
		int i;
		int j;
		j = 1;
		if (n != 2)
		{
		for (i = 2;i <= Math.sqrt(n);i++)
		{
		{
			if (n % i == 0)
			{
				j = 0;
				break;
			}
	}
		}
		}
		return j;
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 3;j <= n / 2;j++)
		{
			for (i = 3;i <= 2 * j - 1;i++)
			{
		if (isprime(i) != 0 && isprime(2 * j - i) != 0)
		{
			System.out.printf("%d=%d+%d\n",2 * j,i,2 * j - i);
			break;
		}
			}
		}

	}



}

