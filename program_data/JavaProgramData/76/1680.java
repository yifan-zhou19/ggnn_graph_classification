package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int k;
	  int l;
	  int p;
	  int x = 1;
	  double m;
	  int[] a = new int[50000];
	  int[] b = new int[50000];
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
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   b[i] = Integer.parseInt(tempVar3);
	   }
	  }
	  for (j = 0,k = 10000,l = 1;j < n;j++)
	  {
	   if (k >= a[j])
	   {
		 k = a[j];
	   }
	   if (l <= b[j])
	   {
		 l = b[j];
	   }
	  }
	  for (m = k + 0.1;m < l;m++)
	  {
	   for (i = 0,p = 0;i < n;i++)
	   {
		if (m > a[i] && m < b[i])
		{
		 p = 1;
		 break;
		}
	   }
	   if (p == 0)
	   {
		System.out.print("no\n");
		x = 0;
	   }
	  }
	  if (x == 1)
	  {
	   System.out.printf("%d %d",k,l);
	  }
	  return 0;
	}
}

