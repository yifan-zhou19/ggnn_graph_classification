package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int d = 1;
		int count = 0;
		int[][] f = new int[110][110];
		int[][] vis = new int[110][110];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(vis,0,(Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= row;i++)
		{
			for (j = 1;j <= col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					f[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		/*for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				printf("f=%d\n",f[i][j]);
			}
		}*/
		i = 1;
		j = 1;
		for (;;)
		{
			System.out.printf("%d\n",f[i][j]);
			count++;
			if (count >= row * col)
			{
				break;
			}
			vis[i][j] = 1;
			if (d == 1)
			{
				if ((j + 1 > col) || vis[i][j + 1] != 0)
				{
					d = 2;
					i++;
					continue;
				}
				else
				{
					j++;
				}
			}
			if (d == 2)
			{
				if ((i + 1 > row) || vis[i + 1][j] != 0)
				{
					d = 3;
					j--;
					continue;
				}
				else
				{
					i++;
				}
			}
			if (d == 3)
			{
				if ((j < 2) || vis[i][j - 1] != 0)
				{
					d = 4;
					i--;
					continue;
				}
				else
				{
					j--;
				}
			}
			if (d == 4)
			{
				if ((i < 1) || vis[i - 1][j] != 0)
				{
					d = 1;
					j++;
					continue;
				}
				else
				{
					i--;
				}
			}

		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			i = Integer.parseInt(tempVar4);
		}

		return 0;
	}
}

