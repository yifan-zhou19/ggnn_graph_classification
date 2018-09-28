package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int row;
		int col;
		int[][] sz = new int[10][10];
		int[][] sz2 = new int[10][10];
		int[][] sz3 = new int[10][10];
		int e;
		int s;
		int a = 0;
		char x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			x = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			col = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar4);
				}
			}
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
			sz2[i][j] = sz[i][j];
			sz3[i][j] = sz[i][j];
			}
		}

		for (i = 0;i < row;i++)
		{
				  for (s = 0;s < col - 1;s++)
				  {
					   if (sz2[i][s] > sz2[i][s + 1])
					   {
						e = sz2[i][s + 1];
						sz2[i][s + 1] = sz2[i][s];
						sz2[i][s] = e;
					   }
				  }

		}
		for (j = 0;j < col;j++)
		{
				  for (s = 0;s < row - 1;s++)
				  {
					   if (sz3[s][j] < sz3[s + 1][j])
					   {
						e = sz3[s + 1][j];
						sz3[s + 1][j] = sz3[s][j];
						sz3[s][j] = e;
					   }
				  }

		}

		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				if ((sz[i][j] == sz2[i][col - 1]) && (sz[i][j] == sz3[row - 1][j]))
				{
					   System.out.printf("%d+%d",i,j);
							a++;
				}
				else
				{
					continue;
				}
			}
		}

			if (a == 0)
			{
			   System.out.print("No");
			}


		return 0;
	}

}

