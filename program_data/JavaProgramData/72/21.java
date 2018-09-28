package <missing>;

public class GlobalMembers
{
	public static int[][] mat = new int[22][22];
	public static void Main()
	{
		int l;
		int w;
		int m;
		int n;
		int count;
		count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			l = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = Integer.parseInt(tempVar2);
		}
		for (m = 1;m <= l;m++)
		{
			for (n = 1;n <= w;n++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					mat[m][n] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (m = 1;m <= l;m++)
		{
			for (n = 1;n <= w;n++)
			{

				if (mat[m][n] < mat[m][n - 1])
				{
					count++;
				}
				if (mat[m][n] < mat[m - 1][n])
				{
					count++;
				}
				if (mat[m][n] < mat[m + 1][n])
				{
					count++;
				}
				if (mat[m][n] < mat[m][n + 1])
				{
					count++;
				}
				if (count == 0)
				{
					System.out.printf("%d %d\n", m - 1, n - 1);
				}
				count = 0;
			}
		}
	}
}

