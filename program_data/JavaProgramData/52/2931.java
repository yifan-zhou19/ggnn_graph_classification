package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		int m;
		int[] a = new int[200];
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		while (m > 0)
		{
			t = a[n - 1];
			for (j = n - 1;j > 0;j--)
			{
				a[j] = a[j - 1];
			}
			a[0] = t;
			m--;
		}
		System.out.print(a[0]);
		for (k = 1;k < n;k++)
		{
			System.out.print(" ");
			System.out.print(a[k]);
		}
		return 0;
	}

}

