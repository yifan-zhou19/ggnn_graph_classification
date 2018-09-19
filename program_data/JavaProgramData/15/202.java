package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[] b = new int[100];
		int i;
		int j;
		int n;
		int sum = 0;
		int line = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
				if (a[i][j] == 0)
				{
				b[i]++;
				}
			}
			if (b[i] > 0)
			{
				line++;
			}
			if (b[i] > sum)
			{
				sum = b[i];
			}
		}
		int num = sum * line-2 * line-2 * sum + 4;
		System.out.printf("%d",num);
		return 0;
	}
}

