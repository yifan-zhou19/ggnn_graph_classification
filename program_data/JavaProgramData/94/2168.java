package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int[] b = new int[500];
		int n;
		int i;
		int j;
		int p;
		int q;
		int k = 0;
		int h = 0;
		int l;
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
		for (j = 0;j < n;j++)
		{
			if (a[j] % 2 != 0)
			{
				b[k] = a[j];
				k = k + 1;
			}
			else
			{
				continue;
			}
		}
		for (p = 0;p < k;p++)
		{
			for (q = p;q < k;q++)
			{
				if (b[p] > b[q])
				{
					h = b[p];
					b[p] = b[q];
					b[q] = h;
				}
				else
				{
					continue;
				}
			}
		}
		for (l = 0;l < k;l++)
		{
			if (l == k - 1)
			{
			System.out.printf("%d",b[l]);
			}
			else
			{
				System.out.printf("%d,",b[l]);
			}
		}
		return 0;
	}



}

