package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[8][8];
		int i;
		int j;
		int[] b = new int[8];
		int z = 1;
		int[] c = new int[8];
		int d;
		int e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				if (j == 0)
				{
					b[z] = j;
					c[z] = i;
				}
				if (a[i][j - 1] < a[i][j])
				{
					b[z] = j;
					c[z] = i;
				}
			}
			z++;
		}
		for (z = 1;z <= row;z++)
		{
			d = a[c[z]][b[z]];
			for (i = 0;i < row;i++)
			{
				if (a[i][b[z]] < a[c[z]][b[z]])
				{
					d = a[i][b[z]];
				}
			}
			if (d == a[c[z]][b[z]])
			{
				e = e+1;
				System.out.printf("%d+%d",c[z],b[z]);
			}
		}
		if (e == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

