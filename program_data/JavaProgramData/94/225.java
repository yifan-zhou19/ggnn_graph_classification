package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[500];
		int[] u = new int[500];
		int i;
		int a = 0;
		int n;
		int p;
		int k;
		int e;
		int s = 0;
		int z = 0;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] % 2 != 0)
			{
				e = sz[i];
				u[a] = e;
				a++;
			}
		}
		for (k = 1;k <= a;k++)
		{
			for (i = 0;i < a - k;i++)
			{
				if (u[i] > u[i + 1])
				{
					p = u[i + 1];
					u[i + 1] = u[i];
					u[i] = p;
				}
			}
		}
		for (i = 0;i < a - 1;i++)
		{
			System.out.printf("%d,",u[i]);
			s += u[i];
		}
		for (i = 0;i < a;i++)
		{
			z += u[i];
		}
		sum = z - s;
		System.out.printf("%d",sum);

		return 0;
	}
}

