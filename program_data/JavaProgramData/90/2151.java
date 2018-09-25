package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		if (n <= 0)
		{
		return 0;
		}
		if (n == 1)
		{
		return 1;
		}
		if (m < n)
		{
		return f(m, n - 1);
		}
		return f(m, n - 1) + f(m - n, n);

	}
	public static int Main()
	{
		int[] m = new int[20];
		int[] n = new int[20];
		int t;
		int i;
		int[] k = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
			k[i] = f(m[i], n[i]);
		}
		for (i = 0;i < t;i++)
		{
		System.out.printf("%d\n",k[i]);
		}
		return 0;
	}
}

