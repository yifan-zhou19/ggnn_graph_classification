package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double sum = 0;
		double ave = 0;
		double[] a = new double[300];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			sum = sum + a[i];
		}
		ave = sum / n;
		double[] dis = new double[300];
		for (i = 0;i < n;i++)
		{
			dis[i] = Math.abs(a[i] - ave);
		}
		double max = 0;
		for (i = 0;i < n;i++)
		{
			if (dis[i] > max)
			{
				max = dis[i];
			}
		}
		double[] b = new double[300];
		int k = 0;
		int temp = 0;
		for (i = 0;i < n;i++)
		{
			if (Math.abs(dis[i] - max) < 0.01)
			{
				b[k] = a[i];
				k++;
			}
		}
		if (k == 1)
		{
			System.out.print(b[0]);
		}
		else
		{
		for (i = 0;i < k;i++)
		{
			for (j = i + 1;j < k;j++)
			{
				if (b[i] > b[j])
				{
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		System.out.print(b[0]);
		for (i = 1;i < k;i++)
		{
			System.out.print(",");
			System.out.print(b[i]);
		}
		}
		return 0;
	}


}

