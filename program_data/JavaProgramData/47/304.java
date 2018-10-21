package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[102];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int c = 0;
		for (int k = n - 1;k >= 0;k--)
		{
			System.out.print(a[k]);
			c++;
			if (c != n)
			{
				System.out.print(" ");
			}
		}
	}
}

