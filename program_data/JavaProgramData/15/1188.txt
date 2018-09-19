package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[1000][1000];
	public static int Main()
	{
		int n;
		int i;
		int j;
		int n1;
		int n2;
		int n3;
		int n4;
		int sum;

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
				if (a[i][j - 1] != 0 && a[i][j] == 0 && a[i][j + 1] == 0 && a[i + 1][j] == 0 && a[i - 1][j] != 0)
				{
					n1 = i;
					n2 = j;
				}
				if (a[i][j - 1] == 0 && a[i][j] == 0 && a[i][j + 1] != 0 && a[i + 1][j] != 0 && a[i - 1][j] == 0)
				{
					n3 = i;
					n4 = j;
				}

			}
		}
		sum = (n3 - n1 + 1) * (n4 - n2 + 1) - 2 * (n3 - n1 + 1) - 2 * (n4 - n2 + 1 - 2);
			System.out.printf("%d",sum);

		return 0;
	}
}

