package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int k = 0;
		int j = 0;
		int f = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			if (a[i] == k)
			{
				f = f + 1;
				for (j = i;j < n - 1;j++)
				{
					a[j] = a[j + 1];
				}
				i = i - 1;
				a[n - 1] = 0;
			}
		}
		for (i = 0;i < n - f;i++)
		{
			if (i < n - f - 1)
			{
				System.out.print(a[i]);
				System.out.print(' ');
			}
			if (i == n - f - 1)
			{
				System.out.print(a[i]);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

