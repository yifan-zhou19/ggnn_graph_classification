package <missing>;

public class GlobalMembers
{
	public static int minm(int n, int k)
	{
		int i;
		int j;
		int m;
		m = n - 1;
		for (j = 1;;j++)
		{
			m = j * (n - 1);
			for (i = 1;i <= n;i++)
			{
				if (m % (n - 1) != 0)
				{
					break;
				}
				m = m + m / (n - 1) + k;
				if (i == n)
				{
					return m;
				}
			}
		}
	}
	public static void Main()
	{
		int n;
		int k;
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
		System.out.printf("%d\n",minm(n, k));
	}
}

