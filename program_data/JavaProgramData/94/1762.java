package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j;
		int k;
		int e;
		int[] a = new int[100];
		int[] b = new int[100];
		k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] % 2 != 0)
			{
				b[k] = a[i];
				k = k + 1;
			}
		}
		for (j = 1;j <= k;j++)
		{
			for (i = 0;i < k - j;i++)
			{
				if (b[i] > b[i + 1])
				{
					e = b[i + 1];
					b[i + 1] = b[i];
					b[i] = e;
				}
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[k - 1]);
		return 0;
	}
}

