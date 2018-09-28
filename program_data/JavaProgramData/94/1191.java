package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int n = 0;
		int c;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] b = new int[N];
		for (int i = 0; i < N; i++)
		{
			c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (c % 2 == 1)
			{
				b[n] = c;
				n++;
			}
		}
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
		{
			a[i] = b[i];
		}
		int m;
		for (int i = n; i >= 0; i--)
		{
			for (int j = 0; j < i - 1; j++)
			{
				if (a[j] > a[j + 1])
				{
					m = a[j + 1];
					a[j + 1] = a[j];
					a[j] = m;
				}
			}
		}
		for (int i = 0; i < n; i++)
		{
			if (i == n - 1)
			{
				System.out.print(a[i]);
				System.out.print("\n");
			}
			else
			{
				System.out.print(a[i]);
				System.out.print(',');
			}
		}
		return 0;
	}
}

