package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int p;
		int k;
		int b;
		int n;
		int j = 0;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100000];
		for (p = 0;p <= n - 1;p++)
		{
			a[p] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		};
		System.out.print("\n");
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (t = 0;t <= n - 1;t++)
		{
			if (a[t] != b)
			{
			break;
			}
		}
		for (i = t + 1,j = t + 1;j <= n - 1;j++)
		{
			if (a[j] != b)
			{
				a[i] = a[j];
				i++;
			}
		}
			System.out.print(a[t]);

		for (k = t + 1;k <= i - 1;k++)
		{
			System.out.print(" ");
			System.out.print(a[k]);
		}
		return 0;
	}
}

