package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int[] b = new int[100000];
		int i;
		int j;
		int n;
		int k = 0;
		int m = 0;
		int[] count = new int[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; ;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] == 0 && b[i] == 0)
			{
				break;
			}
			m++;
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < m; j++)
			{
				if (b[j] == i)
				{
					count[i]++;
				}
			}
		}
		for (i = 0; i < n; i++)
		{
			if (count[i] == n - 1)
			{
				k = 1;
				for (j = 0; j < m; j++)
				{
					if (a[j] == i)
					{
						break;
					}
				}
				if (j == m)
				{
					System.out.print(i);
					System.out.print("\n");
					break;
				}
				else
				{
					k = 0;
					break;
				}
			}
		}
		if (k == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

