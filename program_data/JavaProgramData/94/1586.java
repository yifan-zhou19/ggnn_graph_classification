package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int e;
		int c;
		int[] a = new int[LEN];
		int[] d = new int[LEN];
		c = 0;
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
		for (k = 1;k < n - 1;k++)
		{
		for (i = 0;i < n - k;i++)
		{
		   if (a[i] > a[i + 1])
		   {
		   e = a[i];
		   a[i] = a[i + 1];
		   a[i + 1] = e;
		   };
		};
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] % 2 == 1)
			{
	d[c] = a[i];
	c = c + 1;
			}
		}
	for (i = 0;i < c;i++)
	{
		if (i != c - 1)
		{
	System.out.printf("%d,",d[i]);
		}
	else
	{
	 System.out.printf("%d",d[i]);
	}
	}
	return 0;
	}

}

