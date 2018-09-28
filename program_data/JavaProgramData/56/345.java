package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int i;
		int a;
		int m;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			j = Integer.parseInt(tempVar);
		}
		i = (int)(j / 10000);
		a = (int)((j - i * 10000) / 1000);
		m = (int)((j - i * 10000 - a * 1000) / 100);
		k = (int)((j - i * 10000 - a * 1000 - m * 100) / 10);
		n = j - i * 10000 - a * 1000 - m * 100 - k * 10;
		if (i != 0)
		{
			System.out.printf("%d%d%d%d%d\n",n,k,m,a,i);
		}
		if (i == 0 && a != 0)
		{
			System.out.printf("%d%d%d%d\n",n,k,m,a);
		}
		if (i == 0 && a == 0 && m != 0)
		{
			System.out.printf("%d%d%d\n",n,k,m);
		}
		if (i == 0 && a == 0 && m == 0 && k != 0)
		{
			System.out.printf("%d%d\n",n,k);
		}
		if (i == 0 && a == 0 && m == 0 && k == 0)
		{
			System.out.printf("%d\n",n);
		}
		return 0;
	}

}

