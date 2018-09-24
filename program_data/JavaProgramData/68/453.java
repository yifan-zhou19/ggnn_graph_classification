package <missing>;

public class GlobalMembers
{
	public static int isprime(int x)
	{
		int y;
		int s;
		s = Math.sqrt(x);
		for (y = 3;y <= s;y++)
		{
			if (x % y == 0)
			{
				return 0;
			}
		}
			if (y >= s + 1)
			{
				return 1;
			}
	}
	public static int Main()
	{
		int n;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = 6;
		while (a <= n)
		{
			int b;
			for (b = 3;b <= a / 2;b += 2)
			{
				if (isprime(b) != 0 && isprime(a - b) != 0)
				{
				System.out.printf("%d=%d+%d\n",a,b,a - b);
				break;
				}
			}
			a += 2;
		}
	}
}

