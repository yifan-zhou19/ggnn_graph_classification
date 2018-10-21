package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[201];
		int i;
		int j;
		a[1] = a[0] = 1;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= a[0]; j++)
			{
				a[j] = a[j] * 2;
			}
			for (j = 1; j <= a[0]; j++)
			{
				a[j + 1] += a[j] / 10;
				a[j] = a[j] % 10;
			}
			if (a[a[0] + 1] > 0)
			{
				a[0]++;
			}
		}
		for (i = a[0]; i >= 1; i--)
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");

		return 0;
	}
}

