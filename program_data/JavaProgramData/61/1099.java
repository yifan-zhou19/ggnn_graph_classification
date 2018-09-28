package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int maxi;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] m = new int[n];
		maxi = 0;
		for (int i = 0; i <= n - 1;i++)
		{
			m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			maxi = Math.max(m[i],maxi);
		}
		int[] a = new int[maxi];
		a[0] = 1;
		a[1] = 1;
		for (int j = 2; j <= maxi - 1; j++)
		{
			a[j] = a[j - 1] + a[j - 2];
		}
		for (int k = 0; k <= n - 1; k++)
		{
			System.out.print(a[m[k] - 1]);
			System.out.print("\n");
		}
		return 0;
	}
}

