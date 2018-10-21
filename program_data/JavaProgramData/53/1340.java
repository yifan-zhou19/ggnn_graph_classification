package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[N];
		int[] b = new int[N];
		int t;
		int k = 0;
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

		for (i = 0;i < n;i++)
		{
			for (t = 0,l = 0;t < i;t++)
			{
				if (a[t] == a[i])
				{
					l++;
				}
			}
			   if (l == 0)
			   {
				   b[k] = a[i];
				   k++;
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

