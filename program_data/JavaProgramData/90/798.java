package <missing>;

public class GlobalMembers
{
	public static int f(int m, int n)
	{
		if (m < 0)
		{
			return 0;
		}
		if (m == 0)
		{
			return 1;
		}
		if (n == 1)
		{
			return 1;
		}
		return f(m - n, n) + f(m, n - 1);
	}
	public static int Main()
	{
		int[] M = new int[40];
		int[] N = new int[40];
		int k;
		int i;
		int[] z = new int[40];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				M[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				N[i] = Integer.parseInt(tempVar3);
			}
			z[i] = f(M[i], N[i]);
			System.out.printf("%d\n",z[i]);
		}
		return 0;
	}
}

