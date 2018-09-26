package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int t;
		int[] a = new int[21];
		int j;
		a[2] = a[1] = 1;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= t;i++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n <= 2)
			{
				System.out.print(1);
				System.out.print("\n");
				continue;
			}
			else
			{
				for (j = 3;j <= n;j++)
				{
					a[j] = a[j - 1] + a[j - 2];
				}
			}
			System.out.print(a[n]);
			System.out.print("\n");
		}
		return 0;
	}
}

