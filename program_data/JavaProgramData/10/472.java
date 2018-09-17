package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[25];
	public static int[] result = new int[25];

	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = k - 1; i >= 0; i--)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		result[0] = 1;
		for (int i = 1; i < k; i++)
		{
			int j = i - 1;
			while (j >= 0)
			{
				if (a[j] <= a[i])
				{
					if (result[j] > result[i])
					{
						result[i] = result[j];
					}
				}
				j--;
			}
			result[i]++;
		}

		int t = 0;
		for (int i = 0; i < k; i++)
		{
			if (result[i] > t)
			{
				t = result[i];
			}
		}

		System.out.print(t);
	}
}

