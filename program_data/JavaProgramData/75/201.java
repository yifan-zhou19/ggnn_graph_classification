package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int[] a = new int[2000];
		int n;
		int i = 1;
		int[] b = new int[1000];
		for (int j = 0;j < 2000;++j)
		{
			a[j] = -1;
		}
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (scanf(",%d", a[i]))
		{
		++i;
		}
		n = i;
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		++i;
		while (scanf(",%d", a[i]))
		{
		++i;
		}
		for (int j = 0;j < n;++j)
		{
			int k;
			int m;
			k = a[j];
			m = a[j + n];
			if (m == a[j + n])
			{
				m -= 1;
			}
			for (int l = k;l <= m;++l)
			{
				++b[l];
			}
		}
		sort(b,b + 1000);
		System.out.print(n);
		System.out.print(" ");
		System.out.print(b[999]);
			return 0;
	}
}

