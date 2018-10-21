package <missing>;

public class GlobalMembers
{
	public static int[] m = new int[30];
	public static int[] n = new int[30];
	public static int[] result = new int[30];
	public static int saintseiya(int m,int n)
	{
		int z;
		if (m > 1 && n > 1 && m >= n)
		{
		z = saintseiya(m, n - 1) + saintseiya(m - n, n);
		}
		if (m > 1 && n > 1 && m < n)
		{
			z = saintseiya(m, m);
		}
		if (m == 1)
		{
		z = 1;
		}
		if (n == 1)
		{
		z = 1;
		}
		if (m == 0)
		{
		z = 1;
		}
		return (z);
	}
	public static void Main()
	{
		int i;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			d = Integer.parseInt(tempVar);
		}
		for (i = 0;i < d;i++)
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
		for (i = 0;i < d;i++)
		{
		result[i] = saintseiya(m[i], n[i]);
		}
		for (i = 0;i < d;i++)
		{
		System.out.printf("%d\n",result[i]);
		}
	}
}

