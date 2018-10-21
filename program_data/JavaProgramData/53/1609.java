package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] a = new int[10000];
	  int n;
	  int i;
	  int t;
	  int j;
	  int m;
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
	  System.out.printf("%d",a[0]);
	  for (i = 1;i <= n - 1;i++)
	  {
		m = 0;
		for (j = 0;j <= i - 1;j++)
		{
		  if (a[i] == a[j])
		  {
			  m = m + 1;
		  }
		}
		if (m == 0)
		{
			System.out.printf(",%d",a[i]);
		}
	  }
	  return 0;
	}
}

