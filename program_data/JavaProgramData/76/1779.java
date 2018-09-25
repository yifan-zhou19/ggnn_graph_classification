package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int c = 0;
		int m = 50001;
		int x = 0;
		int[] sz = new int[50001];
		int[] a = new int[50001];
		int[] b = new int[50001];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0; i < n; i++)
		{
			if (a[i] < m)
			{
				m = a[i];
			}
		}
		for (i = 0; i < n; i++)
		{
			if (b[i] > x)
			{
				x = b[i];
			}
		}
		for (i = m; i <= x; i++)
		{
			sz[i] = 1;
		}
		for (i = 0; i < n; i++)
		{
			for (k = a[i]; k < b[i]; k++)
			{
				sz[k] = 0;
			}
		}
	   for (i = m; i < x; i++)
	   {
		   if (sz[i] == 1)
		   {
			   c = 1;
			   break;
		   }
		   else
		   {
		   c = 0;
		   }
	   }
	   if (c == 0)
	   {
		   System.out.printf("%d %d", m, x);
	   }
	   else
	   {
		   System.out.print("no");
	   }
		return 0;
	}


}

