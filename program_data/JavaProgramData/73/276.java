package <missing>;

public class GlobalMembers
{
	public static int findmax(tangible.RefObject<Integer> p)
	{
		int i;
		int t = 0;
		for (i = 0;i < 5;i++)
		{
			if (*(p.argValue + t) < *(p.argValue + i))
			{
				t = i;
			}
		}
		return (t);
	}
	public static int dmin(int[][] a, int c, int r)
	{
		int i;
		for (i = 0;i < 5;i++)
		{
			if (a[i][c] < a[r][c])
			{
				return 0;
			}
		}
		return 1;
	}
	public static void Main()
	{
		int i;
		int j;
		int[][] a = new int[5][5];
		int[] b = new int[5];
		int k = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			if (dmin(a, b[i] = findmax(a[i]), i) != 0)
			{
				System.out.printf("%d %d %d",i + 1,b[i] + 1,a[i][b[i]]);
				k++;
			}
		}

		if (k == 0)
		{
			System.out.print("not found");
		}
	}
}

