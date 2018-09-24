package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] t = new int[300];
		int j;
		int k;
		double v;
		double[] a = new double[300];
		double sum = 0.0;
		double max = 0.0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			sum += a[i];
		}
		v = (double)sum / n;
		for (i = 0; i < n; i++)
		{
			if (max < Math.abs(a[i] - v))
			{
				max = Math.abs(a[i] - v);
				j = 0;
				t[j++] = a[i];
			}
			else if (max == Math.abs(a[i] - v))
			{
				t[j++] = a[i];
			}
		}
		for (i = 0; i < j - 1; i++)
		{
			for (k = i + 1; k < j; k++)
			{
				if (a[i] > a[k])
				{
					int temp = t[i];
					t[i] = t[k];
					t[k] = temp;
				}
			}
		}
		System.out.print(t[0]);
		for (i = 1; i < j; i++)
		{
			System.out.print(",");
			System.out.print(t[i]);
		}
		System.out.print("\n");
		return 0;
	}




}

