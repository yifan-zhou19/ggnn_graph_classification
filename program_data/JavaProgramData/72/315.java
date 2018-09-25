public class p
{
	public int m;
	public int n;
}

package <missing>;

public class GlobalMembers
{
	public static p[] a = tangible.Arrays.initializeWithDefaultpInstances(20);
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] num = new int[22][22];
		int count = 0;
		int l;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 0; l < 22; l++)
		{
			for (k = 0; k < 22; k++)
			{
				num[l][k] = 0;
			}
		}
		for (i = 1; i <= m; i++)
		{
			for (j = 1; j <= n; j++)
			{
				num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1; i <= m; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (num[i][j] >= num[i - 1][j] != 0 && num[i][j] >= num[i][j - 1] != 0 && num[i][j] >= num[i][j + 1] != 0 && num[i][j] >= num[i + 1][j])
				{
					a[count].m = i - 1;
					a[count].n = j - 1;
					count++;
				}
			}
		}
		for (i = 0; i < count; i++)
		{
			System.out.print(a[i].m);
			System.out.print(" ");
			System.out.print(a[i].n);
			System.out.print("\n");
		}
		return 0;
	}

}

