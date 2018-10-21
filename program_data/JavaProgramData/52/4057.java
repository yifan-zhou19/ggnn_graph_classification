package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m;
	  int n;
	  int i;
	  int j;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  int[] a = new int[m + n];
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  a[n] = Integer.parseInt(tempVar3);
	  }
	  for (i = 1;i < m;i++)
	  {
	  String tempVar4 = ConsoleInput.scanfRead(" ");
	  if (tempVar4 != null)
	  {
		  a[n + i] = Integer.parseInt(tempVar4);
	  }
	  }
	   for (i = 0;i < n;i++)
	   {
	  a[i] = a[m + i];
	   }
	  System.out.printf("%d",a[0]);
	   for (i = 1;i < m;i++)
	   {
	 System.out.printf(" %d",a[i]);
	   }
	return 0;
	}
}

