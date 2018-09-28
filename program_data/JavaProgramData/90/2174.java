package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		t = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < t;i++)
	{
		int f = new int(int m,int n);
		int m;
		int n;
		int k;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		k = f(m, n);
		System.out.printf("%d\n",k);
	}
	}
	public static int f(int m,int n)
	{
		int g = new int(int p,int q);
		int y;
		if (n == 1)
		{
		   y = 1;
		}
		else
		{
			y = f(m, n - 1) + g(m, n);
		}
		return y;
	}
	public static int g(int p,int q)
	{
		int f = new int(int m,int n);
		int s;
		if (p < q)
		{
		   s = 0;
		}
		else if (q == p)
		{
		   s = 1;
		}
		else
		{
		   s = f(p - q, q);
		}
		return s;
	}

}

