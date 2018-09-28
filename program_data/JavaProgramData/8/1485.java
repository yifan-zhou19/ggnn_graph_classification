package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[10000];
		int[] b = new int[10000];
		for (int i = 0;i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.in.read();
		for (int i = 0;i <= m - 1;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i <= n - 2;i++)
		{
			for (int j = n - 1;j >= i + 1;j--)
			{
				int l;
				l = Math.max(a[j],a[j - 1]);
				a[j - 1] = Math.min(a[j],a[j - 1]);
				a[j] = l;
			}
		}
		for (int i = 0;i <= m - 2;i++)
		{
			for (int j = m - 1;j >= i + 1;j--)
			{
				int l;
				l = Math.max(b[j],b[j - 1]);
				b[j - 1] = Math.min(b[j],b[j - 1]);
				b[j] = l;
			}
		}
		for (int i = 0;i <= n - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		for (int i = 0;i <= m - 1;i++)
		{
			if (i != m - 1)
			{
				System.out.print(b[i]);
				System.out.print(" ");
			}
			else
			{
				System.out.print(b[i]);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

