package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[105];
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int m;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  m = Integer.parseInt(tempVar2);
	  }
	  for (i = 1;i <= n;i++)
	  {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
	  }
	  for (i = m;i >= 1;i--)
	  {
		 k = a[n - i + 1];
		for (j = n - i + 1;j >= m - i + 2;j--)
		{
			  a[j] = a[j - 1];
		}
		a[m - i + 1] = k;
	  }
	  for (i = 1;i < n;i++)
	  {
		 System.out.printf("%d ",a[i]);
	  }
	  System.out.printf("%d",a[n]);
	 return 0;
	}

}

