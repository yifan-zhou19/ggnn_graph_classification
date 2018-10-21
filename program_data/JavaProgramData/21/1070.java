package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double aver;
		double[] a = new double[310];
		double[] b = new double[310];
		double sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i],sum = sum + a[i] = ConsoleInput.readToWhiteSpace(true);
		}
		aver = sum / n;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
				double t;
				t = a[j];
				a[j] = a[j + 1];
				a[j + 1] = t;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			b[i] = Math.abs(a[i] - aver);
		}
		double max = 0;
		for (i = 0;i < n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		int[] c = new int[300];
		int k = 0;
		for (i = 0;i < n;i++)
		{
			if (b[i] == max)
			{
				c[k] = i,k++;
			}
		}
		System.out.print(a[c[0]]);
	   for (i = 1;i < k;i++)
	   {
		   System.out.print(',');
		   System.out.print(a[c[i]]);
	   }
	   System.out.print("\n");
	   return 0;

	}
}

