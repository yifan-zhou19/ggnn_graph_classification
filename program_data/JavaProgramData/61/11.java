package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int[] a = new int[10000];
	   int[] b = new int[10000];
	   int cal = int x;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
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
		   b[i] = cal(a[i]);
	   }
	   System.out.printf("%d",b[1]);
	   for (i = 2;i <= n;i++)
	   {
		   System.out.printf("\n%d",b[i]);
	   }
	}

	public static int cal(int x)
	{
	   int i;
	   int[] a = new int[30];
	   int t;
	   a[1] = 1;
	   a[2] = 1;
	   for (i = 3;i <= 30;i++)
	   {
		   a[i] = a[i - 1] + a[i - 2];
	   }
	   t = a[x];
	   return (t);
	}
}

