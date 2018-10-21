package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h;
		int l;
		int i;
		int k;
		int n;
		int hsx;
		int hxx = 0;
		int lsx;
		int lxx = 0;
		int[][] shu = new int[100][100];
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
			for (k = 0;k < l;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(shu[i][k]) = Integer.parseInt(tempVar3);
				}
			}
		}
		hsx = h - 1;
		lsx = l - 1;
		for (n = 0;(hsx > hxx) && (lsx > lxx);n++)
		{
			for (k = lxx;k < lsx;k++)
			{
				System.out.printf("%d\n",shu[hxx][k]);
			}
			for (i = hxx;i < hsx;i++)
			{
				System.out.printf("%d\n",shu[i][lsx]);
			}
			for (k = lsx;k > lxx;k--)
			{
				System.out.printf("%d\n",shu[hsx][k]);
			}
			for (i = hsx;i > hxx;i--)
			{
				System.out.printf("%d\n",shu[i][lxx]);
			}
			hsx--;
			hxx++;
			lsx--;
			lxx++;
		}
			if ((hxx == hsx) && (lsx > lxx))
			{
				for (k = lxx;k <= lsx;k++)
				{
					System.out.printf("%d\n",shu[hxx][k]);
				}
			}
			else if ((lxx == lsx) && (hsx > hxx))
			{
				for (i = hxx;i <= hsx;i++)
				{
					System.out.printf("%d\n",shu[i][lxx]);
				}
			}
			else if ((hsx == hxx) && (lsx == lxx))
			{
				System.out.printf("%d",shu[hxx][lxx]);
			}

		return 0;
	}

}

