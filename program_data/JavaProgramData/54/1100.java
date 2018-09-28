package <missing>;

public class GlobalMembers
{
	public static int apple(int n,int k)
	{
		int i;
		int j;
		int m;
		int a;
		m = 0;
		for (i = 1;1;i++)
		{
			if (m != 0)
			{
				break;
			}
			a = i * n + k;
			for (j = 2;j <= n;j++)
			{
				if (a % (n - 1) != 0)
				{
					a = 0;
					break;
				}
				a = (a * n / (n - 1)) + k;
			}
			if (a != 0)
			{
				m = a;
			}
		}
		return m;
	}
	public static int Main()
	{
		int n;
		int k;
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
			m = apple(n, k);
			System.out.printf("%d",m);

		return 0;
	}
}

