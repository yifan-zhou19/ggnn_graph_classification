package <missing>;

public class GlobalMembers
{
	public static int isprime(int a)
	{
		int i;
		int k;
		if (a % 2 == 0)
		{
			return 0;
		}
		k = (int)Math.sqrt(a);
		for (i = 3;i <= k;i = i + 2)
		{
			if (a % i == 0)
			{
				return 0;
			}
		}

		return 1;
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
		for (i = 6;i <= n;i = i + 2)
		{
			for (j = 2;j <= i / 2;j++)
			{
				if (isprime(j) != 0 && isprime(i - j) != 0)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					break;
				}
			}
		}

		return 0;
	}

}

