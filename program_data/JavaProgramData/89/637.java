package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 1;
		int j;
		int k;
		int g;
		int n;
		int c;
		int d;
		int q = 0;
		int[] a = new int[100000];
		int[] b = new int[100000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] == 0 && b[i] == 0)
			{
				break;
			}
			i++;
		}
		for (k = 0;k < n;k++)
		{
			g = 0;
			d = 0;
			for (j = 1;j < i;j++)
			{
				if (b[j] == k)
				{
					g++;
				}
			}
			if (g == n - 1)
			{
				for (c = 1;c < i;c++)
				{
					if (a[c] != k)
					{
						d++;
					}
				}
				if (d == i - 1)
				{
					System.out.print(k);
					System.out.print("\n");
				q++;
				break;
				}
			}
		}
		if (q == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}

}

