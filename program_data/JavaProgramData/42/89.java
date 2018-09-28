package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   int[] a = new int[100000];
		   int i;
		   int j;
		   int n;
		   int k;
		   int sum;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   sum = n;
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
		   for (i = 0;i < sum;i++)
		   {
			   if (a[i] == k)
			   {
				   sum = sum - 1;
				   for (j = i;j < sum;j++)
				   {
					   a[j] = a[j + 1];
				   }
			   i = i - 1;
			   }
		   }
		   for (i = 0;i < sum - 1;i++)
		   {
			   System.out.printf("%d ",a[i]);
		   }
		   System.out.printf("%d",a[sum - 1]);
	}

}

