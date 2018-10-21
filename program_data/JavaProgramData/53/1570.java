package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[1000];
	int i;
	int m;
	int t;
	int[] b = new int[1000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	t = 1;
	for (i = 1;i <= n;i++)
	{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 m = Integer.parseInt(tempVar2);
		 }
	  if (a[m] != 1)
	  {
		  b[t] = m;
		  t++;
		  a[m] = 1;
	  }
	}
	for (i = 1;i < t - 1;i++)
	{
	System.out.printf("%d,",b[i]);
	}
	 System.out.printf("%d",b[t - 1]);
	}

}

