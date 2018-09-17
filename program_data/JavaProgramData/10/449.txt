package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] height = new int[27];
		int[] result = new int[27];
		int k;
		int i;
		int j;
		int nmax;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= k; i++)
		{
			height[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		height[k + 1] = 0;
		result[k + 1] = 0;
		for (i = k; i > 0; i--)
		{
			nmax = 0;
			for (j = i + 1; j <= k + 1; j++)
			{
				if (height[i] >= height[j])
				{
					if (result[j] > nmax)
					{
						nmax = result[j];
					}
				}
			}
			result[i] = nmax + 1;
		}
		nmax = 0;
		for (i = 1; i < k; i++)
		{
			if (result[i] > nmax)
			{
				nmax = result[i];
			}
		}
		System.out.print(nmax);
		System.out.print("\n");
		return 0;
	}
}

