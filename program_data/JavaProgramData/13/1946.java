package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int k = 1;
	 int[] a = new int[20000];
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
			a[i - 1] = Integer.parseInt(tempVar2);
		}
		 for (j = 0;j <= i - 1;j++)
		 {
		   if (i - 1 == 0)
		   {
			   k = k + 1;
			   a[0] = a[0];
		   }
				 else
				 {
					   if (a[j] == a[i - 1] && j != i - 1)
					   {
						   break;
					   }
							 else if (a[j] == a[i - 1])
							 {
								 a[k - 1] = a[i - 1];
								 k = k + 1;
							 }
				 }
		 }
	 }
	   for (i = 0;i <= k - 3;i++)
	   {
		   System.out.printf("%d ",a[i]);
	   }
	   System.out.printf("%d",a[k - 2]);
	 return 0;
	}

}

