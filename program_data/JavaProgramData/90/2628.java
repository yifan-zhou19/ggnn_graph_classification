package <missing>;

public class GlobalMembers
{
	public static int means(int m,int n)
	{
		if (n == 1)
		{
			return 1;
		}
		else
		{
			if (m == 0)
			{
				return 1;
			}
			else
			{
				if (m >= n)
				{
					return means(m, n - 1) + means(m - n, n);
				}
				else
				{
					return means(m, n - 1);
				}
			}
		}
	}

	public static void Main()
	{
		int t;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		while (t-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",means(m, n));
		}
	}
}

