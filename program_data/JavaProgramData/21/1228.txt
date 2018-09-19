package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int c;
		int i = 0;
		int[] a = new int[300];
		int[] m = new int[300];
		double ave;
		double sum = 0;
		double[] d = new double[300];
		double max = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = sum + a[i];
		}
		ave = sum / n;
		i = 0;
		for (i = 0;i < n;i++)
		{
			d[i] = Math.abs(a[i] - ave);
		}
		i = 0;
		for (i = 0;i < n;i++)
		{
			if (d[i] > max)
			{
				max = d[i];
			}
		}
		i = 0;
		int t = 0;
		int h;
		for (i = 0;i < n;i++)
		{
			if (d[i] == max)
			{
					m[t] = a[i];
					t++;
			}
		}
		h = t - 1;
		t = 0;
		if (h == 0)
		{
			System.out.print(m[0]);
			System.out.print("\n");
		}
		else
		{
			for (t = 0;t < h;t++)
			{
				if (m[t] > m[t + 1])
				{
					c = m[t];
					m[t] = m[t + 1];
					m[t + 1] = c;
				}
			}
		t = 0;
		for (t = 0;t < h;t++)
		{
			System.out.print(m[t]);
			System.out.print(",");
		}
		System.out.print(m[h]);
		System.out.print("\n");
		}
		return 0;
	}

}

