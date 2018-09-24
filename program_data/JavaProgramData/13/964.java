package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20000];
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = n - 1; i > 0; i--)
		{
			for (j = 0; j < i; j++)
			{
				if (a[i] == a[j])
				{
					for (k = i ; k < n; k++)
					{
						a[k] = a[k + 1];
					}
					n = n - 1;
				}
			}
		}
		for (i = 0; i <= n - 1; i++)
		{
			System.out.print(a[i]);
			if (i != n - 1)
			{
				System.out.print(" ");
			}
		}
		return 0;
	}
}

