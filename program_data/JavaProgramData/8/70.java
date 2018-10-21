package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[10];
	public static int[] b = new int[10];
	public static int[] c = new int[20];
	public static void f()
	{
	   int i;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   n = Integer.parseInt(tempVar2);
	   }
	   for (i = 0;i < m;i++)
	   {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   a[i] = Integer.parseInt(tempVar3);
	   }
	   }
	   for (i = 0;i < n;i++)
	   {
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   b[i] = Integer.parseInt(tempVar4);
	   }
	   }
	}
	public static void g()
	{
	   int i;
	   int j;
	   int k;
	   for (j = 0;j < m - 1;j++)
	   {
			 for (i = 0;i < m - j - 1;i++)
			 {
				 if (a[i] > a[i + 1])
				 {
			k = a[i];
			a[i] = a[i + 1];
			a[i + 1] = k;
				 }
			 }
	   }
		 for (j = 0;j < n - 1;j++)
		 {
			 for (i = 0;i < n - j - 1;i++)
			 {
				 if (b[i] > b[i + 1])
				 {
			k = b[i];
			b[i] = b[i + 1];
			b[i + 1] = k;
				 }
			 }
		 }
	}
	public static void u()
	{
	   int i;
	   for (i = 0;i < m;i++)
	   {
	   c[i] = a[i];
	   }
	   for (i = m;i < m + n;i++)
	   {
	   c[i] = b[i - m];
	   }
	}
	public static void v()
	{
	   int i;
	   for (i = 0;i < m + n - 1;i++)
	   {
	   System.out.printf("%d ",c[i]);
	   }
	   System.out.printf("%d",c[i]);
	}
	public static void Main()
	{
	   f();
	   g();
	   u();
	   v();
	}
}

