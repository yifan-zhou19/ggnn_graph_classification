package <missing>;

public class GlobalMembers
{
	/******************************
	No 1200012819
	Name ???
	Date 2012-11-10
	*******************************/
	public static int Main()
	{
		int n = 0;
		int x = 0;
		int y = 0;
		int total = 0;
		int[][] Matrix =
		{
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int k = 0; k < n; k++) //?????????
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			for (int i = 0;i < x;i++)
			{
				for (int j = 0; j < y; j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						Matrix[i][j] = Integer.parseInt(tempVar4);
					}
					if (i == 0 || i == x - 1) //?i?0?x-1???????
					{
						total += Matrix[i][j];
					}
					else
					{
						if (j == 0 || j == y - 1) //?j?0?y-1??i??0?x-1??????
						{
							total += Matrix[i][j];
						}
					}
				}
			}
			System.out.printf("%d\n",total);
			total = 0; //?total???
		}
		return 0;
	}
}

