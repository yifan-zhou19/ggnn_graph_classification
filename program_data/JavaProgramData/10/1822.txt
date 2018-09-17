package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k; //a[i][j]???ij???????????????
		int[] h = new int[25];
		int[][] a = new int[25][25];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < k; i++)
		{
			h[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int max = 1;
		for (int i = 0; i < k; i++) //???
		{
			a[i][i] = 1;
		}
		for (int i = 0; i < k - 1; i++)
		{
			for (int j = i + 1; j < k; j++)
			{
				a[i][j] = 1;
				for (int k = i; k < j; k++)
				{
					if (h[k] >= h[j] != 0 && a[i][k] + 1 > a[i][j])
					{
						a[i][j] = a[i][k] + 1;
					}
				}
				if (a[i][j] > max)
				{
					max = a[i][j];
				}
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

