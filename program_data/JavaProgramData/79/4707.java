package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int i;
		int k = 0;
		for (i = 2;i <= n;i++)
		{
		k = ((m % i) + k) % i;
		}
		return k;
	}
	public static int Main()
	{
		int m;
		int n;
		m = 1;
		n = 1;
		while ((m > 0) && (n > 0))
		{
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
		if ((m > 0) && (n > 0))
		{
			System.out.printf("%d\n",f(n, m) + 1);
		}
		}
		return 0;
	}



}

