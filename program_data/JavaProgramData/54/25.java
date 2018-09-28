package <missing>;

public class GlobalMembers
{
	public static int n;
	public static void Main()
	{
		int k;
		int i;
		int q = 0;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		int f = new int(int x,int y);
		m = k + 1;
		for (;n != 2;)
		{
			if (m == 1)
			{
				q = 1;
				break;
			}
			else
			{
				if (m % (n - 1) != 0)
				{
					break;
				}
				if (m % (n - 1) == 0)
				{
					m = m / n - 1;
				}
			}
		}
		if (n == 2)
		{
			System.out.printf("%d\n",(k + 1) * f(n, n) - k * (n - 1));
		}
		else
		{
		if (q == 0)
		{
			System.out.printf("%d\n",f(n, n) - k * (n - 1));
		}
		else
		{
			System.out.printf("%d\n",m * f(n, n) - k * (n - 1));
		}
		}
	}
	public static int f(int x,int y)
	{
		int i;
		int s = 1;
		for (i = 1;i <= y;i++)
		{
			s = x * s;
		}
		return s;
	}
}

