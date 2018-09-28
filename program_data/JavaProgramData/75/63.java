package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i;
		int j;
		int[] x = new int[1000];
		int[] y = new int[1000];
		int[] count = new int[1001];
		int max = 0;
		while (true)
		{
			x[n++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		for (i = 0; i < n; i++)
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = x[i]; j < y[i]; j++)
			{
				count[j]++; // ?????????????
			}
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		for (i = 0; i < 1001; i++)
		{
			if (max < count[i])
			{
				max = count[i];
			}
		}
		System.out.print(n);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

