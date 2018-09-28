package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100001];
		int k;
		int i;
		int j;
		int l = 0;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			if (a[i] == k)
			{
				l++;
			}
		}
		for (i = 1;i <= n - m;i++)
		{
			if (a[i] == k)
			{
				for (j = i;j <= n - 1;j++)
				{
					a[j] = a[j + 1];
				}
				i = i - 1;
				m++;
			}
		}
		for (i = 1;i <= n - l - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		System.out.print(a[n - l]);
		System.out.print("\n");
		return 0;
	}
}

