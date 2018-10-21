package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double x;
		double t2;
		int n;
		int i;
		int j;
		int t1;
		int sum;
		int[] a = new int[305];
		double[] b = new double[305];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sum = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}

				a[i] = Math.abs(a[i]);

			sum = sum + a[i];
		}
		x = (double)((double)sum / (double)n);
		for (i = 0;i < n;i++)
		{
			b[i] = x - a[i];
			b[i] = Math.abs(b[i]);
		}

		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (b[i] < b[i + 1])
				{
					t1 = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t1;
					t2 = b[i];
					b[i] = b[i + 1];
					b[i + 1] = t2;


				}
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			if (b[i] == b[0])
			{
				System.out.printf(",%d",a[i]);
			}
			else
			{
				break;
			}
		}
	}




}

