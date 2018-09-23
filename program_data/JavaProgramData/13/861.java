package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n + 1];
		a[n] = 0;
		for (i = 0;i < n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
		for (j = i + 1;j < n;j++)
		{
			if (a[j] == a[i])
			{
				for (k = j;k < n;k++)
				{
					a[k] = a[k + 1];
				}
				n = n - 1;
				j = j - 1;
			}
		}
		}
		for (i = 0;i < n - 1;i++)
		{
		System.out.print(a[i]);
		System.out.print(' ');
		}
		if (a[i] != 0)
		{
			System.out.print(a[i]);
		}
		return 0;
	}

}

