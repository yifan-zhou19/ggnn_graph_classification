package <missing>;

public class GlobalMembers
{
	public static final int N = 1010;

	public static int n;
	public static int m;
	public static int k;
	public static int[] q = new int[N];
	public static int[] f = new int[N];

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1; i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				q[i] = Integer.parseInt(tempVar2);
			}
		}
		q[0] = 1000000000;
		for (int i = 1; i <= n; i++)
		{
			for (int j = 0; j < i; j++)
			{
				if (q[j] >= q[i])
				{
					f[i] = Math.max(f[i], f[j] + 1);
				}
			}
		}
		int res = 0;
		for (int i = 1; i <= n ;i++)
		{
			res = Math.max(res, f[i]);
		}
		System.out.printf("%d\n", res);
		return 0;
	}

}

