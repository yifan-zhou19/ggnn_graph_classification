package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50];
		int i;
		int j;
		int k = 0;
		int n;
		int p = 48;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[49] = 1;
		for (i = 1; i <= n; i++)
		{
			for (j = 49; j >= p; j--)
			{
				a[j] = a[j] * 2 + k;
				if (a[j] >= 10)
				{
					k = 1;
					a[j] = a[j] - 10;
				}
				else
				{
					k = 0;
				}
			}
			if (a[p] > 0)
			{
				p--;
			}
		}
		while (a[p] == 0)
		{
			p++;
		}
		for (i = p; i <= 49; i++)
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

