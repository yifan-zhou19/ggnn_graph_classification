package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int[] a = new int[1000];
	public static int[] b = new int[100];

	public static void scan(int[] p1, int l1, int[] p2, int l2)
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			l1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			l2 = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < l1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1[i] = tempVar3;
			}
		}
		for (i = 0;i < l2;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p2[i] = tempVar4;
			}
		}
	}

	public static void paixu(int[] p, int l)
	{
		int t;
		int i;
		int j;
		for (i = 1;i < l;i++)
		{
			for (j = 0;j < l - i;j++)
			{
				if (p[j] > p[j + 1])
				{
					t = p[j];
					p[j] = p[j + 1];
					p[j + 1] = t;
				}
			}
		}
	}

	public static void hebing(int[] p1, int l1, int[] p2, int l2)
	{
		int i;
		for (i = l1;i < l1 + l2;i++)
		{
			p1[i] = p2[i - l1];
		}
	}

	public static void print(int[] p, int l)
	{
		int i;
		for (i = 0;i < l;i++)
		{
			System.out.printf("%d%c",p[i],(i == l - 1)?'\n':' ');
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
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < m;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		paixu(a, n);
		paixu(b, m);
		hebing(a, n, b, m);
		print(a, m + n);
	}




}

