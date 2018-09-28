package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int m;
		int re;
		int f = new int(int n,int k,int time,int m);
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
		m = 0;
		do
		{
			m++;
			re = f(n, k, n, m);
		}while (re < 0);
		System.out.printf("%d\n",re);
	}
	public static int f(int n,int k,int time,int m)
	{
		int z;
		int a;
		if (time > 1)
		{
			z = f(n, k, time-1, m);
			if (z == -1 || z % (n - 1) != 0)
			{
				a = -1;
			}
			else
			{
				a = n * z / (n - 1) + k;
			}

		}
		else
		{
			a = m * n + k;
		}
		return (a);
	}
}

