package <missing>;

public class GlobalMembers
{
	public static int huiwen(int m, int n)
	{
		if (m == 0)
		{
			return (n);
		}
		else
		{
			return (huiwen(m / 10, n * 10 + m % 10));
		}
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int p = 0;
		int q = 1;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int[] c = new int[10000];
		int x = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					p++;
				}
			}
			if (p == 0)
			{
				a[q++] = i;
			}
			p = 0;
		}
		for (i = 1;i <= q - 1;i++)
		{
			b[i] = huiwen(a[i], 0);
			if (b[i] == a[i])
			{
				c[x] = b[i];
				x++;
			}
		}
		if (x != 1)
		{
		for (i = 1;i <= x - 2;i++)
		{
			System.out.printf("%d,",c[i]);
		}
		System.out.printf("%d",c[i]);
		}
		if (x == 1)
		{
			System.out.print("no");
		}
	}
}

