package <missing>;

public class GlobalMembers
{
	public static void input(int[] x, int p)
	{
	 int i;
	 for (i = 0;i < p;i++)
	 {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  x[i] = Integer.parseInt(tempVar);
	  }
	 }
	}
	public static void sort_ascending(int[] x, int p)
	{
	 int i;
	 int j;
	 int t;
	 for (i = 0;i < p;i++)
	 {
	  for (j = 0;j < p - i - 1;j++)
	  {
	   if (x[j] > x[j + 1])
	   {
		t = x[j];
		x[j] = x[j + 1];
		x[j + 1] = t;
	   }
	  }
	 }
	}
	public static int Main()
	{
	 int m;
	 int n;
	 int[] a = new int[maxsize];
	 int[] b = new int[maxsize];
	 int j;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 input(a, m);
	 input(b, n);
	 sort_ascending(a, m);
	 sort_ascending(b, n);
	 for (j = 0;j < m;j++)
	 {
	 System.out.printf("%d ",a[j]);
	 }
	 for (i = 0;i < n - 1;i++)
	 {
		System.out.printf("%d ",b[i]);
	 }
	 System.out.printf("%d",b[n - 1]);
	}

}

