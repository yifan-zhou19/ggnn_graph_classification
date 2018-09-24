package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int[] a = new int[302];
	  int i;
	  int j;
	  int k = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i] = Integer.parseInt(tempVar2);
	  }
	  }
	 for (j = 1;j <= n;j++)
	 {
		 for (i = 1;(i < j) && a[i] != a[j];i++)
		 {
			 ;
		 }
	 if (i == j)
	 {
		  k++;
	  a[k] = a[j];
	 }
	 }
	for (i = 1;i <= (k - 1);i++)
	{
	System.out.printf("%d,",a[i]);
	}
	System.out.printf("%d",a[k]);
	return 0;
	}
}

