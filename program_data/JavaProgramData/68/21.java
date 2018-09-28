package <missing>;

public class GlobalMembers
{
	public static int isprime(int x)
	{
		if (x == 1)
		{
			return 0;
		}
		if (x == 2)
		{
			return 1;
		}
		for (int i = 2;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		for (i = 6;i <= n;i = i + 2)
		{
			for (j = 3;j <= i / 2;j = j + 2)
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

