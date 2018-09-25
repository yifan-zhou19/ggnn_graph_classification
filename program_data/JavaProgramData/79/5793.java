package <missing>;

public class GlobalMembers
{
	public static int f(int n, int m)
	{
		int k = 0;
		int i;
		int j;
		for (i = 2;i <= n;i++) //???n-1??????????????????k????n??????k=(m%n+k)%n
		{
			k = (m % i + k) % i;
		}
		return k;
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
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
		while (n != 0 || m != 0)
		{
			System.out.printf("%d\n",f(n, m) + 1);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m = Integer.parseInt(tempVar4);
			}
		}
		return 0;
	}
}

