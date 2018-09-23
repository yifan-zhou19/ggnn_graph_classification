package <missing>;

public class GlobalMembers
{
	public static final int maxk = 300;

	public static int Main()
	{
		int k;
		int[] a = new int[maxk];
		int[] f = new int[maxk];

		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < k; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		int ans = 0;

		f[0] = 1;

		for (int i = 1; i < k; i++)
		{
			f[i] = 1;
			for (int j = 0; j < i; j++)
			{
				if (a[j] >= a[i] != 0 && f[j] + 1 > f[i])
				{
					f[i] = f[j] + 1;
				}
			};
			if (f[i] > ans)
			{
				ans = f[i];
			}
		};

		System.out.print(ans);
		System.out.print("\n");

		return 0;
	}
}

