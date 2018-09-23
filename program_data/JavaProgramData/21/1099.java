package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[302];
		double[] b = new double[302];
		double num = 0;
		double average = 0;
		double k;
		int n;
		int p = 0;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			num = num + a[i];
		}
		average = num / n;
		k = Math.abs(a[0] - average);
		for (i = 0; i < n; i++)
		{
			if (Math.abs(a[i] - average) > k)
			{
				p = 1;
				k = Math.abs(a[i] - average);
				b[p] = a[i];
			}
			else
			{
				if (Math.abs(a[i] - average) == k)
				{
					p++;
					b[p] = a[i];
				}
			}
		}
		for (i = 1; i <= p; i++)
		{
			for (j = 1; j <= p - i; j++)
			{
				if (b[j] > b[j + 1])
				{
					k = b[j];
					b[j] = b[j + 1];
					b[j + 1] = b[j];
				}
			}
		}
		for (i = 1; i <= p; i++)
		{
			if (i == 1)
			{
				System.out.print(b[i]);
			}
			else
			{
				System.out.print(",");
				System.out.print(b[i]);
			}
		}
		System.out.print("\n");
		return 0;
	}






}

