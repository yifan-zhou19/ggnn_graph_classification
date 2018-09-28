package <missing>;

public class GlobalMembers
{
	public static int isprimenumber(int m)
	{
		int i;
		int isprime = 1;
		if (m % 2 == 0)
		{
			if (m == 2)
			{
			return isprime;
			}
			isprime = 0;
			return isprime;
		}
		for (i = 3;i <= Math.sqrt(m);i = i + 2)
		{
			if (m % i == 0)
			{
				isprime = 0;
				break;
			}
		}
		return isprime;
	}

	public static void gb(int a)
	{
		int j;
		System.out.printf("%d=",a);
		for (j = 2;j <= (a / 2);j = j + 1)
		{
			if ((isprimenumber(j)) != 0 && (isprimenumber(a - j)) != 0)
			{
				System.out.printf("%d+%d\n",j,a - j);
				break;
			}
		}
	}

	public static int Main()
	{
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 6;k <= n;k = k + 2)
		{
			gb(k);
		}
		return 0;
	}




}

