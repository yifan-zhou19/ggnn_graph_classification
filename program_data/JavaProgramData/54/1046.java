package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int divide_apple = new int(int n,int k);
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
		System.out.printf("%d\n",divide_apple(n, k));
		return 0;
	}
	public static int divide_apple(int n,int k)
	{
		int i;
		int sum;
		int m;
		for (sum = 1;;sum++)
		{
			m = sum;
			for (i = 1;i <= n;i++)
			{
				if (m % n == k)
				{
					m = m - m / n - k;
				}
				else
				{
					break;
				}
			}
			if (i > n && m >= 1)
			{
				return sum;
				break;
			}
		}
	}
}

