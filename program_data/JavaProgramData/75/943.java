package <missing>;

public class GlobalMembers
{
	public static int input(int[] a, int[] b, int[] c)
	{
		int m = 0;
		int small;
		int big;
		char cd;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[m] = Integer.parseInt(tempVar);
		}
		small = a[m];
		while ((cd = System.in.read()) != '\n')
		{
			m = m + 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[m] = Integer.parseInt(tempVar2);
			}
			if (a[m] < small)
			{
				small = a[m];
			}
		}
		m = 0;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[m] = Integer.parseInt(tempVar3);
		}
		big = b[m];
		while ((cd = System.in.read()) != '\n')
		{
			m = m + 1;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[m] = Integer.parseInt(tempVar4);
			}
			if (b[m] > big)
			{
				big = b[m];
			}
		}
		c[0] = small;
		c[1] = big;
		return (m + 1);
	}

	public static void count(int[] a, int[] b, int[] d, int r)
	{
		int i;
		int j;
		for (i = 0;i < r;i++)
		{
			for (j = a[i];j < b[i];j++)
			{
				d[j]++;
			}
		}

	}
	public static int maxi(int[] c, int[] d)
	{
		int i;
		int max = d[c[0]];
		for (i = c[0] + 1;i < c[1];i++)
		{
			if (d[i] > max)
			{
				max = d[i];
			}
		}
		return max;


	}
	public static void Main()
	{
		int[] a = new int[N];
		int[] b = new int[N];
		int[] d = new int[1001];
		int[] c = new int[2];
		int i = 0;
		int r;
		int max;
		r = input(a, b, c);
		count(a, b, d, r);
		max = maxi(c, d);
		System.out.printf("%d %d",r,max);


	}
}

