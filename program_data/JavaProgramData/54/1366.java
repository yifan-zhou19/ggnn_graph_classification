package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int k;
		int l;
		int y;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int[] a = new int[100];
		i = n + k;
		while (true)
		{
			a[n] = i;
			l = 0;
			y = 0;
			for (int j = 0;j < n - 1;j++)
			{
				a[n - j - 1] = a[n - j] / (n - 1) * n + k;
				if (a[n - j] % (n - 1) == 0)
				{
					l = l + 1;
				}
				else
				{
					break;
				}
			}
			if (l == n - 1)
			{
				System.out.print(a[1]);
				break;
			}
			i = i + n;
		}
		return 0;
	}


}

