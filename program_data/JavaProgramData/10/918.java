package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int ans;
	public static int[] f = new int[1000];
	public static int[] a = new int[1000];
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0; i < n; i++)
		{
			f[i] = 1;
			for (int j = 0; j < i; j++)
			{
				if (a[j] >= a[i] != 0 && f[j] + 1 > f[i])
				{
				   f[i] = f[j] + 1;
				}
			}
			ans = ans > f[i] != 0?ans:f[i];
		}
		System.out.print(ans);
		System.out.print("\n");

	}

}

