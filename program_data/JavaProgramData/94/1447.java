package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int N;
	 int i;
	 int t;
	 int j;
	 int sum = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 N = Integer.parseInt(tempVar);
	 }
	 int[] a = new int[N];
	 for (i = 0;i < N;i++)
	 {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a[i] = Integer.parseInt(tempVar2);
	   }
	 }
	int[] b = new int[sum];
	   for (i = 0;i < N;i++)
	   {
		  if (a[i] % 2 != 0)
		  {
		   sum++;
		   b[sum - 1] = a[i];
		  }
	   }
	for (j = 0;j < sum - 1;j++)
	{
	   for (i = 0;i < sum - j - 1;i++)
	   {
		   if (b[i] > b[i + 1])
		   {
			   t = b[i];
			   b[i] = b[i + 1];
			   b[i + 1] = t;
		   }
	   }
	}
	   for (i = 0;i < sum - 1;i++)
	   {
	   System.out.printf("%d,",b[i]);
	   }
	   System.out.printf("%d",b[sum - 1]);
	 return 0;
	}
}

