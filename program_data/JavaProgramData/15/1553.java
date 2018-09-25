package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] num = new int[100][100];
		int a1;
		int a2;
		int b1;
		int b2;
		int sum;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					num[i][j] = Integer.parseInt(tempVar2);
				}
				if ((num[i][j] == 255) && (num[i - 1][j] == 0) && (num[i][j - 1] == 0))
				{
					a1 = i;
					b1 = j;
				}
				if ((num[i][j] == 0) && (num[i - 1][j] == 0) && (num[i][j - 1] == 0))
				{
					a2 = i;
					b2 = j;
				}
			}
		}
		sum = (a2 - a1) * (b2 - b1);
		System.out.printf("%d",sum);
		return 0;
	}

}

