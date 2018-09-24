package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int x = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int k = 0;k < n - 1;k++)
		{
			for (int j = k + 1;j < n;j++)
			{
				if (a[j] + a[k] == m)
				{
					x = 1;
				}
			}
		}
		if (x == 1)
		{
			System.out.print("yes");
		}
		else if (x == 0)
		{
			System.out.print("no");
		}
		return 0;
	}


}

