package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] sum = new int[25];
		int[] a = new int[25];
		int[] b = new int[25];
		int k;
		int max = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 0;i < k;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = 0;i < k;i++)
	{
	sum[i] = 1;
	}
	sum[k - 1] = 1;


	for (i = k - 1;i >= 1;i--)

	{
		for (j = i - 1;j >= 0;j--)
		{
			if (sum[i] >= sum[j] != 0 && a[j] >= a[i])
			{
			sum[j] = sum[i] + 1;
			}

		}

	}
	   for (i = 0;i < k;i++)
	   {
		  if (sum[i] > max)
		  {
	   max = sum[i];
		  }
	   }
	   System.out.printf("%d",max);


	}

}

