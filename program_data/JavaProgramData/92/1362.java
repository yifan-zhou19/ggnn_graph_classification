package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int m;
		int j;
		int[] s = new int[1000];
		int q;
		 for (k = 0;;k++)
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
		q = n;
		m = 0;
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		int[] d = new int[n];
		for (i = 0;i < n;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i] = Integer.parseInt(tempVar2);
			 }
		 c[i] = 0;
		 d[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 b[i] = Integer.parseInt(tempVar3);
		 }
		}
		for (i = 0;i < n;i++)
		{
			 int t = a[0];
			 int r = 0;
		  for (j = 0;j < n - i;j++)
		  {
		   if (a[j] > t)
		   {
				  t = a[j];
			   r = j;
		   }
		  }
		  a[r] = a[n - i - 1];
		  a[n - i - 1] = t;
		}
		for (i = 0;i < n;i++)
		{
			 int t = b[0];
			 int r = 0;
		  for (j = 0;j < n - i;j++)
		  {
		   if (b[j] < t)
		   {
				  t = b[j];
			   r = j;
		   }
		  }
		  b[r] = b[n - i - 1];
		  b[n - i - 1] = t;
		}
		  for (i = 0;i < n;i++)
		  {
			   for (j = 0;j < n;j++)
			   {
			 if (c[i] == 0 && d[j] == 0)
			 {
				 if (a[i] > b[j])
				 {
				  m++;
			   c[i] = 1;
			   d[j] = 1;
				 }
			 }
			   }
		  }
		  for (i = 0;i < n;i++)
		  {
			   for (j = 0;j < n;j++)
			   {
			 if (c[i] == 0 && d[j] == 0)
			 {
				 if (a[i] == b[j])
				 {
				   q--;
				c[i] = 1;
			   d[j] = 1;
				 }
			 }
			   }
		  }
		  s[k] = 200 * m - 200 * (q - m);
		 }
		  for (i = 0;i < k;i++)
		  {
		  System.out.printf("%d\n",s[i]);
		  }
		  System.in.read();
		  System.in.read();
	}
}

