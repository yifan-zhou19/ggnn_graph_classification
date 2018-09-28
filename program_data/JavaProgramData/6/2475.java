package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			int row;
			int col;
			int j;
			int l;
			int sum = 0;
			int[][] num = new int[100][100];
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				col = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				row = Integer.parseInt(tempVar3);
			}
			for (l = 0;l < col;l++)
			{
				int[] a = num[l];
				for (j = 0;j < row;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a + j = tempVar4;
					}
					if (l == 0 || l == col - 1 || j == 0 || j == row - 1)
					{
						sum = sum + a[j];
					}
				}
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

