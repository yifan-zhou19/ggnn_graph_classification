package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
	   int n;
	   int m;
	   int i;
	   int j;
	   int t;
	   int r;
	   int p;
	   int b;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }
	   for (i = 0;i < n;i++)
	   {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   a[i] = Integer.parseInt(tempVar3);
	   }
	   }
	   if (n > 2 * m)
	   {
		  for (i = 0;i < m;i++)
		  {
			t = a[i];
			a[i] = a[i + n - m];
			a[i + n - m] = t;
		  }
	   for (i = n - m;i < n;i++)
	   {
		   for (j = i - n + 2 * m;j < i;j++)
		   {
			r = a[i];
			a[i] = a[j];
			a[j] = r;
		   }
	   }
	   }
	   else
	   {
		   for (i = 0;i < m;i++)
		   {
			t = a[i];
			a[i] = a[i + n - m];
			a[i + n - m] = t;
		   }
		  p = 2 * n - 2 * m;
		  b = m;
		  while (p < n)
		  {
			for (i = b;i < p;i++)
			{
			  r = a[i];
			  a[i] = a[p];
			  a[p] = r;
			}
		   p++;
		   b++;
		  }
	   }
		 for (i = 0;i < n - 1;i++)
		 {
		System.out.printf("%d ",a[i]);
		 }
		System.out.printf("%d",a[n - 1]);
	}
}

