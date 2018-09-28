package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int p;
		int q;
		int m;
		int i;
		int n;
		int j;
		int k;
		int[] a = new int[1000];
		int[] b = new int[1000];
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
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		k = 0;
		for (j = 0;j < n;j++)
		{
			if (a[j] % 2 != 0)
			{
			b[k] = a[j];
			k++;
			}
		}
		int e;
	for (p = 0 ; p <= (k - 1) ; p++)
	{
		for (q = 0; q < (k - 1) - p; q++)
		{
				if (b[q] > b[q + 1])
				{
						e = b[q + 1];
						b[q + 1] = b[q];
						b[q] = e;
				}
		}
	}
		for (m = 0;m < (k - 1);m++)
		{
		System.out.printf("%d,",b[m]);
		}
		System.out.printf("%d",b[(k - 1)]);
	return 0;
	}
}

