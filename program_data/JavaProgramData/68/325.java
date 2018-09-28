package <missing>;

public class GlobalMembers
{
	public static int prime(int x)
	{
		int i;
		int isprime = 1;
		if (x == 3 || x == 5 || x == 7)
		{
			return isprime;
		}
		else
		{
			for (i = 3;i <= Math.sqrt(x);i = i + 2)
			{
				if (x % i == 0)
				{
					isprime = 0;
					return isprime;
					break;
				}
			}
		}
		return isprime;
	}

	public static int Main()
	{
		int a;
		int j;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= a;i = i + 2)
		{
			for (j = 3;j <= (a / 2);j = j + 2)
			{
				if (prime(j) + prime(i - j) == 2)
				{
					 System.out.printf("%d=%d+%d\n",i,j,i - j);
					 break;
				}
			}
		}
		return 0;
	}
}

