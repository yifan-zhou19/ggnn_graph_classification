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

	   public static void g(int[] x, int y)
	   {
		int i;
		int j;
		int t;
		 for (i = 1;i < y;i++)
		 {
		 for (j = y;j > i;j--)
		 {
		 if (x[j] < x[j - 1])
		 {
		   t = x[j - 1];
			 x[j - 1] = x[j];
			 x[j] = t;
		 }
		 }
		 }
	   }

	public static void c(int[] b, int m, int n)
	{
		int i;
		  for (i = n;i <= m;i++)
		  {
			   b[i] = b[i + 1];
		  }
	}



	public static int Main()
	{
		int n;
		int l;
		int i;
		int j;
		int t;
		int r;
		int s;
		int w;
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
	  r = 0;
	  g(a, l);
	  h(b, l);

	  for (i = 1;i <= l;i++)
	  {
	  for (j = 1;j <= l;j++)
	  {
		  if (a[i] > b[j])
		  {
	 t = t + 1;
		  l = l - 1;
		   c(b, l, j);
		   c(a, l, i);
			i = i - 1;
		   break;
		  }
	  }
	  }


	   for (w = l,i = 1;i <= w;i++)
	   {
	   for (j = 1;j <= w;j++)
	   {
		  if (a[i] == b[j])
		  {
	 r = r + 1;
		  w = w - 1;
		  c(b, w, j);
		  c(a, w, i);
		  i = i - 1;
		   break;
		  }
	   }
	   }

		s = (t - (n - t - r)) * 200;
		System.out.printf("%d\n",s);
	}
	}

}

