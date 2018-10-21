package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] a = new int[500];
		int i;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < N; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int[] b = new int[500];
		int j;
		int k = 1;
		for (j = 0; j < N; j++)
		{
			if (a[j] % 2 != 0)
			{
				b[k] = a[j];
				k++;
			}
		}
		int c;
		int d;
		int e;
		for (c = 1; c < k; c++)
		{
			for (d = 1; d < k - c; d++)
			{
				if (b[d] > b[d + 1])
				{
					e = b[d];
					b[d] = b[d + 1];
					b[d + 1] = e;
				}
			}
		}
		int t;
		for (t = 1; t < k - 1; t++)
		{
			System.out.print(b[t]);
			System.out.print(',');
		}
		System.out.print(b[k - 1]);
		System.out.print("\n");
		return 0;
	}

}

