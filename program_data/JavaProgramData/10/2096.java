package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[30];
		int[] b = new int[30];
		for (int i = 0;i < 30;i++)
		{
			a[i] = b[i] = 1;
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		for (int i = n - 2;i >= 0;i--)
		{
			int max = 1;
			for (int j = i + 1;j < n;j++)
			{
				if (a[i] >= a[j])
				{
					if (1 + b[j] > max)
					{
					max = 1 + b[j];
					}
				}
			}
			b[i] = max;
		}
		int max = 0;
		for (int i = 0;i < n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];

			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

