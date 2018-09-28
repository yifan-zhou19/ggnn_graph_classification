package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[300];
		int tempint;
		int count = 1;
		double aver = 0;
		double[] b = new double[300];
		double temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			aver += a[i];
		}
		aver = aver / n;
		for (i = 0; i < n; i++)
		{
			b[i] = Math.abs(aver - a[i]);
		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = 0; j < n - 1 - i; j++)
			{
				if (b[j] < b[j + 1])
				{
					temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
					tempint = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tempint;
				}
			}
		}
		i = 0;
		while (Math.abs(b[i] - b[i + 1]) < 10e-6)
		{
			count++;
			i++;
		}
		System.out.print(a[0]);
		for (i = 1; i <= count - 1; i++)
		{
			System.out.print(",");
			System.out.print(a[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

