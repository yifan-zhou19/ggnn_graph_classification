package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int h;
		int l;
		int[][] x = new int[8][8];
		int H;
		int J;
		int t;
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
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		t = 0;
		for (i = 0;i < h;i++)
		{
			J = 0;
			for (j = 1;j < l;j++)
			{
				if (x[i][J] < x[i][j])
				{
					J = j;
				}
			}
			for (j = 0;j < h;j++)
			{
				if (x[j][J] < x[i][J])
				{
					break;
				}
				if (j == h - 1)
				{
					t = 1;
					H = i;
				}
			}
		}
		if (t == 1)
		{
			System.out.printf("%d+%d",H,J);
		}
		else
		{
			System.out.print("No");
		}
		return 0;
	}

}

