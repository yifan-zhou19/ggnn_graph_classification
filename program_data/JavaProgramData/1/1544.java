package <missing>;

public class GlobalMembers
{
	public static int fib(int a, int e)
	{
		int j;
		int c;
		int d;
		c = 1;
		if (a <= e)
		{
			return 1;
		}
		for (j = e;j <= Math.sqrt(a);j++)
		{
			if (a % j == 0)
			{
				d = a / j;
				c = c + fib(d, j);
			}
		}
		return c;
	}
	public static int Main()
	{
		int n;
		int b;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",fib(b, 2));
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		return 0;
	}

}

