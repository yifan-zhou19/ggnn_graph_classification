package <missing>;

public class GlobalMembers
{
	public static int Max(int n, int[] a)
	{
	   int x = 0;
	   for (int i = 0;i < n;i++)
	   {
		   if (x < a[i])
		   {
		   x = a[i];
		   }
	   }
	   return x;
	}
	public static int Main()
	{
	   int x;
	   int n;
	   int i;
	   int j;
	   int b = 1;
	   int[] p;
	   int[] q;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   p = new int[n];
	   q = new int[n];
	   for (i = 0;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   p + i = tempVar2;
		   }
	   }
	   for (i = n - 1;i >= 0;i--)
	   {

		  {
			  x = 0;
			  for (j = i + 1;j < n;j++)
			  {
				 if ((p[i] >= p[j]) && (x < q[j]))
				 {
					 x = q[j];
				 }
			  }
			  q[i] = x + 1;
	  }
	   }
	   System.out.printf("%d",Max(n, q));
	}

}

