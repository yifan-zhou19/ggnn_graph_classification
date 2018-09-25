package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] a = new int[25];
		int i;
		int j;
		int l;
		int p;
		int q;
		int[] b = new int[25];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = k - 1;j >= 0;j--)
		{
			for (l = k - 1;l >= j;l--)
			{
				if (l != j)
				{
				if ((a[j] >= a[l]) && (b[j] == b[l] - 1))
				{
					b[j] = b[l];
				}
				}
				else if (l == j)
				{
				   b[j] = b[j] + 1;
				}
			}
		}
		for (p = 1;p <= k - 1;p++)
		{
					if (b[0] < b[p])
					{
						q = b[0];
						b[0] = b[p];
						b[p] = q;
					}
		}
		System.out.printf("%d",b[0]);
	}
}

