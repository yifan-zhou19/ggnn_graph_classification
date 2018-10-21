package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int[] h = new int[25];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		for (i = n - 1;i >= 0;i--)
		{
			h[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int[] d = new int[25];
		d[0] = 1;
		int j = 0;
		int max = 0;
		for (i = 1;i < n;i++)
		{
			max = 0;
			for (j = 0;j < i;j++)
			{
				if (max < d[j] && h[i] >= h[j])
				{
					max = d[j];
				}
			}
			d[i] = max + 1;
		}
		max = 0;
		for (i = 0;i < n;i++)
		{
			if (d[i] > max)
			{
				max = d[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

