package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[21];
		int n;
		int i;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[1] = 1;
		a[2] = 1;
		while (n-- != 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 1 || m == 2)
			{
				System.out.print(1);
				System.out.print("\n");
			}
			else
			{
				for (i = 3; i <= m; i++)
				{
					a[i] = a[i - 1] + a[i - 2];
				}
				System.out.print(a[m]);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

