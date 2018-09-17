package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int factor = new int(int n,int x);
		int n;
		int i;
		int m;
		int[] a = new int[100];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			a[i] = factor(n, 2);
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
		return 0;
	}

	public static int factor(int n,int x)
	{
		int i;
		int f = 0;

		if (n == 1)
		{
			f = 1;
		}
		else
		{
			for (i = x;i <= n;i++)
			{
				if (n % i == 0)
				{
					f += factor(n / i, i);
				}
			}
		}
		return f;
	}
}

