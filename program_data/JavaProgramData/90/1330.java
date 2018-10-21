package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n,int l)
	{
		int c = 0;
		if (n > 1)
		{
			int i;
			for (i = 0;i <= l;i++)
			{
			if (m - i >= 0)
			{
			c = c + f(m - i, n - 1, i);
			}
			}
		}
		else if (m <= l)
		{
		c = 1;
		}
		else
		{
		c = 0;
		}
		return c;
	}
	public static int Main()
	{
		int[] m = new int[21];
		int[] n = new int[21];
		int p;
		int w;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (w = 1;w <= t;w++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m[w - 1] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n[w - 1] = Integer.parseInt(tempVar3);
		}
		}
		for (w = 1;w <= t;w++)
		{
			p = f(m[w - 1], n[w - 1], m[w - 1]);
			System.out.printf("%d\n",p);
		}
		return 0;
	}
}

