package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int x;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int[] sum = new int[n];
		for (k = 0;k < n;k = k + 1)
		{
			a[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[[]] b = new int[a[k]];
	b[0] = 1;
	b[1] = 1;
			for (x = 2;x < a[k];x = x + 1)
			{
				b[x] = b[x - 1] + b[x - 2];

			}
			sum[k] = b[a[k] - 1];
		}
		for (k = 0;k < n;k = k + 1)
		{
			System.out.print(sum[k]);
			System.out.print("\n");
		}
		return 0;






	}
}

