package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int z;
		if (m < n)
		{
			n = m;
		}
		if (m == 0)
		{
			z = 1;
			return z;
		}
		if (n == 1)
		{
			z = 1;
			return z;
		}
		z = f(m, n - 1) + f(m - n, n);
		return z;
	}

	public static void Main()
	{
		int t;
		int[] m = new int[20];
		int[] n = new int[20];
		int i;
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
			System.out.printf("%d\n",f(m[i], n[i]));

		}
	}
}

