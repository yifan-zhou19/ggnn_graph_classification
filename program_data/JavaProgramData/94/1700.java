package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] sz = new int[300];
	 int[] a = new int[300];
		char x;
		int n;
		int i;
		int j;
		int k;
		int p;
		int q;
		x = ',';
		n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			q = Integer.parseInt(tempVar);
		}
		for (i = 0;i < q;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  if (a[i] % 2 == 1)
		  {
			sz[n] = a[i];
			n++;
		  }
		}
		n = n - 1;
		for (j = 1;j <= n;j++)
		{
		for (i = 0;i < n;i++)
		{
		  k = i + 1;
		  if (sz[k] < sz[i])
		  {
			p = sz[k];
			sz[k] = sz[i];
			sz[i] = p;
		  }
		}
		}
		for (i = 0;i <= n;i++)
		{
		  if (i < n)
		  {
			System.out.printf("%d",sz[i]);
			System.out.printf("%c",x);
		  }
		  else
		  {
			System.out.printf("%d",sz[i]);
		  }
		}
	return 0;
	}
}

