package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] x = new int[15];
		int count;
		while (true)
		{
			count = 0;
			for (n = 0; ; n++)
			{
				x[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (x[n] <= 0)
				{
					break;
				}
			}
			if (x[n] == -1)
			{
				break;
			}
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (j == i)
					{
						continue;
					}
					if (x[j] == 2 * x[i])
					{
						count++;
					}
				};
			}
			System.out.print(count);
			System.out.print("\n");
		}
		return 0;
	}
}

