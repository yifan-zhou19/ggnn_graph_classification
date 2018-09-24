package <missing>;

public class GlobalMembers
{
	public static int l;
	public static int n;
	public static int[] a = new int[30];
	public static void measure(int k,int s,int m)
	{
		int i;
		if (k == n)
		{
			if (s > l)
			{
				l = s;
			}
		}
		else
		{
				for (i = k + 1;i <= n;i++)
				{
					if (a[i - 1] <= m)
					{
						measure(i, s + 1, a[i - 1]);
					}
				}
				measure(n, s, m);
		}
	}

	public static void Main()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		measure(0, 0, 10000);
		System.out.printf("%d\n",l);
	}
}

