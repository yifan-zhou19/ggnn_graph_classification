package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] x = new int[100];
		int i;
		int max;
		int max2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		max = 0;
		max2 = 0;
		for (i = 0;i < n;i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			if (x[i] > max)
			{
				max = x[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (x[i] > max2)
			{
				if (x[i] != max)
				{
				max2 = x[i];
				}
			}
		}

			System.out.print(max);
			System.out.print("\n");
			System.out.print(max2);
			System.out.print("\n");
			return 0;
	}

}

