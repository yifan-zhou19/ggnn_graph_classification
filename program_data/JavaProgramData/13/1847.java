package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int[] a = new int[20001];
		int i;
		int j;
		int[] b = new int[20001];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1; i <= n; i++)
		{
			for (j = i + 1; j <= n; j++)
			{
				if (a[i] == a[j])
				{
					b[j] = 1;
				}
			}
		}
		for (k = n; k > 0; k--)
		{
			if (b[k] == 0)
			{
				break;
			}
		}
		for (i = 1; i < k; i++)
		{
			if (b[i] == 0)
			{
				System.out.print(a[i]);
				System.out.print(' ');
			}
		}
		System.out.print(a[k]);

		return 0;
	}

}

