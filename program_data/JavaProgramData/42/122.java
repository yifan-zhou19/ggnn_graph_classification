package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int t;
		int k;
		int n;
		int i;
		int j;
		int l;
		int s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i - 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (t = 1;t <= 10;t++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				if (a[j] == k)
				{
					for (s = 0;s <= n - 2 - j;s++)
					{
					a[j + s] = a[j + 1 + s];
					}
					n = n - 1;
				}
			}
		}
		System.out.print(a[0]);
		for (l = 1;l <= n - 1;l++)
		{
			System.out.print(" ");
			System.out.print(a[l]);
		}
		return 0;
	}

}

