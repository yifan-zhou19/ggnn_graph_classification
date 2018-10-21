package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[50000];
	public static int[] b = new int[50000];
	public static int[] c = new int[100000];
	public static int[] d = new int[100000];
	public static int[] z = new int[20000];
	public static int Main()
	{
	   int n;
	   int i;
	   int k;
	   int p = 0;
	   int q = 0;
	   int m = 0;
	   int u = 0;
	   int y = 0;
	   int max = 0;
	   int min = 0;
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
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b[i] = Integer.parseInt(tempVar3);
		  }
		  c[i] = 2 * a[i];
		  d[i] = 2 * b[i];
	   }
	   max = c[0];
	   min = c[0];
	   for (i = 0;i < n;i++)
	   {
		  if (c[i] > max)
		  {
			max = c[i];
		  }
		  if (c[i] < min)
		  {
			min = c[i];
		  }
	   }
	   for (i = 0;i < n;i++)
	   {
		  if (d[i] > max)
		  {
			max = d[i];
		  }
		  if (d[i] < min)
		  {
			min = d[i];
		  }
	   }
	   for (k = 0;k < 20000;k++)
	   {
		  z[k] = 0;
	   }
	   for (i = 0;i < n;i++)
	   {
		  p = c[i];
		  q = d[i];
		  for (k = p;k <= q;k++)
		  {
			  z[k] = 1;
		  }
	   }
	   for (i = 0;i < 20000;i++)
	   {
		 if (z[i] == 1)
		 {
			 u = i;
			 break;
		 }
	   }
	   for (i = 0;i < 20000;i++)
	   {
		if (z[i] == 1)
		{
			y++;
		}
	   }
	   for (i = u;i < 20000;i++)
	   {

		  if (z[i] == 0)
		  {
			  break;
		  }
		  if (z[i] == 1)
		  {
			  m++;
		  }
	   }
	   if (m == y)
	   {
		   System.out.printf("%d %d",min / 2,max / 2);
	   }
	   if (m != y)
	   {
		   System.out.print("no");
	   }
	 return 0;
	}

}

