package <missing>;

public class GlobalMembers
{
	//????????
	public static int[] a = new int[100001];
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; ++i)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = j = 1; i <= n; ++i)
		{
			if (a[i] == k)
			{
				for (j = Math.max(j, i); j <= n; ++j)
				{
					if (a[j] != k)
					{
						break;
					}
				}
				if (j <= n)
				{
					swap(a[i], a[j]);
				}
				else
				{
					break;
				}
			}
			if (i > 1)
			{
				System.out.print(' ');
			}
			System.out.print(a[i]);
		}
		return 0;
	}
}

