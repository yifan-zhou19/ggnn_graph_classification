package <missing>;

public class GlobalMembers
{
	public static int pa(int i)
	{
		int k;
		int t = 0;
		for (k = i - 1;k > 1;k--)
		{
			if (i % k == 0)
			{
				t++;
			}
		}
		return t;
	}
	public static int Main()
	{
		int m;
		int i;
		int p;
		int q;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;2 * i < m - 3;i++)
		{
			a = 2 * i + 1;
			b = m - 1 - 2 * i;
			p = pa(a);
			q = pa(b);
			if (p == 0 && q == 0 && a <= b)
			{
				System.out.printf("%d %d\n",a,b);
			}
		}
		return 0;
	}
}

