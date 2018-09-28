package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int m;
		int n;
		int t;
		int[] a = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true);
		}
		for (k = 1;k <= m;k++)
		{
			t = (a + n - 1);
			for (i = n - 1;i > 0;i--)
			{
				a[i] = (a + i - 1);
			}
			a[0] = t;
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print((a + i));
			System.out.print(' ');
		}
		System.out.print((a + i));
		return 0;
	}

}

