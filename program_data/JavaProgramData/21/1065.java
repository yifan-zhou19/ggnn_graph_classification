package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] out = new int[100];
		int k = 0;
		int t;
		double average;
		double[] a = new double[300];
		double s = 0;
		double max = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			s = s + a[i]; //??
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			} //????
		}
		average = s / n; //?????
		for (i = 0;i < n;i++)
		{
			if (Math.abs(a[i] - average) > max)
			{
				k = 0;
				max = Math.abs(a[i] - average);
				out[k++] = a[i];
			}
			else if (Math.abs(a[i] - average) == max)
			{
				out[k++] = a[i];
			}
		} //??????????out???
		for (i = 0;i < k;i++)
		{
			if (i == 0)
			{
				System.out.print(out[i]);
			}
			else
			{
				System.out.print(',');
				System.out.print(out[i]);
			}
		} //??
		return 0;
	}
}

