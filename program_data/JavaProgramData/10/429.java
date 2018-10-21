package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[30];
	public static int[] b = new int[30];

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 0; i < n; ++i)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = 0;
		}

		b[0] = 1;
		int tmp;
		for (i = 1; i < n; ++i)
		{
			tmp = 0;
			for (j = 0; j < i; ++j)
			{
				if (a[j] >= a[i] != 0 && b[j] > tmp)
				{
					tmp = b[j];
				}
			}
			b[i] = tmp + 1;
		}

		tmp = -1;
		for (i = 0; i < n; ++i)
		{
			if (b[i] > tmp)
			{
				tmp = b[i];
			}
		}
		System.out.print(tmp);
		System.out.print("\n");
		return 0;
	}

}

