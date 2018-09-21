package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final int N = 300;
		int[] a = new int[N];
		int i;
		int n;
		int j;
		double sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = sum + a[i];
		}
		double ave;
		ave = sum / n;
		double[] b = new double[N];
		double temp1;
		int temp2;
		for (i = 0; i < n; i++)
		{
			b[i] = Math.abs(a[i] - ave);
		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = 0; j < n - 1 - i; j++)
			{
				if (b[j] < b[j + 1] || Math.abs(b[j] - b[j + 1]) < 0.000001)
				{
					temp1 = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp1;
					temp2 = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp2;
				}
			}
		}
		int[] c = new int[N];
		c[0] = a[0];
		for (i = 1; i < n; i++)
		{
			if (Math.abs(b[i] - b[0]) < 0.000001)
			{
				c[i] = a[i];
			}
			else
			{
				break;
			}
		}
		for (j = 0; j < i; j++)
		{
			for (int k = 0; k < i - 1; k++)
			{
				if (c[k] > c[k + 1])
				{
					temp2 = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp2;
				}
			}
		}
		System.out.print(c[0]);
		for (j = 1; j < i; j++)
		{
			System.out.print(",");
			System.out.print(c[j]);
		}
		System.out.print("\n");
		return 0;
	}


}

