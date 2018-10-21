package <missing>;

public class GlobalMembers
{
	public static int way(int x,int m)
	{
		int sum = 0;
		int p = 0;
		int i;
		for (i = m;i < x;i++)
		{
			if (x % i == 0)
			{
				p++;
				sum = sum + way(x / i, i);
			}
		}
			sum = sum + 1;
		if (p == 0)
		{
			sum = 1;
		}
		if (m > x)
		{
			sum = 0;
		}
		return (sum);
	}
	public static int Main()
	{
		int n;
		int a;
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
				a = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",way(a, 2));
		}
		return 0;
	}
}

