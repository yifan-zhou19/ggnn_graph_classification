package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[501];
		int k = 0;
		int i;
		int j;
		int m;
		int p;
		int b;
		int o;
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
		}
		for (j = 0;j < n;j++)
		{
			   if (a[j] % 2 == 1)
			   {
				   a[k] = a[j];
				   k++;
			   }
		}

		for (m = 1;m < k - 1;m++)
		{
			for (o = 0;o < k - m;o++)
			{
				if (a[o] > a[o + 1])
				{
					b = a[o];
					a[o] = a[o + 1];
					a[o + 1] = b;
				}
			}
		}
		for (p = 0;p < k;p++)
		{
			if (p == k - 1)
			{
				System.out.printf("%d",a[p]);
			}
			else
			{
				System.out.printf("%d,",a[p]);
			}
		}
		return 0;
	}
}

