package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int x3;
		int y3;
		int i;
		int j;
		int k;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		char m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y1 = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(null, 1);
				if (tempVar4 != null)
				{
					m = tempVar4.charAt(0);
				}
			if (m != ' ')
			{
			break;
			}
			else
			{
				;
			}
			}

		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			x2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			y2 = Integer.parseInt(tempVar6);
		}
		for (i = 0;i < x2;i++)
		{
			for (j = 0;j < y2;j++)
			{
				String tempVar7 = ConsoleInput.scanfRead();
				if (tempVar7 != null)
				{
					b[i][j] = Integer.parseInt(tempVar7);
				}
				String tempVar8 = ConsoleInput.scanfRead(null, 1);
				if (tempVar8 != null)
				{
					m = tempVar8.charAt(0);
				}
			if (m != ' ')
			{
			break;
			}
			else
			{
				;
			}
			}

		}

		x3 = x1;
		y3 = y2;

		for (i = 0;i < x3;i++)
		{
			for (j = 0;j < y3;j++)
			{

				for (k = 0;k < y1;k++)
				{
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		for (i = 0;i < x3;i++)
		{
			for (j = 0;j < y3 - 1;j++)
			{
			System.out.printf("%d ",c[i][j]);
			}
			System.out.printf("%d\n",c[i][y3 - 1]);
		}



	}
}

