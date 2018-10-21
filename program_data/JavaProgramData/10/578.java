package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[k];
		int[] f = new int[k];
		int s = 0;
		for (int i = 0;i < k;i++)
		{
			f[i] = 1;
		}
		for (int i = 0;i < k;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = k - 2;i >= 0;i--)
		{
		for (int j = k - 1;j > i;j--)
		{
			if (a[i] >= a[j] != 0 && f[i] < f[j] + 1)
			{
				f[i] = f[j] + 1;
			}
		}
		if (s < f[i])
		{
			s = f[i];
		}
		}
		System.out.print(s);
	}
}

