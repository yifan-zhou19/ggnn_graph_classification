package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int n;
		int m;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		j = 0;
		for (i = n;i < 2 * n - m;i++)
		{
			  a[i] = a[j];
			 j++;
		}
		for (i = n - m;i < 2 * n - m - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		System.out.print(a[2 * n - m - 1]);
		return 0;
	}

}

