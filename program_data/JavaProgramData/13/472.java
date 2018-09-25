package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int[] a = new int[20000];
	  int i;
	  int j;
	  int m;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i <= n - 1;i++)
	  {
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 a[i] = Integer.parseInt(tempVar2);
	 }
	  }
	for (i = 0;i <= n - 1;i++)
	{
	   for (j = i + 1;j <= n - 1;j++)
	   {
		  if (a[i] == a[j])
		  {
		  for (m = j;m < n;m++)
		  {
			  a[m] = a[m + 1];
		  }
		  j = j - 1;
		  n = n - 1;
		  }
	   }
	}
	for (i = 0;i < n - 1;i++)
	{
	System.out.printf("%d ",a[i]);
	}
	System.out.printf("%d",a[n - 1]);
	}
}

