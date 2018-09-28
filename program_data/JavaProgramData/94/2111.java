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
	  m = 0;
	  for (i = 0;i < n;i++)
	  {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   t = Integer.parseInt(tempVar2);
	   }
	   if (t % 2 == 1)
	   {
		  a[m] = t;
		  m = m + 1;
	   }
	  }
	  for (j = 0;j < m - 1;j++)
	  {
	   for (i = 0;i < m - 1;i++)
	   {
		 if (a[i] > a[i + 1])
		 {
			 t = a[i];
			 a[i] = a[i + 1];
			 a[i + 1] = t;
		 }
	   }
	  }
	  System.out.printf("%d",a[0]);
	  for (i = 1;i < m;i++)
	  {
		System.out.printf(",%d",a[i]);
	  }
		return 0;
	}

}

