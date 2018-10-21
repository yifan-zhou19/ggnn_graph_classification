package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int t = 0;
		int k = 0;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (m != 0 && n != 0)
		{
			int[] a = new int[301];
			i = 0;
			k = 0;
			count = 0;
				while (count < n)
				{
					k++;
					if (k == n + 1)
					{
						k = 1;
					}
					if (a[k] != 1)
					{
						t++;
						if (t == m)
						{
							t = 0;
							a[k] = 1;
							i = k;
							count++;
						}
					}
				}
				System.out.print(i);
				System.out.print("\n");
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		return 0;
	}
}

