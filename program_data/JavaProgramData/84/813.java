package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i = 1;i <= n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n - 1;j++)
			{
				if (a[j] < a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		System.out.print(a[1]);
		System.out.print("\n");
		System.out.print(a[2]);
		System.out.print("\n");
		return 0;
	}
}

