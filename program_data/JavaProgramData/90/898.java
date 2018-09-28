package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static int f(int m,int n)
	{
		int z;
		if (m == 0 || m == 1 || n == 1)
		{
			z = 1;
		}
		else
		{
			if (m < n)
			{
				z = f(m, m);
			}
			else
			{
				z = f(m, n - 1) + f(m - n, n);
			}
		}
		return z;
	}


	public static int Main()
	{
		int f = new int(int m,int n);
		int x;
		int i;
		int[] m = new int[10];
		int[] n = new int[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= x;i++)
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
		for (i = 1;i <= x;i++)
		{
			System.out.printf("%d\n",f(m[i], n[i]));
		}
		return 0;
	}
}

