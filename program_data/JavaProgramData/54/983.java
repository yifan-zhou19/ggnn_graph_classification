package <missing>;

public class GlobalMembers
{
	public static int applenum(int n,int k)
	{
		int m = 1;
		int i;
		int t = 0;
		int z;

		for (m = n + k;;m += n)
		{
			t = m;
			for (i = 0;i < n;i++)
			{
				if (t % n == k)
				{
					t = t - k - t / n;
				}
				else
				{
					break;
				}
			}
			if (i == n && t >= 1)
			{
				z = m;
				break;
			}
		}

		return z;
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

		m = applenum(n, k);

		System.out.printf("%d",m);

		return 0;
	}
}

