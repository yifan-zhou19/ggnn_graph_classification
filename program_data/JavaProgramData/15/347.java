package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[100][100];
		int p;
		int q;
		int r;
		int s;
		int mj;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0 && a[i][j + 1] == 0 && a[i + 1][j] == 0 && a[i + 1][j + 1] != 0)
				{
					p = j;
					q = i;
				}
				if (a[i][j] == 0 && a[i - 1][j] == 0 && a[i][j - 1] == 0 && a[i - 1][j - 1] != 0)
				{
					r = i;
					s = j;
				}
			}
		}
			mj = (r - p - 1) * (s - q - 1);
			System.out.printf("%d",mj);
			return 0;
	}
}

