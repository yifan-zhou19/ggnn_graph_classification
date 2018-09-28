package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10000];
	public static int[] b = new int[10000];
	public static int[] c = new int[1000];
	public static int i;
	public static int n;
	public static int j;
	public static int S1;
	public static int S2;
	public static int S3;
	public static int t = 0;
	public static int m = 0;
	public static int Main()
	{
		void Order();
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   while (n != 0)
	   {
		   S1 = 0;
		   S3 = 0;
		   S2 = n - 1;
		 for (i = 0;i < n;i++)
		 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
		 }
		 for (i = 0;i < n;i++)
		 {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 b[i] = Integer.parseInt(tempVar3);
		 }
		 }
		 Order();
		 i = n - 1;
		 while (i >= S3)
		 {
		   while ((a[S3] > b[S1]) && (i > S3))
		   {
			   S3++;
			   S1++;
			   m += 200;
		   }
		   if (a[i] < b[S2])
		   {
			   m -= 200;
			   S1++;
			   i--;
			   continue;
		   }
		   if (a[i] > b[S2])
		   {
			   m += 200;
			   S2--;
			   i--;
			   continue;
		   }
		   if (a[i] == b[S2])
		   {
				 if (a[i] < b[S1])
				 {
					 m -= 200;
				 }
			   S1++;
			   i--;
		   }
		 }
		  c[t] = m;
		 t++;
		 m = 0;
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}
	   }
	   for (i = 0;i < t;i++)
	   {
	   System.out.printf("%d\n",c[i]);
	   }
	}
	public static void Order()
	{
		int i;
		int j;
		int t;
	 for (i = 0;i < n;i++)
	 {
	 for (j = i + 1;j < n;j++)
	 {
		 if (a[j] > a[i])
		 {
		  t = a[j];
	   a[j] = a[i];
	   a[i] = t;
		 }
	  if (b[j] > b[i])
	  {
		  t = b[j];
	   b[j] = b[i];
	   b[i] = t;
	  }
	 }
	 }
	}











}

