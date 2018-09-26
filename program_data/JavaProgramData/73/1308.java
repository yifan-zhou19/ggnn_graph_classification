package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sign;
		int sg;
		int max;
		int[][] a = new int[10][10];
		int[] maxline = new int[10];

		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 1;i <= 5;i++)
		{
			max = 1;
			for (j = 2;j <= 5;j++)
			{
				if (a[i][j] > a[i][max])
				{
					max = j;
				}
			}
			maxline[i] = max;
		}
		sg = 0;
		for (i = 1;i <= 5;i++)
		{
			sign = 1;
			for (j = 1;j <= 5;j++)
			{
				if (a[j][maxline[i]] < a[i][maxline[i]])
				{
					sign = 0;
				}
			}
			if (sign == 1)
			{
				System.out.printf("%d %d %d",i,maxline[i],a[i][maxline[i]]);
				sg = 1;
			}
		}
		if (sg == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

