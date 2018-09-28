package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int m;
		int n;
		int i;
		int f = new int(int,int);
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
			System.out.printf("%d\n",f(m, n));
		}
	}

	public static int f(int m,int n)
	{
		int a;
		if (n == 1 || m == 0)
		{
			a = 1;
		}
		else
		{
			if (m < n)
			{
				a = f(m, m);
			}
		else
		{
			a = f(m, (n - 1)) + f((m - n), n);
		}
		}
		return a;
	}
}

