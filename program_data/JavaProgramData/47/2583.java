package <missing>;

public class GlobalMembers
{
	public static void sx(int[] b, int n)
	{
		int i;
			for (i = 0;i < n;i++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				b[i] = Integer.parseInt(tempVar);
			}
			}
	}
	public static void nx(int[] a, int[] b, int n)
	{
		int i;
			for (i = n - 1;i > -1;i--)
			{
			a[i] = b[n - i - 1];
			}
	}
	public static int Main()
	{
		int i = 0;
		int q;
		int[] M = new int[1001];
		int[] N = new int[1001];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			q = Integer.parseInt(tempVar);
		}
		sx(M, q);
		nx(N, M, q);
		for (i = 0;i < q - 1;i++)
		{
		System.out.printf("%d ",N[i]);
		}
		System.out.printf("%d",N[q - 1]);
		return 0;
	}

}

