package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int r;
		int c;
		int i;
		int j;
		int k;
		int[][] a = new int[8][8];

		/* ?????? */
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0; i < r; i++)
		{
			for (j = 0; j < c; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		/* ?????????? */
		for (i = 0; i < r; i++)
		{
			for (j = 0; j < c; j++)
			{
				for (k = 0; k < c; k++)
				{
					if (a[i][k] > a[i][j])
					{
						/* ????????? */
						break;
					}
				}
				if (k < c)
				{
					continue;
				}
				for (k = 0; k < r; k++)
				{
					if (a[k][j] < a[i][j])
					{
						/* ????????? */
						break;
					}
				}
				if (k < r)
				{
					continue;
				}
				/* ???????? */
				System.out.printf("%d+%d", i, j);
				return 0;
			}
		}
		/* ?????????????????? */
		System.out.print("No");
		return 0;
	}

	/* ????????????????? */


	public static int main_e4_2_row()
	{
		int r;
		int c;
		int i;
		int j;
		int k;
		int[][] a = new int[8][8];

		/* ?????? */
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0; i < r; i++)
		{
			for (j = 0; j < c; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		/* ????? */
		for (i = 0; i < r; i++)
		{
			/* ????? */
			j = 0;
			for (k = 1; k < c; k++)
			{
				if (a[i][j] < a[i][k])
				{
					j = k;
				}
			}
			/* ????j????????? */
			for (k = 0; k < r; k++)
			{
				if (a[k][j] < a[i][j])
				{
					/* ?????? */
					break;
				}
			}
			if (k == r)
			{
				/* ???????? */
				System.out.printf("%d+%d", i, j);
				return 0;
			}
		}
		/* ?????????????????? */
		System.out.print("No");
		return 0;
	}

}

