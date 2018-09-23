package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] a = new int[30];
		int[] f = new int[30];
		int max = new int(int,int);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n;i++)
		{
			f[i] = 1;
		}
		for (i = 2;i <= n;i++)
		{
			for (j = 1;j < i;j++)
			{
				if (a[j] >= a[i])
				{
					f[i] = max(f[j] + 1, f[i]);
				}
			}
		}
		m = f[1];
		for (i = 2;i <= n;i++)
		{
			m = max(m, f[i]);
		}
		System.out.print(m);
		System.out.print("\n");
		return 0;
	}

	public static int max(int a,int b)
	{
		if (a > b)
		{
			b = a;
		}
		return b;
	}
}

