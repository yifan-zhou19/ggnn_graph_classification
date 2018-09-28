package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[20];
	public static int ans;

	public static int ss(int n,int m)
	{
		int i;
		if (n == 1 && m <= a[2])
		{
			ans++;
			return 0;
		}
		if (n == 1)
		{
			return 0;
		}
		for (i = 0;i <= m;i++)
		{
			if (i > a[n + 1])
			{
				break;
			}
			a[n] = i;
			ss(n - 1, m - i);
		}
		return 0;
	}

	public static int Main()
	{
		int n;
		int m;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int i;
		while (k > 0)
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
			for (i = 1;i <= n;i++)
			{
				a[i] = 0;
			}
			a[n + 1] = 100;
			ans = 0;
			ss(n, m);
			System.out.printf("%d\n",ans);
			k--;
		}
		return 0;
	}
}

