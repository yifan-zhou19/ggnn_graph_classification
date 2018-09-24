package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] arr = new int[8][8];
		int h;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		int i;
		int j;
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					arr[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int za;
		int zb;
		int jj;
		int a;
		for (a = 0;a < h;a++)
		{
			int b;
			for (b = 0;b < l;b++)
			{
				int c;
				int js = 0;
				for (c = 0;c < l;c++)
				{
					if (arr[a][b] > arr[a][c])
					{
						js += 1;
					}
				}
				if (js == l - 1)
				{
					int d;
					int js2 = 0;
					for (d = 0;d < h;d++)
					{

						if (arr[a][b] < arr[d][b])
						{
							js2 += 1;
						}
					}
						if (js2 == h - 1)
						{
							za = a;
							zb = b;
							jj = 1;
						}

				}

			}
		}
		if (jj == 1)
		{
			System.out.printf("%d+%d",za,zb);
		}
		else
		{
			System.out.print("No");
		}
		return 0;
	}
}

