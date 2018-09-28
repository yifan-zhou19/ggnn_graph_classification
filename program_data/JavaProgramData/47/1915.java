package <missing>;

public class GlobalMembers
{
	public static final int maxn = 100;
	public static int Main()
	{
		int i = 0;
		int x = 1;
		int n = 0;
		int[] a = new int[maxn];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 0;j <= n - 1;j++)
		{
			a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		while (i < (n + 1) / 2)
		{
			x = a[i];
			a[i] = a[n - 1 - i];
			a[n - 1 - i] = x;
			i++;
		}
		for (int k = 0;k <= n - 2;k++)
		{
				 System.out.print(a[k]);
				 System.out.print(" ");
		}
		System.out.print(a[n - 1]);
		return 0;
	}
}

