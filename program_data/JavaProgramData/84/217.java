package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n;
	   int i;
	   int j;
	   int t;
	   int[] a = new int[100];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   System.out.print("\n");
	   for (i = 0;i < n;i++)
	   {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
		 System.out.print("\n");
	   }
	   for (j = 1;j < n;j++)
	   {
		 for (i = 0;i < (n - j);i++)
		 {
	   if (a[i] < a[i + 1])
	   {
		   t = a[i];
		   a[i] = a[i + 1];
		   a[i + 1] = t;
	   }
		 }
	   }
		 System.out.printf("%d\n%d\n",a[0],a[1]);
	}

}

