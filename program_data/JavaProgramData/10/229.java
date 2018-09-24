package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[max + 10];
	public static int[] b = new int[max + 10];
	public static int[] maxlen = new int[max + 10];
	public static void Main()
	{
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
			b[n + 1 - i] = a[i];
		}
		maxlen[1] = 1;
		for (i = 2;i <= n;i++)
		{
			int tmp = 0;
			for (j = 1;j < i;j++)
			{
				if (b[i] >= b[j])
				{
					if (tmp < maxlen[j])
					{
						tmp = maxlen[j];
					}
				}
			}
			maxlen[i] = tmp + 1;
		}
		int nmax = -1;
		for (i = 1;i <= n;i++)
		{
			if (nmax < maxlen[i])
			{
				nmax = maxlen[i];
			}
		}
		System.out.printf("%d",nmax);
	}
}

