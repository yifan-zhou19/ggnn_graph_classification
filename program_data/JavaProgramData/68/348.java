package <missing>;

public class GlobalMembers
{
	public static int IsPrime(int m)
	{
		int k;
		int i;
		k = Math.sqrt(m);
		if (m == 2)
		{
			return 1;
		}
		if (m % 2 != 0)
		{
			for (i = 3;i <= k;i = i + 2)
			{
			   if (m % i == 0)
			   {
				 break;
			   }
			}
			if (i == k + 2 || i == k + 1)
			{
				 return 1;
			}
			else
			{
				return 0;
			}
		}
	}

	public static void f(int n)
	{
		int p;
		int q;
		int i;
		if (p == 2 && IsPrime(n - 2) == 1)
		{
			System.out.printf("%d=2+%d\n",n,n - 2);
		}
		for (i = 3;i <= n / 2;i++)
		{
			p = i;
			q = n - p;
			if (IsPrime(p) == 1 && IsPrime(q) == 1)
			{
				System.out.printf("%d=%d+%d\n",n,p,q);
				break;
			}
		}
	}

	public static void Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = 6;
		while (i <= n)
		{
			f(i);
			i = i + 2;
		};
	}
}

