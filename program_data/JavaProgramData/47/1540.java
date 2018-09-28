package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int[] a = new int[100];
	  int i;
	  int j;
	  int t;
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
	  j = n - 1;
	  for (i = 0;i < j;i++)
	  {
	  t = a[i];
	  a[i] = a[j];
	a[j] = t;
	 j--;
	  }
	 for (i = 0;i < n;i++)
	 {
	if (i < n - 1)
	{
		System.out.printf("%d ",a[i]);
	}
	else
	{
		System.out.printf("%d",a[i]);
	}
	 }
	return 0;
	}
}

