package <missing>;

public class GlobalMembers
{
	public static int IsPrime(int m)
	{
		int high;
		int i;
		high = Math.sqrt(m);
		for (i = 3;i <= high;i += 2) //?????m????
		{
			if (m % i == 0)
			{
				break;
			}
		}
		if (i > high)
		{
			return 1;
		}
		return 0;
	}
	public static void Out2prime(int m)
	{
		int a;
		int b;
		for (a = 3;a <= m / 2;a += 2)
		{
			b = m - a;
			if (IsPrime(a) != 0 && IsPrime(b) != 0)
			{
				System.out.printf("%d=%d+%d\n",m,a,b);
				break;
			}
		}
	}
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i += 2)
		{
			Out2prime(i);
		}
		return 0;
	}
}

