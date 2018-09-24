package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	final int gro = n;
	int[] a = new int[gro];
	for (b = 0;b <= n - 1;b++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[b] = Integer.parseInt(tempVar2);
		}
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c = Integer.parseInt(tempVar3);
	}
	f = 0;
	for (d = 0;d <= n - 1;d++)
	{
		while (a[d] == c)
		{
		  for (e = d;e <= n - 1;e++)
		  {
		   a[e] = a[e+1];
		  }
	f = f + 1;
		}
	}
	for (g = 0;g < n - f - 1;g++)
	{
		System.out.printf("%d ",a[g]);
	}
	System.out.printf("%d",a[g]);
	}

}

