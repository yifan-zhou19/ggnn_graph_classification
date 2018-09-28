package <missing>;

public class GlobalMembers
{
	public static int pd(int k)
	{
		int a;
		int j;
			for (j = 2;j <= (Math.sqrt(k));j++)
			{
				if (k % j == 0)
				{
					break;
				}
			}
			if (j > (Math.sqrt(k)))
			{
				a = 1;
			}
			else
			{
				a = 0;
			}
		return (a);
	}
	public static void fj(int n)
	{
		int i;
		int m;
		for (i = 3;i < n;i = i + 2)
		{
			m = n - i;
			if (pd(i) > 0 && pd(m) > 0)
			{
				System.out.printf("%ld=%ld+%ld\n",n,i,m);
				break;
			}
		}
	}
	public static void Main()
	{
		int h;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		for (b = 6;b <= h;b = b + 2)
		{
			fj(b);
		}
	}
}

