package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int tag;
		int row;
		int col;
		int i;
		int j;
		int[][] sz = new int[8][8];
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
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
					(sz[i][j]) = Integer.parseInt(tempVar4);
				}
			}
		}
		int max;
		int dec = 0;
		for (i = 0;i < row;i++)
		{
			max = 0;
			for (j = 0;j < col;j++)
			{
				if (sz[i][j] > sz[i][0])
				{
					max = j;
				}
			}
			tag = 0;
			for (j = 0;j < row;j++)
			{
				if (sz[j][max] < sz[i][max])
				{
					tag = 1;
					break;
				}
			}
			if (tag == 0)
			{
				System.out.printf("%d+%d\n",i,max);
				dec = 1;
			}
		}
		if (dec == 0)
		{
			System.out.print("No");
		}
		return 0;
	}



}

