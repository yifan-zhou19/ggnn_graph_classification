package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int n;
	   int k;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int[] a = new int[n];
	   for (i = 0;i < n;i++)
	   {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   k = Integer.parseInt(tempVar3);
	   }
	   for (i = 0;i < n;i++)
	   {
		 if (a[i] == k)
		 {
		   for (j = i;j < n - 1;j++)
		   {
			 a[j] = a[j + 1];
		   }
		   n--;
		   i--;
		 }
	   }
		 for (i = 0;i < n - 1;i++)
		 {
		   System.out.printf("%d ",a[i]);
		 }
		   System.out.printf("%d\n",a[n - 1]);
	   System.in.read();
	   System.in.read();
	   System.in.read();
	   return 0;
	}
}

