package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[][] a = new int[1000][1000];
		int i;
		int j;
		int sum;
		int c = 0;
		int k = 0;
		int r = 0;
		int t = 0;
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
				if (a[i][j] == 0 && a[i][j - 1] == 255 && a[i - 1][j] == 255)
				{
				 c = i;
				 k = j;
				}
				if (a[i][j] == 0 && a[i][j - 1] == 0 && a[i - 1][j] == 0)
				{
				 r = i;
				 t = j;
				}
			}
		}

		sum = (r - c - 1) * (t - k - 1);
		System.out.printf("%d\n",sum);
	}
}

