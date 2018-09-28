package <missing>;

public class GlobalMembers
{
	public static int j;
	public static int k;
	public static void G(int[] a)
	{
		int n;
		int m;
		int q;
		int[] p;
		p = a;
		for (n = 0;n < j;n++)
		{
			   for (m = n + 1;m < j;m++)
			   {
					 if (p[n] > p[m])
					 {
						 q = p[n];
						 p[n] = p[m];
						 p[m] = q;
					 }
			   }
		}
	}
	public static void g(int[] a)
	{
		int n;
		int m;
		int q;
		int[] p;
		p = a;
		for (n = 0;n < k;n++)
		{
			   for (m = n + 1;m < k;m++)
			   {
					 if (p[n] > p[m])
					 {
						 q = p[n];
						 p[n] = p[m];
						 p[m] = q;
					 }
			   }
		}
	}
	public static void F(int[] a, int[] b)
	{
		G(a);
		g(b);
		int n;
		int m;
		System.out.printf("%d",a[0]);
		for (n = 1;n < j;n++)
		{
			 System.out.printf(" %d",a[n]);
		}
		for (m = 0;m < k;m++)
		{
			 System.out.printf(" %d",b[m]);
		}
	}
	public static int Main()
	{
		 int n;
		 int m;
		 int[] a = new int[5000];
		 int[] b = new int[5000];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 j = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 k = Integer.parseInt(tempVar2);
		 }
		 for (n = 0;n < j;n++)
		 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[n] = Integer.parseInt(tempVar3);
			 }
		 }
		 for (m = 0;m < k;m++)
		 {
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 b[m] = Integer.parseInt(tempVar4);
			 }
		 }
		 F(a, b);
		 return 0;
	}
}

