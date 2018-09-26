package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int sum = 0;
	   int[] a = new int[100000];
	   int[] b = new int[100000];
	   int[] c = new int[10000];
	   int[] d = new int[10000];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   b[i] = Integer.parseInt(tempVar3);
		   }
		   if (a[i] == 0 && b[i] == 0)
		   {
			  break;
		   }
	   }
	   for (j = 0;j <= n - 1;j++)
	   {
			 c[j] = 0;
			 d[j] = 0;
	   }
	   for (j = 0;j <= i - 1;j++)
	   {
			 c[b[j]]++;
			 d[a[j]]++;
	   }
	   for (i = 0;i <= n - 1;i++)
	   {
			 if (c[i] == n - 1 && d[i] == 0)
			 {
				System.out.printf("%d",i);
				sum++;
			 }
	   }
	   if (sum == 0)
	   {
		 System.out.print("NOT FOUND");
	   }
	}
}

