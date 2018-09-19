package <missing>;

public class GlobalMembers
{
	public static void swap(double[] num, int a, int b)
	{
		double s = num[a];
		num[a] = num[b];
		num[b] = s;
		return;
	}
	public static int divide(double[] num, int a, int b)
	{
		int k = a - 1;
		for (int i = a;i < b;i++)
		{
			if (num[i] < num[b])
			{
				swap(num, ++k, i);
			}
		}
		swap(num, ++k, b);
		return k;
	}
	public static void qsort(double[] num, int a, int b)
	{
		if (a < b)
		{
			int q = divide(num, a, b);
			qsort(num, a, q - 1);
			qsort(num, q + 1, b);
		}
		return;
	}
	public static double abs(double s)
	{
		if (s > 0)
		{
			return s;
		}
		return -s;
	}
	public static int Main()
	{
		int n;
		double[] num = new double[1010];
		double sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			num[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			sum += num[i];
		}
		qsort(num, 0, n - 1);
		sum /= n;
		double a = abs(num[n - 1] - sum);
		double b = abs(num[0] - sum);
		if (a < b)
		{
			System.out.print(num[0]);
			System.out.print("\n");
		}
		else if (a == b)
		{
			System.out.printf("%d,%d\n",(int)num[0],(int)num[n - 1]);
		}
		else
		{
			System.out.print(num[n - 1]);
			System.out.print("\n");
		}
		return 0;
	}

}

