package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][6];
		int[] b = new int[100];
		int c;
		c = 0;
		for (int i = 0;i <= 100;i++)
		{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][0] = Integer.parseInt(tempVar);
				}
				String tempVar2 = ConsoleInput.scanfRead(" ");
				if (tempVar2 != null)
				{
					a[i][1] = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					a[i][2] = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					a[i][3] = Integer.parseInt(tempVar4);
				}
				String tempVar5 = ConsoleInput.scanfRead(" ");
				if (tempVar5 != null)
				{
					a[i][4] = Integer.parseInt(tempVar5);
				}
				String tempVar6 = ConsoleInput.scanfRead(" ");
				if (tempVar6 != null)
				{
					a[i][5] = Integer.parseInt(tempVar6);
				}
				c = c + 1;
				if (a[i][0] == 0)
				{
							   break;
				}
		}
		for (int i = 0;i <= c - 2;i++)
		{
				b[i] = a[i][5] + 60 * a[i][4] + 3600 * a[i][3] + 3600 * 12 - a[i][2] - 60 * a[i][1] - 3600 * a[i][0];
				System.out.printf("%d\n",b[i]);
		}
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			a[0][0] = Integer.parseInt(tempVar7);
		}
		String tempVar8 = ConsoleInput.scanfRead(" ");
		if (tempVar8 != null)
		{
			a[0][1] = Integer.parseInt(tempVar8);
		}
		String tempVar9 = ConsoleInput.scanfRead(" ");
		if (tempVar9 != null)
		{
			a[0][2] = Integer.parseInt(tempVar9);
		}
		String tempVar10 = ConsoleInput.scanfRead(" ");
		if (tempVar10 != null)
		{
			a[0][3] = Integer.parseInt(tempVar10);
		}
		String tempVar11 = ConsoleInput.scanfRead(" ");
		if (tempVar11 != null)
		{
			a[0][4] = Integer.parseInt(tempVar11);
		}
		String tempVar12 = ConsoleInput.scanfRead(" ");
		if (tempVar12 != null)
		{
			a[0][5] = Integer.parseInt(tempVar12);
		}
		return 0;
	}

}

