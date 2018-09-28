package <missing>;

public class GlobalMembers
{
	public static void a(int[] s, int x)
	{
		int i;
		for (i = 1;i <= x;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s[i] = Integer.parseInt(tempVar);
		}
		}
	}
	public static void b(int[] s, int x)
	{
		int i;
		int j;
		for (i = 1;i <= x - 1;i++)
		{
			for (j = 1;j <= x - i;j++)
			{
				if (s[j] > s[j + 1])
				{
					s[0] = s[j];
					s[j] = s[j + 1];
					s[j + 1] = s[0];
				}
			}
		}
	}
	public static void c(int[] p, int x, int[] q, int y)
	{
		int i;
		for (i = 1;i <= y;i++)
		{
			p[x + i] = q[i];
		}
	}
	public static void d(int[] s, int x)
	{
		int i;
		for (i = 1;i <= x - 1;i++)
		{
			System.out.printf("%d ",s[i]);
		}
		System.out.printf("%d\n",s[x]);
	}
	public static void Main()
	{
		int[] p = new int[60];
		int[] q = new int[30];
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
		a(p, m);
		a(q, n);
		b(p, m);
		b(q, n);
		c(p, m, q, n);
		d(p, m + n);
	}
}

