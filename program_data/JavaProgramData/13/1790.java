package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int m = 0;
		int[] a = new int[20001];
		for (int i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 2; i <= n; i++)
		{
			for (int j = i - 1; j >= 1; j--)
			{
				if (a[i] == a[j])
				{
					a[i] = 0;
				}
			}
		}
		System.out.print(a[1]);
		for (int i = 2; i <= n; i++)
		{
			if (a[i] != 0)
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
		}
		return 0;
	}
}

