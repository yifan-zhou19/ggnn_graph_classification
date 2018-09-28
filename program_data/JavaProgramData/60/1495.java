package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int i;
		int k = 0;
		if (x > 1)
		{
		for (i = 1;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
			k += 1;
			}
		}
		if (k == 1)
		{
		return 1;
		}
		else
		{
		return 0;
		}
		}
	}
	public static int Main()
	{
		int n;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 4)
		{
		System.out.print("empty");
		}
		else
		{
			for (a = 1;a <= n - 2;a++)
			{
				 b = a + 2;
			if (f(a) == 1 && f(b) == 1)
			{
			System.out.printf("%d %d\n",a,b);
			}
			}
		}
	}

}

