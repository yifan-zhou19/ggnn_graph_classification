package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int[] h = new int[30];
		int[] l = new int[30];
		int[] r = new int[30];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			h[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			l[i] = 1;
			r[i] = 1;
		}
		for (i = 1;i < k;i++)
		{
			for (int j = 0;j < i;j++)
			{
				if (h[j] >= h[i] != 0 && (l[j] + 1) > l[i])
				{
					l[i] = l[j] + 1;
				}
			}
		}
		for (i = k - 2;i > 0;i--)
		{
			for (int j = k - 1;j > i;j--)
			{
				if (h[j] <= h[i] != 0 && (r[j] + 1)> r[i])
				{
					r[i] = r[j] + 1;
				}
			}
		}
		int m = 0;
		for (i = 0;i < k;i++)
		{
			if (l[i] + r[i] - 1 > m)
			{
				m = l[i] + r[i] - 1;
			}
		}
		System.out.print(m);
		System.out.print("\n");
		return 0;
	}



}

