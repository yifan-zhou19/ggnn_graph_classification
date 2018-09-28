package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[301];
		int i;
		int n;
		int m;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			int t = 1;
			int count = 0;
			int x = 0;
			if (m == 0 && n == 0)
			{
				continue;
			}
		for (i = 1;i <= n;i++)
		{
		   a[i] = i;
		}
		while (count <= n - 1)
		{
		for (i = 1;i <= n;i++)
		{
			if (a[i] != 0)
			{
				if (t % m == 0)
				{
					a[i] = 0;
				x = i;
				count++;
				}
				t++;
			}
		}
		}
		System.out.print(x);
		System.out.print("\n");
		}
		return 0;
	}

}

