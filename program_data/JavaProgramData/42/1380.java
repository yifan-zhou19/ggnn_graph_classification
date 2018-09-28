package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int m;
		int t;
		int l;
		int count = 0;
		int[] a = new int[100000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= n - 1; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (j = 0; j <= n - 1 - count; j++)
		{
			if (a[j] == k)
			{
				for (l = 1; ;l++)
				{
					for (m = j; m <= n - 1 - count; m++)
					{
						a[m] = a[m + 1];
					}
					count++;
					if (a[j] != k)
					{
					break;
					}
				}
			}
		}

		System.out.print(a[0]);
		for (t = 1; t <= n - 1 - count; t++)
		{
			System.out.print(" ");
			System.out.print(a[t]);
		}
		return 0;
	}
}

