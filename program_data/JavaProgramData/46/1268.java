package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] m = new int[100][100];
		int h;
		int l;
		int i;
		int j;
		int sxh;
		int xxh;
		int zxl;
		int yxl;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
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
					m[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		sxh = 0;
		xxh = h - 1;
		zxl = 0;
		yxl = l - 1;

		if (h % 2 == 0 && l % 2 == 0)
		{
			while (sxh < xxh && zxl < yxl)
			{
				for (i = zxl;i < yxl;i++)
				{
					System.out.printf("%d\n",m[sxh][i]);
				}
				for (i = sxh;i < xxh;i++)
				{
					System.out.printf("%d\n",m[i][yxl]);
				}
				for (i = yxl;i > zxl;i--)
				{
					System.out.printf("%d\n",m[xxh][i]);
				}
				for (i = xxh;i > sxh;i--)
				{
					System.out.printf("%d\n",m[i][zxl]);
				}
				sxh++;
				xxh--;
				zxl++;
				yxl--;
			}
		}
		else if ((h % 2 == 1 || l % 2 == 1) && h > l)
		{
			while (sxh < xxh && zxl < yxl)
			{
				for (i = zxl;i < yxl;i++)
				{
					System.out.printf("%d\n",m[sxh][i]);
				}
				for (i = sxh;i < xxh;i++)
				{
					System.out.printf("%d\n",m[i][yxl]);
				}
				for (i = yxl;i > zxl;i--)
				{
					System.out.printf("%d\n",m[xxh][i]);
				}
				for (i = xxh;i > sxh;i--)
				{
					System.out.printf("%d\n",m[i][zxl]);
				}
				sxh++;
				xxh--;
				zxl++;
				yxl--;
			}
			for (i = sxh;i <= xxh;i++)
			{
				System.out.printf("%d\n",m[i][zxl]);
			}
		}
		else if ((h % 2 == 1 || l % 2 == 1) && h <= l)
		{
			while (sxh < xxh && zxl < yxl)
			{
				for (i = zxl;i < yxl;i++)
				{
					System.out.printf("%d\n",m[sxh][i]);
				}
				for (i = sxh;i < xxh;i++)
				{
					System.out.printf("%d\n",m[i][yxl]);
				}
				for (i = yxl;i > zxl;i--)
				{
					System.out.printf("%d\n",m[xxh][i]);
				}
				for (i = xxh;i > sxh;i--)
				{
					System.out.printf("%d\n",m[i][zxl]);
				}
				sxh++;
				xxh--;
				zxl++;
				yxl--;
			}
			for (i = zxl;i <= yxl;i++)
			{
				System.out.printf("%d\n",m[sxh][i]);
			}
		}

		return 0;
	}

}

