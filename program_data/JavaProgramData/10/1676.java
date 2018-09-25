package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] a = new int[26];
		int[] b = new int[26];
		int i;
		int j;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = k;i >= 1;i--)
		{
			r = 0;
			for (j = i;j <= k;j++)
			{
				if (a[i] >= a[j])
				{
					r = b[j] + 1;
				}
				if (b[i] < r)
				{
					b[i] = r;
				}
			}
		}
		r = 0;
		for (i = 1;i <= k;i++)
		{
			if (b[i] > r)
			{
				r = b[i];
			}
		}
		System.out.printf("%d",r);
	}

}

