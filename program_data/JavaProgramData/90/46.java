package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int k;
		if (n == 0 || n == 1)
		{
			k = 1;
		}
		else if (m < n)
		{
			k = f(m, m);
		}
		else
		{
			k = f(m, n - 1) + f(m - n, n);
		}
		return (k);
	}
	public static void Main()
	{
		int t;
		int i;
		int p;
		int[] m = new int[20];
		int[] n = new int[20];
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
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < t;i++)
		{
			p = f(m[i], n[i]);
			System.out.printf("%d\n",p);
		}
	}
}

