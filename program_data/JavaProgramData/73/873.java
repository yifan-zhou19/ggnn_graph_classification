package <missing>;

public class GlobalMembers
{
	public static int pfc(Object p1, Object p2)
	{
		return *(int)p2 - (int)p1;
	}

	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int ri;
		int rj;
		int k = 0;
		int[] ai = new int[5];
		int[] aj = new int[5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				ai[j] = 0;
				aj[j] = 0;
			}
			for (j = 0;j < 5;j++)
			{
				ai[j] = a[i][j];
			}
			qsort(ai,5,(Integer.SIZE / Byte.SIZE),pfc);
			for (j = 0;j < 5;j++)
			{
				if (a[i][j] == ai[0])
				{
						ri = i;
						rj = j;
				}
			}
			for (j = 0;j < 5;j++)
			{
				aj[j] = a[j][rj];
			}
			qsort(aj,5,(Integer.SIZE / Byte.SIZE),pfc);
			if (a[ri][rj] == aj[4])
			{
				System.out.printf("%d %d %d",ri + 1,rj + 1,a[ri][rj]);
				k = 1;
				return 0;
			}
		}
		if (k == 0)
		{
			System.out.print("not found");
		}
	}

}

