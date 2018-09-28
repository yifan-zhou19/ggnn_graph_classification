package <missing>;

public class GlobalMembers
{
	public static int f(int[] c, int w)
	{
		int i;
		int j;
		int k;
		int t;
	  for (i = 0;i < w - 1;i++)
	  {
			 k = i;
			 for (j = i + 1;j < w;j++)
			 {
				 if (c[j] < c[k])
				 {
					 k = j;
				 }
			 }
					t = c[k];
					c[k] = c[i];
					c[i] = t;
	  }
	}
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] a = new int[10];
		int[] b = new int[10];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
	}
	for (j = 0;j < m;j++)
	{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b[j] = Integer.parseInt(tempVar4);
		}
	}
	f(a, n);
	f(b, m);
	for (i = 0;i < n;i++)
	{
		System.out.printf("%d ",a[i]);
	}
	for (j = 0;j < m - 1;j++)
	{
		System.out.printf("%d ",b[j]);
	}
	System.out.printf("%d",b[m - 1]);
	}

}

