package <missing>;

public class GlobalMembers
{
	public static int fang(int m,int n,int j)
	{
		int a = 0;
		int k;
		int i;
		if (n == 1)
		{
		return m >= j;
		}
		else if (n <= m)
		{
		for (k = j;k < m;k++)
		{
			 a += fang(m - k, n - 1, k);
		}
		}
		else if (n > m)
		{
			 n = m;
			 for (k = j;k < m;k++)
			 {
							 a += fang(m - k, n - 1, k);
			 }
		}
		return a;
	}

	public static int Main()
	{
		int t;
		int[] M = new int[20];
		int[] N = new int[20];
		int[] k = new int[20];
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
							M[i] = Integer.parseInt(tempVar2);
						}
						String tempVar3 = ConsoleInput.scanfRead(" ");
						if (tempVar3 != null)
						{
							N[i] = Integer.parseInt(tempVar3);
						}
						k[i] = fang(M[i], N[i], 0);
		}
		for (i = 0;i < t;i++)
		{
						System.out.printf("%d\n",k[i]);
		}
		return 0;
	}
}

