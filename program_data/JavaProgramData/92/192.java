package <missing>;

public class GlobalMembers
{
	public static void sort(int[] a, int n)
	{
		int t;
		int i;
		t = a[n - 1];
		for (i = n - 1;i > 0;i--)
		{
			a[i] = a[i - 1];
		}
		a[0] = t;
	}
	public static void Main()
	{
		int[] a = new int[1010];
		int[] b = new int[1010];
		int k1;
		int k2;
		int max;
		int max1;
		int max2;
		int j;
		int t;
		int n = 1;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;n != 0;)
		{
			max = -10000;

			for (i = 0;i < n;i++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			}
					for (i = 0;i < n;i++)
					{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
					}
			for (i = 0;i < n;i++)
			{
				k1 = i;
				k2 = i;
				max1 = a[i];
				max2 = b[i];
					   for (j = i + 1;j < n;j++)
					   {
						if (a[j] > max1)
						{
							max1 = a[j];
							k1 = j;
						}
						if (b[j] > max2)
						{
							max2 = b[j];
							k2 = j;
						}
					   }
						t = a[i];
						a[i] = a[k1];
						a[k1] = t;
						t = b[i];
						b[i] = b[k2];
						b[k2] = t;
			}
			for (i = 0;i < n;i++)
			{
				t = 0;
			for (j = 0;j < n;j++)
			{
				if (a[j] > b[j])
				{
					t = t + 200;
				}
							  if (a[j] < b[j])
							  {
								  t = t - 200;
							  }
			}
			if (t > max)
			{
				max = t;
			}
			sort(a, n);

			}
			System.out.printf("%d\n",max);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
		}
	}

}

