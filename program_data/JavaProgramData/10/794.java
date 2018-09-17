package <missing>;

public class GlobalMembers
{
	public static int xu(int[] a, int n, int k)
	{
		int i;
		int b = 0;
		for (i = k + 1;i < n;i++)
		{
			if (a[k] < a[i])
			{
				b++;
			}
		}
		for (i = 0;i < k;i++)
		{
			if (a[k] > a[i])
			{
				b = b + 1;
			}
		}
		return (b);
	}
	public static int max(int[] b, int n)
	{
		int i;
		int j;
		int k = 1;
		for (i = 0;i < n;i++)
		{
			k = 1;
			for (j = i;j < n;j++)
			{
				if (b[i] < b[j])
				{
					k = 0;
				}
			}
			if (k == 1)
			{
				return i;
			}
		}
	}
	public static int maxd(int[] b, int n)
	{
		int i;
		int j;
		int k = 1;
		for (i = 0;i < n;i++)
		{
			k = 1;
			for (j = i;j < n;j++)
			{
				if (b[i] < b[j])
				{
					k = 0;
				}
			}
			if (k == 1)
			{
				return (b[i]);
			}
		}
	}
	public static int shai(int[] a, int n)
	{
		int i;
		int j;
		int[] m = new int[30];

		for (i = 0;i < n;i++)
		{
			m[i] = xu(a, n, i);
			//printf("%d,%d\n",i,m[i]);

		}
		if (maxd(m, n) == 0)
		{
			return (n);
		}
		else
		{
			for (j = max(m, n);j < n;j++)
			{
				a[j] = a[j + 1];
			}
			shai(a, n - 1);
		}
	}
	public static int Main()
	{
		int k = 0;
		int[] a = new int[30];
		int lRet;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		lRet = shai(a, k);
		System.out.printf("%d",lRet);

		return (1);
	}
}

