package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int[] p = a;
		int v;
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i <= n / 2 - 1;i++)
		{
			v = p[i];
			p[i] = (p + n - 1 - i);
			p[n - 1 - i] = v;
		}
		System.out.print(a[0]);
		for (int i = 1;i < n;i++)
		{
			System.out.print(' ');
			System.out.print(a[i]);
		}
		return 0;
	}

}

