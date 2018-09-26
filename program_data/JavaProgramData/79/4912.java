package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] a = new int[301];
		int c = 1;
		int[] b = new int[100];
		int k = 0;
		int d;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (m != 0)
		{
		for (i = 1;i <= m;i++)
		{
				a[i] = i;
		}
		for (j = 0;j < (m - 1);j++)
		{
			c = (c + n - 1) % (m - j);
			if (c == 0)
			{
				c = m - j;
			}
			for (i = c;i < (m - j);i++)
			{
				a[i] = a[i + 1];
			}
		}
			b[k] = a[1];
			k = k + 1;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = 1;
		}
		for (d = 0;d < k;d++)
		{
			System.out.print(b[d]);
			System.out.print("\n");
		 System.out.print("\n");
		}
		return 0;
	}
}

