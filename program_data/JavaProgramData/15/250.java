package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int[] a = new int[n];
	 int s = 0;
	 int m = 0;
	 int b;
	 for (i = 0;i < n;i++)
	 {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a[0] = Integer.parseInt(tempVar2);
	   }
	   if (a[0] == 0)
	   {
		   s = 1;
	   }
	   else
	   {
		   s = 0;
	   }
	  for (j = 1;j < n;j++)
	  {
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   a[j] = Integer.parseInt(tempVar3);
	   }
	   if (a[j] == 0)
	   {
		   s++;
	   }
	  }
	   if (s == 2)
	   {
			m++;
	   }
		scanf("\n");
	 }
	 b = m * m;
	 System.out.printf("%d\n",b);
	return 0;
	}
}

