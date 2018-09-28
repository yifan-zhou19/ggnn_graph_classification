package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[40];
		int i;
		int k;
		int j = 0;
		int n;
		int m;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = n - m;i <= n - 1;i++)
		{
			for (k = i;k > j;k--)
			{
				temp = a[k];
				a[k] = a[k - 1];
				a[k - 1] = temp;
			}
			j += 1;
		}
		System.out.print(a[0]);
		for (i = 1;i < n;i++)
		{
			System.out.print(' ');
			System.out.print(a[i]);
		}
			return 0;
	}

}

