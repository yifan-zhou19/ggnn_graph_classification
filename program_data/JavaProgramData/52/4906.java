package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = n - m;j < n;j++)
		{
			t = a[j];
			for (int l = j;l > j + m - n;l -= 1)
			{
				a[l] = a[l - 1];
			}
			a[j - n + m] = t;
		}
		for (int k = 0;k < n - 1;k++)
		{
			System.out.print(a[k]);
			System.out.print(" ");
		}
		System.out.print(a[n - 1]);
	}

}

