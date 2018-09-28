package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[310];
		int n;
		int i;
		int j;
		int temp;
		int count = 0;
		double s = 0;
		double[] b = new double[310];
		double m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s += a[i];
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		s = s / n;
		for (i = 0;i < n;i++)
		{
			if (a[i] > s)
			{
				b[i] = a[i] - s;
			}
			else
			{
				b[i] = s - a[i];
			}
			if (b[i] > m)
			{
				m = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] >= m)
			{
				count++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] >= m)
			{
				count--;
				if (count != 0)
				{
					System.out.print(a[i]);
					System.out.print(",");
				}
				else
				{
					System.out.print(a[i]);
					System.out.print("\n");
				}
			}
		}
		return 0;


	}
}

