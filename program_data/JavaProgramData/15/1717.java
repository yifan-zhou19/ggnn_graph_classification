package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s = 0;
		int u;
		int[][] image = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int row = 0;row < n;row++)
		{
			for (int col = 0;col < n;col++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					(image[row][col]) = Integer.parseInt(tempVar2);
				}
			}
		}
		for (int i = 0;i < n;i++)
		{
			int k = 0;
			for (int j = 0;j < n;j++)
			{
				if (image[i][j] == 0)
				{
	//				printf("%d %d\n",row2,col2);
					k++;
				}
			}
			if (k > 0)
			{
				u = k;
				s++;
			}

		}
		int m = (u - 2) * (s - 2);
		System.out.printf("%d",m);
		return 0;
	}
}

