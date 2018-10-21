package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int[] a = new int[100];
	public static int[] b = new int[100];

	public static void sort(int[] c, int s)
	{
		int i;
		int j;
		int k;
		for (i = 0;i < s - 1;i++)
		{
		  for (j = 0;j < s - 1 - i;j++)
		  {
		   if (c[j] > c[j + 1])
		   {
		   k = c[j + 1];
		   c[j + 1] = c[j];
		   c[j] = k;
		   }
		  }
		}
	}

	public static void hebing(int[] d, int[] e, int x, int y)
	{
		int i;
		for (i = 0;i < x;i++)
		{
		System.out.printf("%d ",d[i]);
		}
		for (i = 0;i < y - 1;i++)
		{
		System.out.printf("%d ",e[i]);
		}
		System.out.printf("%d",e[y - 1]);
	}
	public static int Main()
	{
		int i;
		int j;
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
	   for (j = 0;j < m;j++)
	   {
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   b[j] = Integer.parseInt(tempVar4);
	   }
	   }
		sort(a, n);
		sort(b, m);
		hebing(a, b, n, m);
		return 0;
	}
}

