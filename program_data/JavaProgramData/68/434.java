package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int prime = int a;
		int i;
		int n;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		n = 6;
		while (n <= i)
		{
		a = 3;
		while (a <= n / 2)
		{
			if (prime(a) == 0 && prime(n - a) == 0)
			{
			System.out.printf("%d=%d+%d\n",n,a,n - a);
			break;
			}
			else
			{
			a += 2;
			}
		}
		n += 2;
		}
		return 0;
	}
	public static int prime(int a)
	{
			int b;
			int c;
			b = 0;
			for (c = 2;c <= Math.sqrt(a);c++)
			{
				if (a % c == 0)
				{
					b = 1;
					break;
				}
			}
			return (b);
	}


}

