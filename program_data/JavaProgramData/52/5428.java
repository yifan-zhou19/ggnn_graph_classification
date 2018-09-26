package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] a = new int[101];
		int t;
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < n;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < m;i++)
			{
				t = a[n - m + i];
				for (j = n - m - 1 + i;j > i - 1;j--)
				{
					a[j + 1] = a[j];
				}
				a[i] = t;
			}
			for (i = 0;i < n;i++)
			{
				if (i != n - 1)
				{
				   System.out.print(a[i]);
				   System.out.print(" ");
				}
				else
				{
					System.out.print(a[i]);
				}
			}
		}
		return 0;
	}
}

