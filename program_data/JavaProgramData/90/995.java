package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int a = 1;
		if (m > 1 && n > 1 && m >= n)
		{
		a = f(m, n - 1) + f(m - n, n);
		}
		if (m > 1 && n > 1 && m < n)
		{
			a = f(m, n - 1);
		}
		return (a);
	}
	public static void Main()
	{
		int k;
		int[] m = new int[10];
		int[] n = new int[10];
		int[] y = new int[10];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < k;i++)
		{
			y[i] = f(m[i], n[i]);
		}
		for (i = 0;i < k;i++)
		{
		System.out.printf("%d\n",y[i]);
		}
	}
}

