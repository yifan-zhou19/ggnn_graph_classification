package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int i1;
		int k;
		int imax = 0;
		int[] a = new int[26];
		int[] b = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		b[n] = 0;
		b[n - 1] = 1;

		for (i = n - 2; i >= 0; i--)
		{
			imax = n;
			for (i1 = i + 1; i1 < n; i1++)
			{
				if (b[i1] > b[imax] && a[i] >= a[i1])
				{
					imax = i1;
				}
			}
			b[i] = b[imax] + 1;
		}

		for (i = 0,k = 0; i < n; i++)
		{
			if (b[i] > k)
			{
				k = b[i];
			}
		}
		System.out.printf("%d",k);
		return 0;
	}

}

