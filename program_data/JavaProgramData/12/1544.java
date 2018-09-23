package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int i = 0;
		int j = 0;
		int n = 0;
		int[] l = new int[100];
		int d;
		int[] N = new int[100];
		do
		{
			j = 0;
			do
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
				j++;
			} while (a[i][j - 1] != 0 && a[i][j - 1] != -1);
			l[i] = j - 1;
			i++;
		} while (a[i - 1][j - 1] != -1);
		n = i - 1;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < l[i];j++)
			{
				for (d = j;d < l[i];d++)
				{
					if (a[i][d] == 2 * a[i][j] || a[i][j] == 2 * a[i][d])
					{
						N[i]++;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",N[i]);
		}
		return 0;
	}
}

