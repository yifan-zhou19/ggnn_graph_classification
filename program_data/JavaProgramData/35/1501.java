package <missing>;

public class GlobalMembers
{
	public static int[][] sz = new int[8][8];
	public static int Main()
	{
		int a;
		int b;
		int row;
		int row1;
		int col;
		int e;
		int t;
		int s;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (row = 0;row < a;row++)
		{
			for (col = 0;col < b;col++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[row][col] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (row = 0;row < a;row++)
		{ //11
	//		printf("row= %d\n",row);
			e = sz[row][0];
			t = 0;
			s = row;
			for (col = 0;col < b;col++)
			{ //12
					if (e < sz[row][col])
					{
					e = sz[row][col];
					t = col;
					}
			}
			for (row1 = 0;row1 < a;row1++)
			{
	//			printf("row1=%d\n",row1);
				if (e > sz[row1][t])
				{
					break;
				}
				else if (row1 == a - 1)
				{
					System.out.printf("%d+%d",s,t);
					m = 1;
				}
			}
			if (m == 1)
			{
				break;
			}
			else if (m == 0 && row == a - 1)
			{
				System.out.print("No");
			}
		}
		return 0;
	}



}

