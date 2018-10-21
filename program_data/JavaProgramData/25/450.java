package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100001];

	public static int Main()
	{
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int p;
		int q;
		int x;
		a[0] = 2;
		if (N == 0)
		{
			System.out.print(1);
			System.exit(1);
		}
		else
		{
			for (i = 1;i <= N - 1;i++)
			{
				for (j = 0;j < 1000;j++)
				{
					a[j] = a[j] + a[j];
				}
				for (x = 0;x < 1000;x++)
				{
					if (a[x] >= 10)
					{
						a[x] = a[x] - 10;
						a[x + 1] = a[x + 1] + 1;
					}
				}
			}
		}

		p = 1000;
		while (a[p] == 0)
		{
			p--;
		}

		for (q = p;q >= 0;q--)
		{
			System.out.print(a[q]);
		}
		return 0;
	}
}

