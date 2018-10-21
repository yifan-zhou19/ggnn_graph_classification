package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double sum = 0.0;
		double ave;
		double[] a = new double[300];
		double[] b = new double[300];
		double[] c = {0.0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] d = new int[300];
		int i;
		int j;
		int num = 0;
		double temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			sum = sum + a[i];
		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = 0; j < n - 1 - i; j++)
			{
				if (a[i] < a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		ave = sum / n;
		for (i = 0; i < n; i++)
		{
			b[i] = Math.abs(a[i] - ave);
		}
		double max = 0.0;
		for (i = 0; i < n; i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = 0; i < n; i++)
		{
			if ((max - b[i]) < 1e-6)
			{
				num++;
			}
		}
		if (num == 1)
		{
			for (i = 0; i < n; i++)
			{
				 if ((max - b[i]) < 1e-6)
				 {
				System.out.print(a[i]);
				System.out.print("\n");
				 }
			}
		}
		if (num > 1)
		{
			for (i = 0; i < n; i++)
			{
				if ((max - b[i]) < 1e-6)
				{
					if (num == 1)
					{
					System.out.print(a[i]);
					}
					if (num > 1)
					{
						System.out.print(a[i]);
						System.out.print(",");
						num--;
					}
				}
			}
		}

		return 0;
	}


}

