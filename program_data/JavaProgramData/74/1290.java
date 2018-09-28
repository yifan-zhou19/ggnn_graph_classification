package <missing>;

public class GlobalMembers
{
	public static int su(int n)
	{
		int i;
		int t = 0;
		for (i = 2;i < n;i++)
		{
			if (n % i == 0)
			{
				t++;
			}
		}
		if (t == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int hui(int n)
	{
		int o = 0;
		int q = 0;
		q = n;
		while (true)
		{
			o = 10 * o + q % 10;
			q = q / 10;
			if (q == 0)
			{
				break;
			}
		}
			if (n == o)
			{
				return 1;
			}
			else
			{
				return 0;
			}

	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int[] a = new int[10000];
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (su(i) == 1 && hui(i) == 1)
			{
				a[k] = i;
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 0;i < k - 1;i++)
			{
				System.out.printf("%d,",a[i]);
			}
			System.out.printf("%d",a[k - 1]);
		}
		System.out.print("\n");
		return 0;
	}

}

