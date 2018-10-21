package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int m;
	int l;
	int p;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[n];
	int[] b = new int[n];
	m = 0;
	p = 1;
	for (i = 0;i < n;i++)
	{
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a[i] = Integer.parseInt(tempVar2);
	   }
	   if (a[i] % 2 == 1)
	   {
	   b[m] = a[i];
		  if (p < b[m])
		  {
			p = b[m];
		  }
		 m = m + 1;
	   }
	}
	for (i = 1;i < p;i = i + 2)
	{
	   for (l = 0;l < m;l++)
	   {
		  if (b[l] == i)
		  {
		   System.out.printf("%d,",b[l]);
		  }
	   }
	}
	System.out.printf("%d",p);
	return 0;
	}
}

