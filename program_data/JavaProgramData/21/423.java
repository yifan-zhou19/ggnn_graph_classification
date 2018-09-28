package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] sum = new int[300];
		int t1;
		double ave = 0.0;
		double t;
		double[] a = new double[300];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			sum[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ave = ave + sum[i];
		}
		ave = ave / n;
		for (i = 1; i <= n; i++)
		{
			a[i] = Math.abs(sum[i] - ave);
		}
		for (i = 1; i < n; i++)
		{
			for (j = 1; j <= n - i; j++)
			{
				if (a[j] - a[j + 1] < 0)
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
					t1 = sum[j];
					sum[j] = sum[j + 1];
					sum[j + 1] = t;
				}
			}
		}
		if (a[1] - a[2] < 0.000001)
		{
			if (sum[1] < sum[2])
			{
				System.out.print(sum[1]);
				System.out.print(",");
				System.out.print(sum[2]);
				System.out.print("\n");
			}
			else
			{
				System.out.print(sum[2]);
				System.out.print(",");
				System.out.print(sum[1]);
				System.out.print("\n");
			}
		}
		else
		{
			System.out.print(sum[1]);
			System.out.print("\n");
		}
		return 0;
	}
}

