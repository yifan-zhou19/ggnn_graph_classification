package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100001];
		int n;
		int i;
		int m;
		int l;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[n + 1] = k;
		l = 2;
		for (i = n;i >= 1;i--)
		{
			if (a[i] == k)
			{
				for (m = i; m <= n; m++)
				{
					a[m] = a[m + 1];
				}
			}
		}
		System.out.print(a[1]);
		while (a[l] != k)
		{
			System.out.print(" ");
			System.out.print(a[l]);
			l = l + 1;
		}
	System.out.print("\n");
		return 0;
	}
}

