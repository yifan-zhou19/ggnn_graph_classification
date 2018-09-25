package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20001];
		int n;
		int i;
		int j;
		int k;
		int p;
		int num = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 1; j <= n - 1; j++)
		{
			for (k = j + 1; k <= n;)
			{
				if (a[j] == a[k])
				{
					for (p = k; p <= n - 1; p++)
					{
						a[p] = a[p + 1];
					}
					n--;
				}
				else
				{
					k++;
				}
			}
		}
		for (i = 1; i < n; i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n]);
		System.out.print("\n");
		return 0;
	}
}

