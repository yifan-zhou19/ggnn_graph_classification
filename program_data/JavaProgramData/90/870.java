package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int m,int n);
		int i;
		int x;
		int t;
		int[] m = new int[21];
		int[] n = new int[21];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= t;i++)
		{
			x = f(m[i], n[i]);
			System.out.printf("%d\n",x);
		}
	}


	public static int f(int m,int n)
	{
		if (n == 1 && m >= 0)
		{
			return 1;
		}
		else if (m < 0)
		{
			return 0;
		}
		else
		{
			return (f(m, n - 1) + f(m - n, n));
		}
	}
}

