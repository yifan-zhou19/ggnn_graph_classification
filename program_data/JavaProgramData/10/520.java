package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] a = new int[30];
		int[] f = new int[30];
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < N ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			f[i] = 1;
		}
		int ans = 0;
		for (int i = 1; i < N;i++)
		{
			int mx = 0;
			for (int j = 0;j < i;j++)
			{
				if (a[j] >= a[i] != 0 && f[j] > mx)
				{
					mx = f[j];
				}
			}
			f[i] = mx + 1;
			if (ans < f[i])
			{
				ans = f[i];
			}
		}
		System.out.print(ans);
		System.out.print("\n");
		return 0;
	}
}

