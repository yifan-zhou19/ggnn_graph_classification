package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double a = new double(int n,int k,int i,int m);
		int n;
		int k;
		int i;
		int s;
		int b;
		double j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 1;;i++)
		{
			j = a(n, k, i, n);
		b = (int)j;
		if (b == j)
		{
			s = (int)(n * j + k);
			break;
		}
		}
		System.out.printf("%d",s);
	}
	public static double a(int n,int k,int i,int m)
	{
		double c;
		if (m == 1)
		{
			c = i;
		}
		if (m > 1)
		{
			c = (n * a(n, k, i, m - 1) + k) / (n - 1);
		}
		return (c);
	}
}

