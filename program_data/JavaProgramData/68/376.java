package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int n;
		int i;
		int prime = int t;
		n = 6;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		while (n <= i)
		{
		for (x = 3;x <= n / 2;x = x + 2)
		{
			if (prime(x) != 0 && prime(n - x) != 0)
			{
				break;
			}
		}
			System.out.printf("%ld=%ld+%ld\n",n,x,n - x);
			n = n + 2;
		}
	}

	public static int prime(int t)
	{
		int g;
		int h;
		int k;
		k = Math.sqrt(t);
		for (h = 2;h <= k;h++)
		{
			if (t % h == 0)
			{
				break;
			}
		}
			if (h > k)
			{
				g = 1;
			}
			else
			{
				g = 0;
			}
			return (g);
	}
}

