package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[100];
	public static int n;
	public static int m;
	public static int Main()
	{
		void cout();
	   void p();
	   void com();
	   void play();
	   cout();
	   p();
	   com();
	   play();
	   return 0;
	}

	public static void cout()
	{
		int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
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
	  for (i = 0;i < m;i++)
	  {
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   b[i] = Integer.parseInt(tempVar4);
	   }
	  }
	}

	public static void p()
	{
		int i;
		int j;
		int t;
	   for (i = 0;i < n;i++)
	   {
		 for (j = 0;j < n - i - 1;j++)
		 {
			 if (a[j] >= a[j + 1])
			 {
			   t = a[j];
			  a[j] = a[j + 1];
			  a[j + 1] = t;
			 }
		 }
	   }
		for (i = 0;i < m;i++)
		{
		 for (j = i;j < m - i - 1;j++)
		 {
			 if (b[j] >= b[j + 1])
			 {
			   t = b[j];
			  b[j] = b[j + 1];
			  b[j + 1] = t;
			 }
		 }
		}

	}

	public static void com()
	{
		int i;
	   for (i = 0;i < n;i++)
	   {
		 c[i] = a[i];
	   }
	   for (i = n;i < n + m;i++)
	   {
		 c[i] = b[i - n];
	   }
	}

	public static void play()
	{
		int i;
	   for (i = 0;i < n + m;i++)
	   {
			System.out.printf("%d",c[i]);
		  if (i != n + m - 1)
		  {
			  System.out.print(" ");
		  }
	   }
	}

}

