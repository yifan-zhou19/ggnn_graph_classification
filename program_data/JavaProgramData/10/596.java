package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int[] a = new int[25];
		int[] b = new int[25];
		int i;
		int j;
		int max;
		for (i = 0;i < k;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		b[k - 1] = 1;
		for (i = k - 2;i >= 0;i--)
		{
						   max = 0;
						   for (j = i + 1;j <= k - 1;j++)
						   {
											  if (a[j] <= a[i])
											  {
													if (max < b[j])
													{
													max = b[j];
													}
											  }
						   }
						   b[i] = max + 1;
		}
		max = 0;
		for (i = 0;i < k;i++)
		{
					  if (max < b[i])
					  {
					  max = b[i];
					  }
		}
		System.out.printf("%d",max);
		System.in.read();
		System.in.read();
	}

}

