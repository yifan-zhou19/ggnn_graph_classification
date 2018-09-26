package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0][0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0][1] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[0][2] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a[0][3] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			a[0][4] = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			a[1][0] = Integer.parseInt(tempVar6);
		}
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			a[1][1] = Integer.parseInt(tempVar7);
		}
		String tempVar8 = ConsoleInput.scanfRead();
		if (tempVar8 != null)
		{
			a[1][2] = Integer.parseInt(tempVar8);
		}
		String tempVar9 = ConsoleInput.scanfRead();
		if (tempVar9 != null)
		{
			a[1][3] = Integer.parseInt(tempVar9);
		}
		String tempVar10 = ConsoleInput.scanfRead();
		if (tempVar10 != null)
		{
			a[1][4] = Integer.parseInt(tempVar10);
		}
		String tempVar11 = ConsoleInput.scanfRead();
		if (tempVar11 != null)
		{
			a[2][0] = Integer.parseInt(tempVar11);
		}
		String tempVar12 = ConsoleInput.scanfRead();
		if (tempVar12 != null)
		{
			a[2][1] = Integer.parseInt(tempVar12);
		}
		String tempVar13 = ConsoleInput.scanfRead();
		if (tempVar13 != null)
		{
			a[2][2] = Integer.parseInt(tempVar13);
		}
		String tempVar14 = ConsoleInput.scanfRead();
		if (tempVar14 != null)
		{
			a[2][3] = Integer.parseInt(tempVar14);
		}
		String tempVar15 = ConsoleInput.scanfRead();
		if (tempVar15 != null)
		{
			a[2][4] = Integer.parseInt(tempVar15);
		}
		String tempVar16 = ConsoleInput.scanfRead();
		if (tempVar16 != null)
		{
			a[3][0] = Integer.parseInt(tempVar16);
		}
		String tempVar17 = ConsoleInput.scanfRead();
		if (tempVar17 != null)
		{
			a[3][1] = Integer.parseInt(tempVar17);
		}
		String tempVar18 = ConsoleInput.scanfRead();
		if (tempVar18 != null)
		{
			a[3][2] = Integer.parseInt(tempVar18);
		}
		String tempVar19 = ConsoleInput.scanfRead();
		if (tempVar19 != null)
		{
			a[3][3] = Integer.parseInt(tempVar19);
		}
		String tempVar20 = ConsoleInput.scanfRead();
		if (tempVar20 != null)
		{
			a[3][4] = Integer.parseInt(tempVar20);
		}
		String tempVar21 = ConsoleInput.scanfRead();
		if (tempVar21 != null)
		{
			a[4][0] = Integer.parseInt(tempVar21);
		}
		String tempVar22 = ConsoleInput.scanfRead();
		if (tempVar22 != null)
		{
			a[4][1] = Integer.parseInt(tempVar22);
		}
		String tempVar23 = ConsoleInput.scanfRead();
		if (tempVar23 != null)
		{
			a[4][2] = Integer.parseInt(tempVar23);
		}
		String tempVar24 = ConsoleInput.scanfRead();
		if (tempVar24 != null)
		{
			a[4][3] = Integer.parseInt(tempVar24);
		}
		String tempVar25 = ConsoleInput.scanfRead();
		if (tempVar25 != null)
		{
			a[4][4] = Integer.parseInt(tempVar25);
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (a[i][j] >= a[i][0] != 0 && a[i][j] >= a[i][1] != 0 && a[i][j] >= a[i][2] != 0 && a[i][j] >= a[i][3] != 0 && a[i][j] >= a[i][4])
				{
					if (a[i][j] <= a[0][j] != 0 && a[i][j] <= a[1][j] != 0 && a[i][j] <= a[2][j] != 0 && a[i][j] <= a[3][j] != 0 && a[i][j] <= a[4][j])
					{
						System.out.printf("%d %d %d",i + 1,j + 1,a[i][j]);
						f = 1;
					}
				}
			}
		}
		if (f == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}


}

