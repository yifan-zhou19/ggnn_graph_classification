package <missing>;

public class GlobalMembers
{
	/*
	 * ????main.cpp
	 * ??????
	 * ?????2013-01-11
	 * ????? n ???????????????????????????????????????????????????????????????????n ???300 
	 *		 ????6???3?6?7?1?5?4????? 26/6=4.33?? 1 ??????
	 */

	public static int Main()
	{
		int n;
		int sum;
		int num = 0;
		int i;
		int j;
		int k;
		int[] a = new int[300];
		int[] t = new int[300];
		double ave;
		double max = 0;
		double D_value;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = 0;
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += a[i];
		}
		ave = (double)sum / (double)n;
		for (i = 0; i < n - 1; i++)
		{
			for (j = 0; j < n - i - 1; j++)
			{
				if (a[i] > a[i + 1])
				{
					k = a[i];
					a[i] = a[i + 1];
					a[i + 1] = k;
				}
			}
		}
		for (i = 0; i <= n / 2; i++)
		{
			for (j = 1; j <= 2; j++)
			{
				if (j == 1)
				{
					D_value = Math.abs((double)a[i] - ave);
				}
				else
				{
					D_value = (double)a[n - i - 1] - ave;
				}
				if (D_value >= max)
				{
					if (D_value > max)
					{
						num = 0;
						max = D_value;
					}
					num += 1;
					if (j == 1)
					{
						t[num] = a[i];
					}
					else
					{
						t[num] = a[n - i - 1];
					}
				}
			}
		}
		System.out.print(t[1]);
		for (i = 2; i <= num; i++)
		{
			System.out.print(',');
			System.out.print(t[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

