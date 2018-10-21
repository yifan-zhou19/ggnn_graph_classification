package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print("1");
			System.out.print("\n");
		}
		int k = 99;
		int[] a = {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		for (int i = 0;i < n - 1 && n != 0;i++)
		{
			for (int j = 0;j < n;j++)
			{
				a[j] = a[j] * 2;
			}
			for (int j = 0;j < n;j++)
			{
				if (a[j] >= 10)
				{
					a[j + 1] = a[j + 1] + a[j] / 10;
					a[j] = a[j] % 10;
				}
			}
		}

		while (a[k] == 0)
		{
			k--;
		}
		for (int j = k;j >= 0 && n != 0;j--)
		{
			System.out.print(a[j]);
		}
		System.out.print("\n");
		return 0;
	}

}

