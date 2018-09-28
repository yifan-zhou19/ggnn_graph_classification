package <missing>;

public class GlobalMembers
{
	public static int power(int a,int b)
	{
		int i;
		int pro = 1;
		for (i = 1;i <= b;i++)
		{
		pro *= a;
		}
		return pro;
	}
	public static int Main()
	{
		int n;
		int k;
		int m;
		int a;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		p = power(n - 1, n - 1);
		q = power(n, n - 1);
		a = p - k;
		while (a <= 0)
		{
			a += p;
		}
		m = n * ((a + k) / p * q - k) + k;
		System.out.printf("%ld\n",m);
		return 0;
	}
}

