package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20000];
		int i;
		int j;
		int[] b = new int[20000];
		int p = 1;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		for (i = n;i >= 2;i--)
		{
			for (j = i - 1;j >= 1;j--)
			{
				if (a[i] == a[j])
				{
					m += 1;
				}
			}
			if (m == 0)
			{
				b[p] = a[i];
				p++;
			}
			m = 0;
		}
		p = p - 1;
		b[p + 1] = a[1];
		for (i = p + 1;i >= 2;i--)
		{
			System.out.print(b[i]);
			System.out.print(" ");
		}
		System.out.print(b[1]);
		System.out.print("\n");
		return 0;
	}
}

