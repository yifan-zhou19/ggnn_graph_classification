package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[100];
	public static int[] b = new int[100];

	public static void scan()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
	}

	public static void order(int N, int[] p)
	{
		int i;
		int j;
		int amount = 0;
		int min;
		int max;
		min = p[0];
		max = p[0];
		for (i = 0;i < N;i++)
		{
			if (p[i] < min)
			{
				min = p[i];
			}
			if (p[i] > max)
			{
				max = p[i];
			}
		}
		for (i = min;i <= max;i++)
		{
			for (j = 0;j < N;j++)
			{
				if (p[j] == i)
				{
					if (amount == 0)
					{
						System.out.printf("%d",p[j]);
					}
					else
					{
						System.out.printf(" %d",p[j]);
					}
					amount = amount + 1;
				}

			}
		}
	}

	public static void combine(int N, int[] p, int M, int[] q)
	{
		order(N, p); //?????p??p[100]
		System.out.print(" ");
		order(M, q);
		System.out.print("\n");
	}

	public static int Main()
	{
		scan();
		combine(m, a, n, b);
		return 0;
	}



}

