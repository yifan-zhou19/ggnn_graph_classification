package <missing>;

public class GlobalMembers
{
	public static int sum;
	public static int work(int n,int m)
	{
		if (m > n)
		{
			m = n;
		}
		if (n == 1 || m == 1)
		{
			return 1;
		}
		if (n != 0 && m == 0)
		{
			return 0;
		}
		if (n == 0 && m != 0)
		{
			return 0;
		}
		if (n == 0 && m == 0)
		{
			return 1;
		}
		return work(n - m, m) + work(n, m - 1);
	}
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= c;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		System.out.printf("%d\n",work(a, b));
		}
	}

}

