package <missing>;

public class GlobalMembers
{
	public static int max(int a,int b)
	{
		int c;
		c = a > b != 0?a:b;
		return (c);
	}
	public static void Main()
	{
		int i;
		int j;
		int n;
		int m;
		int[] a = new int[100];
		int[] f = new int[100];
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
		for (i = 0;i < n;i++)
		{
			f[i] = 0;
		}
		f[0] = 1;
		m = 0;
		for (i = 1;i < n;i++)
		{
			for (j = i;j >= 0;j--)
			{
				if (a[i] <= a[j])
				{
					f[i] = max(f[i], f[j] + 1);
				}
				if (f[i] > m)
				{
					m = f[i];
				}
			}
		}
		System.out.printf("%d\n",m);
	}

}

