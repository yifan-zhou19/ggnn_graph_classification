package <missing>;

public class GlobalMembers
{
	public static int f(int n,int k)
	{
		int i;
		int[] a = new int[100];
			for (a[1] = n + k;;a[1] += n)
			{
			for (int i = 2;i <= n;i++)
			{
					if (a[i - 1] % (n - 1) != 0)
					{
						break;
					}
					a[i] = a[i - 1] / (n - 1) * n + k;
					if (i == n)
					{
						return a[n];
					}
			}
			}
	}
	public static int Main()
	{
		int n;

		int k;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = f(n, k);
		System.out.print(m);

	}
}

