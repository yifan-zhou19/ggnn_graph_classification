package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static void get(int[] a, int[] b)
	{
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
	public static void sequence(int[] a, int p)
	{
	 int i;
	 int j;
	 int temp;
	 for (i = 0;i < p;i++)
	 {
	  for (j = i + 1;j < p;j++)
	  {
	   if (a[j] < a[i])
	   {
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	   }
	  }
	 }
	  // printf("G");
	}
	public static void combine(int[] a, int p, int[] b, int q)
	{
	 int j;
	 for (j = 0;j < q;j++)
	 {
	  a[p + j] = b[j];
	 }
	}
	public static void show(int[] a, int p)
	{
	 int i;
	 for (i = 0;i < p - 1;i++)
	 {
	  System.out.printf("%d ",a[i]);
	 }
	 System.out.printf("%d",a[p - 1]);
	}
	public static void Main()
	{
	 int[] a = new int[200];
	 int[] b = new int[200];
	 get(a, b);
	 sequence(a, m);
	 sequence(b, n);
	 combine(a, m, b, n);
	 show(a, m + n);
	}
}

