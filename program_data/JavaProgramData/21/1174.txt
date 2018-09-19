package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int j;
		int k;
		int l;
		double ave = 0.0;
		double max = 0.0;
		int[] b = new int[300];
		int temp = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			ave = ave + a[i];
		}
		ave = ave / n;
		j = 0;
		max = Math.abs(a[0] - ave);
		for (i = 0;i < n;i++)
		{
			if (max < Math.abs(a[i] - ave))
			{
				max = Math.abs(a[i] - ave);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (Math.abs(Math.abs(a[i] - ave) - max) < 1e-9)
			{
				b[j] = a[i];
				j = j + 1;
			}
		}
		for (k = j - 2;k > 0;k--)
		{
			  for (l = 0;l < k;l++)
			  {
					  if (b[l] > b[l + 1])
					  {
						  temp = b[l];
						  b[l] = b[l + 1];
						  b[l + 1] = temp;
					  }
			  }

		}
		System.out.printf("%d",b[0]);
		for (k = 1;k < j;k++)
		{
			System.out.printf(",%d",b[k]);
		}
		return 0;
	}


}

