package <missing>;

public class GlobalMembers
{
	public static int N;
	public static int M;
	public static int[][] data = new int[10][10];
	public static int[] mincol = new int[10];
	public static int[] maxrow = new int[10];

	public static int Main()
	{
		int i;
		int j;
		int flag = 0;
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
		for (i = 0;i < 10;i++)
		{
			mincol[i] = 2147483647;
			maxrow[i] = -2147483647;
		}

		for (i = 0;i < N;i++)
		{
			for (j = 0;j < M;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					data[i][j] = Integer.parseInt(tempVar3);
				}
				if (data[i][j] < mincol[j])
				{
					mincol[j] = data[i][j];
					//mcpos[j] = i;
				}
				if (data[i][j] > maxrow[i])
				{
					maxrow[i] = data[i][j];
					//mrpos[i] = j;
				}
			}
		}

		/*for (i=0;i<M;i++){
		    printf("%d ",mincol[i]);
		}
		printf("\n");
		for (i=0;i<N;i++){
		    printf("%d ",maxrow[i]);
		}
		printf("\n");
		*/

		for (i = 0;i < N;i++)
		{
			for (j = 0;j < M;j++)
			{
				if (mincol[j] == data[i][j] && maxrow[i] == data[i][j])
				{
					flag = 1;
					System.out.printf("%d+%d\n",i,j);
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("No\n");
		}

		return 0;
	}

}

