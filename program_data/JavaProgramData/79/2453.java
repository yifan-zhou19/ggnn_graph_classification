package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[301];
		int n;
		int m;
		while (true)
		{
			int i;
			int j = 0;
			int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			break;
		}
		for (i = 1;i <= n;i++)
		{
			a[i] = 1;
		}
		for (i = 1;i <= n;i++)
		{
				j = j + a[i];
				if (j == m)
				{
					a[i] = 0;
					j = 0;
					k++;
				}
			if (k == n)
			{
				System.out.print(i);
				System.out.print("\n");
				break;
			}
			if (i == n)
			{
				i = 0;
			}
		}
		}
		return 0;
	}

}

