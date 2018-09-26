package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int he = new int(int p,int q);
		int t;
		int m;
		int n;
		int i;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			sum = he(m, n);
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
	public static int he(int p,int q)
	{
		int kong = new int(int a,int b);
		int man = new int(int c,int d);
		int h;
		if (q == 1)
		{
			h = 1;
		}
		else
		{
			h = kong(p, q) + man(p, q);
		}
		return h;
	}
	public static int kong(int a,int b)
	{
		int he = new int(int p,int q);
		int e;
		if (b == 1)
		{
			e = 1;
		}
		else
		{
			e = he(a, b - 1);
		}
		return e;
	}
	public static int man(int c,int d)
	{
		int he = new int(int p,int q);
		int f;
		if (c < d)
		{
			f = 0;
		}
		else if (d == 1)
		{
			f = 1;
		}
		else
		{
			f = he(c - d, d);
		}
		return f;
	}
}

