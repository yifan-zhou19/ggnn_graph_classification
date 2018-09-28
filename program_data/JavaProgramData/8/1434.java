package <missing>;

public class GlobalMembers
{
	public static void shuru(int[] a, int[] b, int m, int n)
	{
		int[] p = a;
		int[] q = b;
		int i;
		int j;
		for (i = 0;i < m;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p = Integer.parseInt(tempVar);
			}
			p++;
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				q = Integer.parseInt(tempVar2);
			}
			q++;
		}
	}
	public static void paixu(int[] a, int m)
	{
		int[] p = a;
		int b;
		int c;
		int d;
		for (b = 0;b < m - 1;b++)
		{
			for (c = 0;c < m - 1 - b;c++)
			{
				if (p[c] > p[c + 1])
				{
					d = p[c];
					p[c] = (p + c + 1);
					p[c + 1] = d;
				}
			}
		}
	}
	public static void hebing(int[] a, int[] b, int[] c, int m, int n)
	{
		int[] r = a;
		int[] s = b;
		int[] t = c;
		int p;
		int q;
		for (p = 0;p < m;p++)
		{
			t[p] = r[p];
		}
		for (q = 0;q < n;q++)
		{
			t[m + q] = s[q];
		}
	}
	public static void shuchu(int[] a, int b)
	{
		int c;
		System.out.printf("%d",a[0]);
		for (c = 1;c < b;c++)
		{
			System.out.printf(" %d",a[c]);
		}
	}
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[2000];
		int m;
		int n;
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
		shuru(a, b, m, n);
		paixu(a, m);
		paixu(b, n);
		hebing(a, b, c, m, n);
		shuchu(c, m + n);
	}

}

