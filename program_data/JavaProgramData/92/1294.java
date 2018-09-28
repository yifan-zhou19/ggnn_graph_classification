package <missing>;

public class GlobalMembers
{
	public static void h(int[] x, int y)
	{
		int i;
		int j;
		int t;
	  for (i = 1;i < y;i++)
	  {
		 for (j = y;j > i;j--)
		 {
		 if (x[j] > x[j - 1])
		 {
		   t = x[j - 1];
			 x[j - 1] = x[j];
			 x[j] = t;
		 }
		 }
	  }
	}

	public static int c(int[] a, int[] b, int m)
	{
		int i;
		int j;
		  if (a[m] > b[m])
		  {
		   return (1);
		  }
		   if (a[m] < b[m])
		   {
			   for (i = 1;i <= m - 1;i++)
			   {
			   b[i] = b[i + 1];
			   }
			   return (-1);
		   }
		   if (a[m] == b[m] && a[1] > b[1])
		   {
			   for (i = 1;i <= m - 1;i++)
			   {
					  b[i] = b[i + 1];
					a[i] = a[i + 1];
			   }
				return (1);
		   }
		   if (a[m] == b[m] && a[1] < b[1])
		   {
				for (i = 1;i <= m - 1;i++)
				{
				   b[i] = b[i + 1];
				}
				   return (-1);
		   }
		   if (a[m] == b[m] && a[1] == b[1])
		   {
			   if (a[m] == b[1])
			   {
				 j = 0;
			   }
				 if (a[m] < b[1])
				 {
				 j = -1;
				 }
				  for (i = 1;i <= m - 1;i++)
				  {
				  b[i] = b[i + 1];
				  }
				 return (j);
		   }
	}
	public static int Main()
	{
		int n;
		int l;
		int i;
		int j;
		int t;
	  int[] a = new int[10000];
	  int[] b = new int[10000];
	for (;;)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	   if (n == 0)
	   {
		   break;
	   }

	  for (i = 1;i <= n;i++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i] = Integer.parseInt(tempVar2);
	  }
	  }
	  for (i = 1;i <= n;i++)
	  {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b[i] = Integer.parseInt(tempVar3);
	  }
	  }
	  l = n;
	  t = 0;
	  h(a, l);
	  h(b, l);

	  for (i = 1;i <= n;i++)
	  {
		 t = t + c(a, b, l);
		   l--;
	  }
		t = t * 200;
		System.out.printf("%d\n",t);
	}


	}

}

