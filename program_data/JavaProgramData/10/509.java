package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] s = new int[25];
		int[] max = new int[25];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			s[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		max[0] = 1;
		for (i = 1;i < n;i++)
		{
			int m = 1;
			for (j = 0;j < i;j++)
			{
				if (s[i] <= s[j] != 0 && max[j] + 1> m)
				{
					m = max[j] + 1;
				}
			}
			max[i] = m;
		}
		int p = max[0];
		for (i = 1;i < n;i++)
		{
			if (max[i] > p)
			{
				p = max[i];
			}
		}
		System.out.print(p);
		System.out.print("\n");
	}
}

