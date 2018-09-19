package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int r;
		int sum = 0;
		int[] a = new int[300];
		int k;
		double[] t = new double[300];
		double p;
		double b;
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
			sum = sum + a[i];
		}
		for (j = n - 1;j > 0;j--)
		{
			for (r = 0;r < j;r++)
			{
				if (a[r] > a[r + 1])
				{
					k = a[r];
					a[r] = a[r + 1];
					a[r + 1] = k;
				}
			}
		}
		p = (double)sum / n;
		for (i = 0;i < n;i++)
		{
			if ((double)a[i] - p < 0)
			{
				t[i] = p - (double)a[i];
			}
			else
			{
				t[i] = (double)a[i] - p;
			}
			if (t[i] > b)
			{
				b = t[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (t[i] == b)
			{
				System.out.printf("%d",a[i]);
				j = i;
				if (j < n - 1)
				{
				   for (r = j + 1;r < n;r++)
				   {
					   if (t[r] == b)
					   {
						  System.out.printf(",%d",a[r]);

					   }
				   }
				}
				break;
			}


		}



		return 0;

	}
}

