package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int k;
		int i;
		int j;
		int[] a = new int[25];
		int[] b = new int[25];
		int max;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 0;i <= k - 1;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = k - 1;i >= 0;i--)
	{
					   if (i == k - 1)
					   {
					   b[i] = 1;
					   }
					   else
					   {
						   max = 0;
						   for (j = i + 1;j <= k - 1;j++)
						   {
					   if (a[j] <= a[i] != 0 && b[j] >= max)
					   {
					   max = b[j];
					   }
						   }
					   b[i] = max + 1;
					   }
	}
	max = 0;
	for (i = 0;i <= k - 1;i++)
	{
		if (b[i] >= max)
		{
	max = b[i];
		}
	}
	System.out.printf("%d",max);



	   return 0;
	}

}

