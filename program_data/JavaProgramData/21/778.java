package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void sort(int a[], int n);
		int[] a = new int[300 + 10];
		int i;
		double sum = 0;
		double aver;
		int n;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += a[i];
		}
		aver = sum / n;
		sort(a, n);
	   // for (i = 0; i < n; i++)
	   //     cout << a[i] << end l;
		if (Math.abs(aver - a[0] - a[n - 1] + aver) < 1e-10)
		{
			System.out.print(a[0]);
			System.out.print(",");
			System.out.print(a[n - 1]);
			System.out.print("\n");
		}
		else if (aver - a[0] > a[n - 1] - aver)
		{
			System.out.print(a[0]);
			System.out.print("\n");
		}
		else if (aver - a[0] < a[n - 1] - aver)
		{
			System.out.print(a[n - 1]);
			System.out.print("\n");
		}

		return 0;
	}

	public static void sort(int[] a, int n)
	{
		int i;
		int j;
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				if (a[i] > a[j])
				{
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
	}

}

