package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int q;
		int K;
		int n;
		int i;
		int sum = 0;
		int j;
		int k;
		double aver;
		double p;
		double[] b = new double[300];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = sum + a[i];
		}
		aver = (double)sum / n;
		for (i = 0;i < n;i++)
		{
			b[i] = Math.abs(a[i] - aver);

		}
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (b[i] < b[i + 1])
				{
					p = b[i];
					q = a[i];
					b[i] = b[i + 1];
					a[i] = a[i + 1];
					b[i + 1] = p;
					a[i + 1] = q;
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			if (b[i - 1] > b[i])
			{
				K = i - 1;
				break;
			}
		}
		for (k = 0;k < K;k++)
		{
			System.out.print(a[k]);
			System.out.print(',');
		}
			System.out.print(a[K]);
			System.out.print("\n");

	return 0;
	}





}

