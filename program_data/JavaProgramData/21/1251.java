package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int t;
		double sum = 0;
		double average;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += a[i];
		}
		average = sum / n;
		for (int j = 0;j < n - 1;j++)
		{
			for (int k = n - 1;k > j;k--)
			{
				if (a[k] < a[k - 1])
				{
					t = a[k];
					a[k] = a[k - 1];
					a[k - 1] = t;
				}
			}
		}
		if ((average - a[0]) > (a[n - 1] - average))
		{
			System.out.print(a[0]);
			System.out.print("\n");
		}
		else if ((average - a[0]) < (a[n - 1] - average))
		{
			System.out.print(a[n - 1]);
			System.out.print("\n");
		}
		else if ((average - a[0]) == (a[n - 1] - average))
		{
			System.out.print(a[0]);
			System.out.print(",");
			System.out.print(a[n - 1]);
			System.out.print("\n");
		}
		return 0;
	}

}

