package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int count = new int(int m,int n);
		int t;
		int m;
		int n;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		while (t > 0)
		{
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
		z = count(m, n);
		System.out.printf("%d\n",z);
		t--;
		}
		return 0;
	}
	public static int count(int m,int n)
	{
		if ((n == 1) || (m == 1))
		{
			return (1);
		}
		else if (n > m)
		{
			return (count(m, n - 1));
		}
		else if (n == m)
		{
			return (1 + count(m, n - 1));
		}
		else
		{
			return (count(m, n - 1) + count(m - n, n));
		}
	}

}

