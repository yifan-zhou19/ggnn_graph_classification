package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[][] a = new int[8][8];
		int M;
		int N;
		int max;
		int maxj;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			M = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < N;i++)
		{
		 for (j = 0;j < M;j++)
		 {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Integer.parseInt(tempVar3);
			}
		 }
		}
		for (i = 0;i < N;i++)
		{
			max = a[i][0];
			maxj = 0;
			for (j = 0;j < M;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					maxj = j;
				}
			}
			flag = 1;
			for (k = 0;k < N;k++)
			{
				if (max > a[k][maxj])
				{
					flag = 0;
					break;
				}
			}
			if (flag != 0)
			{
					System.out.printf("%d+%d",i,maxj);
					break;
			}
		}
	 if (flag == 0)
	 {
		 System.out.print("No");
	 }
	 return 0;
	}
}

